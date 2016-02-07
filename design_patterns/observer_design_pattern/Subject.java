package design_patterns.observer_design_pattern;
import design_patterns.observer_design_pattern.Observer;

/*
	Interaface subject - to be implemented by all subjects
*/

interface Subject{

	// register new observer
	void register(Observer newob);

	// unregister existing observer
	void unregister(Observer ob);

	// notify all observers of update
	void updateAll();



}