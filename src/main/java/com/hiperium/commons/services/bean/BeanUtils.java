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
package com.hiperium.commons.services.bean;

import java.io.Serializable;
import java.util.Date;

import com.hiperium.commons.services.logger.HiperiumLogger;

/**
 * 
 * @author Andres Solorzano
 * 
 */
public final class BeanUtils implements Serializable {

	/** */
	private static final long serialVersionUID = 960317857518206792L;
	
	/** The LOGGER property for logger messages. */
	private static final HiperiumLogger LOGGER = HiperiumLogger.getLogger(BeanUtils.class);

	/**
	 * Used to initialize the bean utils bean to avoid NPE coping null values. 
	 */
	static {
		LOGGER.debug("Initialize Hiperium Bean Utils Static class");
		org.apache.commons.beanutils.BeanUtilsBean.getInstance().getConvertUtils().register(false, false, 0);
	}
	
	/**
	 * Copy the origin object properties over the destination object properties.
	 * @param orig the origin or source object.
	 * @param dest the destination copy object
	 * @throws Exception
	 */
	public static void copyProperties(Object orig, Object dest) throws Exception {
		org.apache.commons.beanutils.BeanUtils.copyProperties(dest, orig);
	}
	
	/**
	 * 
	 * @return
	 */
	public static java.util.UUID uuidForDate(Date d) {
		/*
		 * Magic number obtained from #cassandra's thobbs, who claims to have
		 * stolen it from a Python library.
		 */
		final long NUM_100NS_INTERVALS_SINCE_UUID_EPOCH = 0x01b21dd213814000L;

		long origTime = d.getTime();
		long time = origTime * 10000 + NUM_100NS_INTERVALS_SINCE_UUID_EPOCH;
		long timeLow = time & 0xffffffffL;
		long timeMid = time & 0xffff00000000L;
		long timeHi = time & 0xfff000000000000L;
		long upperLong = (timeLow << 32) | (timeMid >> 16) | (1 << 12) | (timeHi >> 48);
		return new java.util.UUID(upperLong, 0xC000000000000000L);
	}

}
