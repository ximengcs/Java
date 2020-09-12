package model;

import java.util.ArrayList;

import listener.ShapeDownListener;
import listener.ShapeDropListener;

public class Container {

	private Shape shape;
	
	private ArrayList<Point> pointList;
	
	private ShapeDownListener shapeDownListener;
	
	private ShapeDropListener shapeDropListener;
	
	public void init() {
		
	}
	
	public void addShapeDownListener( ShapeDownListener shapeDownListener ) {
		this.shapeDownListener = shapeDownListener;
	}
	
	public void addShapeDropListener( ShapeDropListener shapeDropListener ) {
		this.shapeDropListener = shapeDropListener;
	}
}