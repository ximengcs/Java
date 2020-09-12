package event;

import java.util.EventObject;

import model.Shape;

public class ShapeDownEvent extends EventObject {

	private Shape shape;
	
	public ShapeDownEvent( Object source, Shape shape ) {
		super(source);
		this.shape = shape;
	}
}
