package listener;

import java.util.EventListener;

import event.ShapeDownEvent;

public interface ShapeDownListener extends EventListener {

	public void down( ShapeDownEvent shapeDownEvent );
}
