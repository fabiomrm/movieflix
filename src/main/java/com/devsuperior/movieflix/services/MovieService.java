package com.devsuperior.movieflix.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.dto.MovieMinDTO;
import com.devsuperior.movieflix.dto.MovieWithReviewDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;

	@Transactional(readOnly = true)
	public Page<MovieMinDTO> findAllPaged(Long genreId, Pageable pageable) {
		genreId = genreId == 0 ? null : genreId;
		Page<Movie> page = repository.findMovies(genreId, pageable);

		return page.map(x -> new MovieMinDTO(x));

	}

	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Optional<Movie> obj = repository.findById(id);
		Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException("Movie not found"));

		return new MovieDTO(entity, entity.getGenre());
	}

	@Transactional(readOnly = true)
	public List<ReviewDTO> findMovieReviews(Long id) {
		Optional<Movie> obj = repository.findById(id);
		Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException("Movie not found"));

		return entity.getReviews().stream().map(x -> new ReviewDTO(x)).collect(Collectors.toList());

	}
}
