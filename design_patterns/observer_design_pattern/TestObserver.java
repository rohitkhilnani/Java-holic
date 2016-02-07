package design_patterns.observer_design_pattern;
import design_patterns.observer_design_pattern.Observer;
import design_patterns.observer_design_pattern.Subject;
import design_patterns.observer_design_pattern.ModeChanger;
import design_patterns.observer_design_pattern.ModeObserver;

/*
	Class to test Observer Design Pattern
*/

class TestObserver{


	public static void testA(){

		// Create ModeChanger
		ModeChanger mc = new ModeChanger();

		// Create three subscribers
		ModeObserver ob1 = new ModeObserver();
		ModeObserver ob2 = new ModeObserver();
		ModeObserver ob3 = new ModeObserver();

		// Change mode
		System.out.println("\nChanging Mode to set");
		mc.set();

		// ob1 subscribes
		ob1.subscribe(mc);

		// Change mode
		System.out.println("\nChanging Mode to reset");
		mc.reset();		

		// ob2 subscribes
		ob2.subscribe(mc);

		// Change mode set
		System.out.println("\nChanging Mode to set");
		mc.set();

		// ob1 unsubscribes
		ob1.unsubscribe(mc);

		// Change mode
		System.out.println("\nChanging Mode to reset");
		mc.reset();				

		// ob2 unsubscribes
		ob2.unsubscribe(mc);

		// Change mode set
		System.out.println("\nChanging Mode to set");
		mc.set();

		// ob3 subscribes
		ob3.subscribe(mc);

		// Change mode
		System.out.println("\nChanging Mode to reset");
		mc.reset();						




	}


	public static void main(String args[]){

		testA();
	}


}	