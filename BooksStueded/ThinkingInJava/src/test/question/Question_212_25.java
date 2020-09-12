import java.util.*;

abstract class Event{
	private long eventTime;
	protected final long delayTime;
	public Event( long delayTime ){
		this.delayTime = delayTime;
		start();
	}
	public void start(){
		eventTime = System.nanoTime() + delayTime;
	}
	public boolean ready(){
		return System.nanoTime() >= eventTime;
	}
	public abstract void action();
}

class Controller{
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent( Event c ){
		eventList.add(c);
	}
	public void run(){
		while( eventList.size() > 0 )
			for( Event e : new ArrayList<Event>(eventList) )
				if( e.ready() ){
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
	}
}

class GreenhouseControls extends Controller{
	
	private boolean light = false;
	public class LightOn extends Event{
		public LightOn( long delayTime ){
			super(delayTime);
		} 
		public void action(){
			light = true;
		}
		public String toString(){
			return "开灯";
		}
	}
	public class LightOff extends Event{
		public LightOff( long delayTime ){
			super(delayTime);
		}
		public void action(){
			light = false;
		}
		public String toString(){
			return "关灯";
		}
	}
	
	private boolean water = false;
	public class WaterOn extends Event{
		public WaterOn( long delayTime ){
			super(delayTime);
		}
		public void action(){
			water = true;
		}
		public String toString(){
			return "开水";
		}
	}
	public class WaterOff extends Event{
		public WaterOff( long delayTime ){
			super(delayTime);
		}
		public void action(){
			water = false;
		}
		public String toString(){
			return "关水";
		}
	}
	
	private String thermostat = "Day";
	public class ThermostatNight extends Event{
		public ThermostatNight( long delayTime ){
			super(delayTime);
		}
		public void action(){
			thermostat = "Night";
		}
		public String toString(){
			return "晚上温度";
		}
	}
	public class ThermostatDay extends Event{
		public ThermostatDay( long delayTime ){
			super(delayTime);
		}
		public void action(){
			thermostat = "Day";
		}
		public String toString(){
			return "白天温度";
		}
	}
	
	public class Bell extends Event{
		public Bell( long delayTime ){
			super(delayTime);
		}
		public void action(){
			addEvent( new Bell(delayTime) );
		}
		public String toString(){
			return "铃响";
		}
	}
	
	public class Restart extends Event{
		private Event[] eventList;
		public Restart( long delayTime, Event[] eventList ){
			super(delayTime);
			this.eventList = eventList;
			for( Event e : eventList )
				addEvent(e);
		}
		public void action(){
			for( Event e : eventList ){
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		public String toString(){
			return "重启系统";
		}
	}
	
	public static class Terminate extends Event{
		public Terminate( long delayTime ){
			super(delayTime);
		}
		public void action(){
			System.exit(0);
		}
		public String toString(){
			return "结束系统";
		}
	}
	
	private boolean fanFlag = false;
	public class FanOn extends Event{
		public FanOn( long delayTime ){
			super(delayTime);
		}
		public void action(){
			fanFlag = true;
		}
		public String toString(){
			return "打开风扇";
		}
	}
	public class FanOff extends Event{
		public FanOff( long delayTime ){
			super(delayTime);
		}
		public void action(){
			fanFlag = false;
		}
		public String toString(){
			return "关闭风扇";
		}
	}
}

class WaterIO extends GreenhouseControls{
	private boolean flag = false;
	public class WaterOn extends Event{
		public WaterOn( long delayTime ){
			super(delayTime);
		}
		public void action(){
			flag = true;
		}
		public String toString(){
			return "开启喷水机";
		}
	}
	public class WaterOff extends Event{
		public WaterOff( long delayTime ){
			super(delayTime);
		}
		public void action(){
			flag = false;
		}
		public String toString(){
			return "关闭喷水机";
		}
	}
}

public class Question_212_25{
	public static void main( String[] args ){
		GreenhouseControls gc = new GreenhouseControls();
		WaterIO wc = new WaterIO();
		
		gc.addEvent( gc.new Bell(900) );
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400),
			gc.new FanOn(1600),
			gc.new FanOff(1800),
			wc.new WaterOn(2000),
			wc.new WaterOff(2200),
		};
		gc.addEvent( gc.new Restart( 2000, eventList ) );
		if( args.length == 1 )
			gc.addEvent( new GreenhouseControls.Terminate( new Integer( args[0] ) ) );
		gc.run();
	}
}