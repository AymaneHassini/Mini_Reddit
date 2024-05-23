package com.MiniReddit.domain;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

@Embeddable
public class VoteId implements Serializable {
private static final long serialVersionUID = 9148694321340428396L;
private Users user;
private Feature feature;
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
}
