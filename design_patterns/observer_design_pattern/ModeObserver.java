package design_patterns.observer_design_pattern;
import design_patterns.observer_design_pattern.Observer;
import design_patterns.observer_design_pattern.Subject;
import design_patterns.observer_design_pattern.ModeChanger;


/*
	Class ModeObserver - Subscribes to updates from ModeChanger
*/

class ModeObserver implements Observer{

	// Reference to subscriber
	protected Subject sub;
	protected String mode;
	protected int id;
	static protected int count = 0;


	// Construct observer 

	ModeObserver(){
		
		id = ++count;
	}

	// update 
	public void update(String mode){

		this.mode = mode;
		System.out.println("Mode Observer " + id + " changed to: " + mode);
	}

	// subscribe to a subject
	public void subscribe(Subject sub){
		this.sub = sub;
		sub.register(this);
		System.out.println("Mode Observer " + id + " subscribed");	
	}

	// unsubscribe from subject
	public void unsubscribe(Subject sub){
		sub.unregister(this);
		System.out.println("Mode Observer " + id + " unsubscribed");	
	}

}	