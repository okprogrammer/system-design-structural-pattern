package com.design.pattern.structural.proxy;

//Factory toi get image objects
public class ImageFactory {

	// We'll provide proxy to call instead of real object
	public static Image getImage(String name) {
		return new ImageProxy(name);
	}

}
