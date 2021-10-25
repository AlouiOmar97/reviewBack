package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Review implements Serializable {
	
	private static final long serialVersionUID = -1396669830860400871L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int idp;
	
	private String name;
	
	//@Column(unique=true)
	private String content;

	private boolean isActif;
	
	@Enumerated(EnumType.STRING)
	//@NotNull
	private Rating rating;
	

	
	
	public Review() {
		super();
	}
	
	public Review(String name, int idp, String content, boolean isActif, Rating rating) {
		this.name = name;
		this.idp = idp;
		this.content = content;
		this.isActif = isActif;
		this.rating = rating;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTitle() {
		return idp;
	}

	public void setTitle(int idp) {
		this.idp = idp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	
	
	
}
