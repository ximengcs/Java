package listener;

import java.util.EventListener;

import event.ShapeDropEvent;

public interface ShapeDropListener extends EventListener {

	public void drop( ShapeDropEvent shapeDropEvent );
}
