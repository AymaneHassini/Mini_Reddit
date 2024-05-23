package com.MiniReddit.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feature {
	
private Long id;
private String description;
private String name;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
}
