<h1 align="center">MOVIEFLIX</h1>

<p align="center">
	Projeto de conclusão da quarta etapa do curso <a href="https://www.linkedin.com/school/devsuperior/">Dev Superior</a>.
</p>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=USER-CITY-EVENT&message=FMRM&color=blueviolet&style=flat-square&logo=ghost"/>
</p>
<h4 align="center"> 
	✔️...Finalizado...✔️
</h4>

### 😊 Objetivo
<p align="left">Estudar validação com Bean Validation, autenticação e autorização:</p>

- Spring Security
- OAuth 2.0
- Token JWT
- Autorização de rotas por perfil

### 📝 Diagrama UML

![image](https://github.com/fabiomrm/movieflix/blob/main/uml.png?raw=true)

### Detalhe de usuário
- MEMBER: Pode avaliar um filme (inserindo um comentário);
- VISITOR: Tem acesso aos recursos, mas não pode inserir avaliação de filme;


### End-points
- [x] POST /oauth/token
```json
{
    "username": "newuser@gmail.com",
    "password": "password"
}
```
- [x] GET /movies/{id}

- [x] GET /movies/{id}/reviews
- [x] GET /movies?genreId=1 (retorna um pageable com todos os filmes, podendo passar o ID de um gênero como parâmetro opcional)
- [x] GET /genres
- [x] POST /reviews
```json
{
    "text" : "Filme muito legal!",
    "movieId" : 1
}
```




### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:
- [Spring](https://spring.io/projects/spring-boot)

### Autor
---
Feito por Fábio Monteiro 👋🏽 Entre em contato!

 [![Linkedin Badge](https://img.shields.io/badge/-fabiomrm-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/fabiomrm/)](https://www.linkedin.com/in/fabiomrm/) 
