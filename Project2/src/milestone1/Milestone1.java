package milestone1;

import lejos.robotics.navigation.*;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.*;
import lejos.util.*;

public class Milestone1 {

	public static void main(String[] args){
		DifferentialPilot pilot = new DifferentialPilot(0,0,Motor.A,Motor.B); //need to fix
		LightSensor leftEye = new LightSensor(SensorPort.S1);
		LightSensor rightEye = new LightSensor(SensorPort.S4);
		int length = 0;
		
		Tracker tracker = new Tracker(pilot, leftEye, rightEye, length);
		
		for (int i = 0; i < 8; i++) {
			tracker.trackLine();
			pilot.travel(0.5*length);
		}
	}
	
}
