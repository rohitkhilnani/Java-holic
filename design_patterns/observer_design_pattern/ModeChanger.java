package design_patterns.observer_design_pattern;
import design_patterns.observer_design_pattern.Observer;
import design_patterns.observer_design_pattern.Subject;
import java.util.HashSet;


/*
	Class ModeChanger - Changes modes and publishes updates to its observers
*/

class ModeChanger implements Subject{

	// Set of observers
	protected HashSet<Observer> observers;

	// Mode
	String mode;

	// Construct object

	ModeChanger(){
		
		mode = "undefined";
		observers = new HashSet<Observer>();
	}


	// register new observer
	public void register(Observer newob){

		observers.add(newob);
	}

	// unregister existing observer
	public void unregister(Observer ob){

		if(observers.contains(ob))
			observers.remove(ob);

	}

	// notify all observers of update
	public void updateAll(){

		for(Observer o: observers){

			o.update(mode);
		}
	}


	// set mode to set and notify all observers
	public void set(){
		mode = "set";
		updateAll();
	}


	// set mode to reset and notify all observers
	public void reset(){
		mode = "reset";
		updateAll();
	}



}	