package com.MiniReddit.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Vote {
	@EmbeddedId

	public VoteId getPk() {
		return pk;
	}

	public void setPk(VoteId pk) {
		this.pk = pk;
	}

	private Boolean upvote;
	private VoteId pk;

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
}
