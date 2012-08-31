package milestone1;

import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;

public class Tracker {
	
	private DifferentialPilot dp;
	private LightSensor leftEye;
	private LightSensor rightEye;
	
	public Tracker(DifferentialPilot pilot, LightSensor leftLS, LightSensor rightLS) {
		dp = pilot;
		leftEye = leftLS;
		rightEye = rightLS;
		
		dp.setTravelSpeed(15);
		dp.setRotateSpeed(180);
		dp.setAcceleration(80);
	}
	
	private void findError() {
		int leftval = leftEye.readValue();
		int rightval = rightEye.readValue();
	}
	

}
