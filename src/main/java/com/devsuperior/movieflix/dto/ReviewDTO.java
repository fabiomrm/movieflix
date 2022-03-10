package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String text;
	private Long movieId;

	private UserMinDTO author;

	public ReviewDTO() {
	}

	public ReviewDTO(Long id, String text, Long movieId, UserMinDTO author) {
		this.id = id;
		this.text = text;
		this.movieId = movieId;
		this.author = author;
	}

	public ReviewDTO(Review entity) {
		id = entity.getId();
		text = entity.getText();
		movieId = entity.getMovie().getId();
		author = new UserMinDTO(entity.getUser());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public UserMinDTO getAuthor() {
		return author;
	}

	public void setAuthor(UserMinDTO author) {
		this.author = author;
	}

}
