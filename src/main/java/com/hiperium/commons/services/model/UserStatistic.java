/**
 * Product  : Hiperium Project
 * Architect: Andres Solorzano.
 * Created  : 08-05-2009 - 23:30:00
 * 
 * The contents of this file are copyrighted by Andres Solorzano 
 * and it is protected by the license: "GPL V3." You can find a copy of this 
 * license at: http://www.hiperium.com/about/licence.html
 * 
 * Copyright 2014 Andres Solorzano. All rights reserved.
 * 
 */
package com.hiperium.commons.services.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * This class represents the user authentication and security statistics.
 * 
 * @author Andres Solorzano.
 */
public class UserStatistic implements Serializable {

	/**
	 * The property serialVersionUID.
	 */
	private static final long serialVersionUID = -3911870637537758701L;

	/** The property userId. */
	@Min(value = 1L)
	private Long userId;

	/** The property lastPasswordChange. */
	@NotNull
	private Date lastPasswordChange;

	/** The property failedAttempts. */
	@NotNull
	private Integer failedAttempts;

	/** The property lastFailedAttempts. */
	@NotNull
	private Integer lastFailedAttempts;

	/**
	 * Default Constructor.
	 */
	public UserStatistic() {
		// Nothing to do.
	}

	/**
	 * Get the userId property.
	 * 
	 * @return the userId property.
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * Set the userId property.
	 * 
	 * @param userId
	 *            the userId to set.
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * Get the lastPasswordChange property.
	 * 
	 * @return the lastPasswordChange property.
	 */
	public Date getLastPasswordChange() {
		return lastPasswordChange;
	}

	/**
	 * Set the lastPasswordChange property.
	 * 
	 * @param lastPasswordChange
	 *            the lastPasswordChange to set.
	 */
	public void setLastPasswordChange(Date lastPasswordChange) {
		this.lastPasswordChange = lastPasswordChange;
	}

	/**
	 * Get the failedAttempts property.
	 * 
	 * @return the failedAttempts property.
	 */
	public Integer getFailedAttempts() {
		return failedAttempts;
	}

	/**
	 * Set the failedAttempts property.
	 * 
	 * @param failedAttempts
	 *            the failedAttempts to set.
	 */
	public void setFailedAttempts(Integer failedAttempts) {
		this.failedAttempts = failedAttempts;
	}

	/**
	 * Get the lastFailedAttempts property.
	 * 
	 * @return the lastFailedAttempts property.
	 */
	public Integer getLastFailedAttempts() {
		return lastFailedAttempts;
	}

	/**
	 * Set the lastFailedAttempts property.
	 * 
	 * @param lastFailedAttempts
	 *            the lastFailedAttempts to set.
	 */
	public void setLastFailedAttempts(Integer lastFailedAttempts) {
		this.lastFailedAttempts = lastFailedAttempts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserStatistic other = (UserStatistic) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserStatistic [userId=" + userId + ", lastPasswordChange="
				+ lastPasswordChange + ", failedAttempts=" + failedAttempts
				+ ", lastFailedAttempts=" + lastFailedAttempts + "]";
	}

}
