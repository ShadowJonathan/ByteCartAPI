package com.github.catageek.ByteCartAPI;

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
}
