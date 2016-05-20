/**
 * Open Source Solutions Corp.
 * Product: Hiperium
 * Created: 12-Mar-2011 - 00:00:00
 * 
 * 
 * The contents of this file are copyrighted by Open Source Solutions Corp. 
 * and it is protected by the license: "GPL V3." You can find a copy of this 
 * license at: http://www.aldebaran-solutions.com
 * 
 * Copyright 2011 Open Source Solutions Corp. All rights reserved.
 * 
 */
package com.hiperium.commons.services.vo;

import java.io.Serializable;

import com.hiperium.commons.services.EnumAccessChannel;

/**
 * This class represents the object that pass audit info to the JPA methods to
 * manage the audit.
 * 
 * @author Andres Solorzano
 * 
 */
public class UserSessionVO implements Serializable {

	/**
	 * The property serialVersionUID.
	 */
	private static final long serialVersionUID = -7758084850871441169L;

	/** */
	private final Long userId;
	/** */
	private final Long homeId;
	/** */
	private final Long profileId;
	/** */
	private final String ipConnection;
	/** */
	private final String sessionId;
	/** */
	private final EnumAccessChannel accessChannel;

	/**
	 * 
	 * Class constructor.
	 * 
	 * @param homeId
	 * @param profileId
	 * @param ipConnection
	 * @param accessChannel
	 * @param sessionId
	 */
	public UserSessionVO(Long userId, Long homeId, Long profileId,
			String ipConnection, EnumAccessChannel accessChannel,
			String sessionId) {
		this.userId = userId;
		this.homeId = homeId;
		this.profileId = profileId;
		this.ipConnection = ipConnection;
		this.accessChannel = accessChannel;
		this.sessionId = sessionId;
	}

	/**
	 * Gets the homeId property.
	 * 
	 * @return the homeId property.
	 */
	public Long getHomeId() {
		return homeId;
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
	 * Gets the ipConnection property.
	 * 
	 * @return the ipConnection property.
	 */
	public String getIpConnection() {
		return ipConnection;
	}

	/**
	 * Gets the userId property.
	 * 
	 * @return the userId property.
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * Gets the profileId property.
	 * 
	 * @return the profileId property.
	 */
	public Long getProfileId() {
		return profileId;
	}

	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SessionAuditVO [userId=" + userId + ", homeId=" + homeId
				+ ", profileId=" + profileId + ", ipConnection=" + ipConnection
				+ ", accessChannel=" + accessChannel + "]";
	}

}
