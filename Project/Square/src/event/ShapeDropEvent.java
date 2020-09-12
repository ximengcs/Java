package event;

import java.util.EventObject;

import model.Shape;

public class ShapeDropEvent extends EventObject  {

	private Shape shape;
	
	public ShapeDropEvent( Object source, Shape shape ) {
		super(source);
		this.shape = shape;
	}
}
