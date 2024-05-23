package com.MiniReddit.domain;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
@Embeddable
public class CommentId implements Serializable {
private static final long serialVersionUID = 1L;
private Users user;
@ManyToOne
public Users getUser() {
	return user;
}
public void setUser(Users user) {
	this.user = user;
}
@ManyToOne

public Feature getFeature() {
	return feature;
}
public void setFeature(Feature feature) {
	this.feature = feature;
}
private Feature feature;
}
