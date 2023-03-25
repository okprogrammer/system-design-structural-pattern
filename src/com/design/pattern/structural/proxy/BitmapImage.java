package com.design.pattern.structural.proxy;

//our concrete class providing actual functionality
public class BitmapImage implements Image {

	private Point2D location;
	private String name;

	public BitmapImage(String filenmae) {
		// Loads image from file on disk
		System.out.println("Loaded from disk: " + filenmae);
		this.name = filenmae;
	}

	@Override
	public void setLocation(Point2D point2d) {
		location = point2d;
	}

	@Override
	public Point2D getLocation() {
		return location;
	}

	@Override
	public void render() {
		System.out.println("Rendered " + this.name);
	}

}
