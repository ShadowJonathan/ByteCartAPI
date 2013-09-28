package com.github.catageek.ByteCartAPI;

import java.util.logging.Logger;

import com.github.catageek.ByteCartAPI.AddressLayer.Resolver;


public interface ByteCartPlugin {
	/**
	 * @return the resolver registered
	 */
	public Resolver getResolver();
	
	/**
	 * Set the resolver that will be used
	 * 
	 * @param resolver the resolver provided
	 */
	public void setResolver(Resolver resolver);
	
	/**
	 * Get the logger
	 * 
	 * @return the logger
	 */
	public Logger getLog();
}
