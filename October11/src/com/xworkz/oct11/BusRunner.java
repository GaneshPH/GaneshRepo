package com.xworkz.oct11;

import com.xworkz.oct11.boot.*;

public class BusRunner {
	
	public static void main(String[] args) {
	
	Bus ksrtc = new Bus();
	
	ksrtc.busNumber=1234;
	ksrtc.starting="Bengaluru";
	ksrtc.destination="Hubballi";
	
	System.out.println(ksrtc.busNumber);
	System.out.println(ksrtc.starting);
	System.out.println(ksrtc.destination);
	}
}
