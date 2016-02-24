package design_patterns.factory_design_pattern;
import design_patterns.factory_design_pattern.Person;
import design_patterns.factory_design_pattern.PersonFactory;

/*
	Class to test class PersonFactory (Factory Design Pattern)
*/


class TestPersonFactory{


	// Tests PersonFactory

	public static void test(){

		Person p = null;

		String[] types = {"faculty", "director", "student", "manager"};

		// For all types
		for(String type: types){

			// Create person of specific type
			p = PersonFactory.createPerson(type);

			// If p is not null, show p's name and access
			if(p!=null){
				System.out.println("Name: "+p.getName()+", Access: "+p.getAccessType());
			}
			else{
				// display error message
				System.out.println("Unknown person type");	
			}

		}

	}


	public static void main(String[] args){

			test();
	}

}