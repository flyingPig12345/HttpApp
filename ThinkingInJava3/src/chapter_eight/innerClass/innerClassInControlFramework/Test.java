package chapter_eight.innerClass.innerClassInControlFramework;

public class Test {
	public static void main(String args[]){
		GreenhouseControls gc = new GreenhouseControls();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new WaterOff(800),
				gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000,eventList));
		if(args.length == 1)
			gc.addEvent(
					gc.new Terminate(Integer.parseInt(args[0]))
					);
		gc.run();
	}
}
