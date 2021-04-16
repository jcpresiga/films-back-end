package co.edu.iudigital.app.service.iface;

import java.util.List;

import co.edu.iudigital.app.model.entity.Movie;

public interface MovieService {

	/**
	 * Obtener todas las peliculas
	 * @return
	 */
	public List<Movie> getAll();
	
	/**
	 * Crear una pelicula
	 * @param movie
	 */
	public void create(Movie movie);
	
	/**
	 * Edita una pelicula por su Id
	 * @param movie
	 * @param movieId
	 */
	public void edit(Movie movie, int movieId);
	
	/**
	 * Borra una pelicula por su Id
	 * @param movieId
	 */
	public void delete(int movieId);
	
	/**
	 * Califica una pelicula
	 * @param movie
	 * @param movieId
	 */
	public void rate(Movie movie, int movieId);
}
