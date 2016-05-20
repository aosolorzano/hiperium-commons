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
import java.util.UUID;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.hiperium.commons.services.EnumAccessChannel;
import com.hiperium.commons.services.EnumAuthenticationResult;

/**
 * This class represents the user session register in every login or access
 * count in the application.
 * 
 * @author Andres Solorzano
 */
public class SessionRegister implements Serializable {

	/** The property serialVersionUID. */
	private static final long serialVersionUID = -7801809487232206319L;

	/** The property id. */
	private UUID id;

	/** The property homeId. */
	private Long homeId;

	/** The property userId. */
	@Min(value = 1L)
	private Long userId;

	/** The property profileId. */
	private Long profileId;

	/** The property tokenId. */
	@NotNull
	private String tokenId;
	
	/** The property loginDate. */
	@NotNull
	private Date loginDate;

	/** The property logoutDate. */
	private Date logoutDate;

	/** The property active. */
	@NotNull
	private Boolean active;

	/** The property ipConnection. */
	@NotNull
	private String ipConnection;

	/** The property userAgent. */
	@NotNull
	private String userAgent;

	/** The property authenticationResult. */
	@NotNull
	private EnumAuthenticationResult authenticationResult;

	/** The property accessChannel. */
	@NotNull
	private EnumAccessChannel accessChannel;

	/**
	 * Default Constructor.
	 */
	public SessionRegister() {
		// Nothing to do.
	}

	/**
	 * Gets the id property.
	 * 
	 * @return the id property.
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * Sets the id property.
	 * 
	 * @param id
	 *            the variable id to be assigned.
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	/**
	 * Get the homeId property.
	 * 
	 * @return the homeId property.
	 */
	public Long getHomeId() {
		return homeId;
	}

	/**
	 * Set the homeId property.
	 * 
	 * @param homeId
	 *            the homeId to set.
	 */
	public void setHomeId(Long homeId) {
		this.homeId = homeId;
	}

	/**
	 * Get the profileId property.
	 * 
	 * @return the profileId property.
	 */
	public Long getProfileId() {
		return profileId;
	}

	/**
	 * Set the profileId property.
	 * 
	 * @param profileId
	 *            the profileId to set.
	 */
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	/**
	 * Gets the loginDate property.
	 * 
	 * @return the loginDate property.
	 */
	public Date getLoginDate() {
		return loginDate;
	}

	/**
	 * Sets the loginDate property.
	 * 
	 * @param loginDate
	 *            the variable loginDate to be assigned.
	 */
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	/**
	 * Gets the logoutDate property.
	 * 
	 * @return the logoutDate property.
	 */
	public Date getLogoutDate() {
		return logoutDate;
	}

	/**
	 * Sets the logoutDate property.
	 * 
	 * @param logoutDate
	 *            the variable logoutDate to be assigned.
	 */
	public void setLogoutDate(Date logoutDate) {
		this.logoutDate = logoutDate;
	}

	/**
	 * Gets the active property.
	 * @return the active.
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * Sets the active property.
	 * @param active the active to set.
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Gets the ipConnection property.
	 * 
	 * @return the ipConnection property.
	 */
	public String getIpConnection() {
		return ipConnection;
	}

	/**
	 * Sets the ipConnection property.
	 * 
	 * @param ipConnection
	 *            the variable ipConnection to be assigned.
	 */
	public void setIpConnection(String ipConnection) {
		this.ipConnection = ipConnection;
	}

	/**
	 * Gets the userAgent property.
	 * 
	 * @return the userAgent property.
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * Sets the userAgent property.
	 * 
	 * @param userAgent
	 *            the variable userAgent to be assigned.
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**
	 * Gets the accessChannel property.
	 * 
	 * @return the accessChannel property.
	 */
	public EnumAccessChannel getAccessChannel() {
		return accessChannel;
	}

	/**
	 * Sets the accessChannel property.
	 * 
	 * @param accessChannel
	 *            the variable accessChannel to be assigned.
	 */
	public void setAccessChannel(EnumAccessChannel accessChannel) {
		this.accessChannel = accessChannel;
	}

	/**
	 * Gets the authenticationResult property.
	 * 
	 * @return the authenticationResult property.
	 */
	public EnumAuthenticationResult getAuthenticationResult() {
		return authenticationResult;
	}

	/**
	 * Sets the authenticationResult property.
	 *
	 * @param authenticationResult
	 *            the variable authenticationResult to be assigned.
	 */
	public void setAuthenticationResult(EnumAuthenticationResult authenticationResult) {
		this.authenticationResult = authenticationResult;
	}

	/**
	 *
	 * @return
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 *
	 * @param userId
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 *
	 * @return
	 */
	public String getTokenId() {
		return tokenId;
	}

	/**
	 *
	 * @param tokenId
	 */
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		SessionRegister other = (SessionRegister) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SessionRegister [id=" + id + ", homeId=" + homeId
				+ ", profileId=" + profileId + ", loginDate=" + loginDate
				+ ", logoutDate=" + logoutDate + ", active="
				+ active + ", ipConnection=" + ipConnection
				+ ", userAgent=" + userAgent + ", authenticationResult="
				+ authenticationResult + ", accessChannel=" + accessChannel
				+ "]";
	}

}
