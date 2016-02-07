package design_patterns.observer_design_pattern;
import design_patterns.observer_design_pattern.Subject;

/*
	Interaface observer - To be implemented by all observers
*/

interface Observer{

	// update 
	void update(String mode);

	// subscribe to a subject
	void subscribe(Subject sub);

	// unsubscribe from subject
	void unsubscribe(Subject sub);

}