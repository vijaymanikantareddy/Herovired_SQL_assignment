const api_key = "3fd2be6f0c70a2a598f084ddfb75487c";

const searchMovie = document.getElementById("searchMovie");
const searchClick = document.getElementById("searchClick");
const movies = document.querySelector(".movies");

function movieFetching(url) {
  fetch(url)
    .then((response) => response.json())
    .then((data) => {
      movies.innerHTML = "";
      data.results.forEach((movie) => {
        const movieElement = document.createElement("div");
        movieElement.classList.add("movie");

        const movieImage = document.createElement("img");
        movieImage.src = `https://image.tmdb.org/t/p/w500${movie.poster_path}`;
        movieElement.appendChild(movieImage);

        const movieOverlay = document.createElement("div");
        movieOverlay.classList.add("overlay");
        movieOverlay.innerHTML = `
          <h2>${movie.title}</h2>
          <p>${movie.overview}</p>
          <p>Rating: ${movie.vote_average}/10</p>
        `;
        movieElement.appendChild(movieOverlay);

        movies.appendChild(movieElement);
      });
    })
    .catch((error) => console.log(error));
}

movieFetching(
  "https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=" +
    api_key +
    "&page=1"
);

searchClick.addEventListener("click", () => {
  const query = searchMovie.value;

  const url =
    "https://api.themoviedb.org/3/search/movie?api_key=" +
    api_key +
    "&query=" +
    query;
  movieFetching(url);
});
