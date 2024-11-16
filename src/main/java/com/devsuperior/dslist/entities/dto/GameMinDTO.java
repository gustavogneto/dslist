package com.devsuperior.dslist.entities.dto;

import java.util.Objects;

import com.devsuperior.dslist.entities.Game;

import jakarta.persistence.Column;

public class GameMinDTO {

	private long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {
		super();
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, imgUrl, shortDescription, title, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameMinDTO other = (GameMinDTO) obj;
		return id == other.id && Objects.equals(imgUrl, other.imgUrl)
				&& Objects.equals(shortDescription, other.shortDescription) && Objects.equals(title, other.title)
				&& Objects.equals(year, other.year);
	}
	
}
