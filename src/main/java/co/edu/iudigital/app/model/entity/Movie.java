package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 5082537466072992602L;
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private int MovieId;
	private String name;
	private String description;
	private String image;
	@Column(name = "create_at")
	private LocalDateTime createAt;
	@Column(name = "release_date")
	private LocalDate releaseDate;
	private String actors;
	@ManyToOne
	@JoinColumn(name = "gender_id")
	private Gender genderId;
	private int rating;
	
	public Movie() {
		
	}
	
	/**
	 * @param movieId
	 * @param name
	 * @param description
	 * @param image
	 * @param createAt
	 * @param releaseDate
	 * @param actors
	 * @param genderId
	 * @param rating
	 */
	public Movie(int movieId, String name, String description, String image, LocalDateTime createAt,
			LocalDate releaseDate, String actors, Gender genderId, int rating) {
		super();
		MovieId = movieId;
		this.name = name;
		this.description = description;
		this.image = image;
		this.createAt = createAt;
		this.releaseDate = releaseDate;
		this.actors = actors;
		this.genderId = genderId;
		this.rating = rating;
	}
	//#getter y setter
	/**
	 * @return the movieId
	 */
	public int getMovieId() {
		return MovieId;
	}
	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the createAt
	 */
	public LocalDateTime getCreateAt() {
		return createAt;
	}
	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	/**
	 * @return the releaseDate
	 */
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * @return the actors
	 */
	public String getActors() {
		return actors;
	}
	/**
	 * @param actors the actors to set
	 */
	public void setActors(String actors) {
		this.actors = actors;
	}
	/**
	 * @return the genderId
	 */
	public Gender getGenderId() {
		return genderId;
	}
	/**
	 * @param gender the genderId to set
	 */
	public void setGenderId(Gender gender) {
		this.genderId = gender;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	
	
}
