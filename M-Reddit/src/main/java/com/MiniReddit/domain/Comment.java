package com.MiniReddit.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Comment {
private String text;


private CommentId pk;
@Column(length=5000)
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
@EmbeddedId
public CommentId getPk() {
	return pk;
}
public void setPk(CommentId pk) {
	this.pk = pk;
}
}
