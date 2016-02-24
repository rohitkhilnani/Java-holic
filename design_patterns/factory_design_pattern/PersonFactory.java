package design_patterns.factory_design_pattern;
import design_patterns.factory_design_pattern.Person;
import design_patterns.factory_design_pattern.Student;
import design_patterns.factory_design_pattern.Faculty;
import design_patterns.factory_design_pattern.Director;


/*
	Factory class for Person.
*/

class PersonFactory{

	// Returns the type of Person object based on parameter type
	// Valid Types: student, faculty, director

	public static Person createPerson(String type){

		// If type is student, return new student object
		if(type.equals("student")){
			return new Student();
		}
		// If type is faculty, return new faculty object
		else if(type.equals("faculty")){
			return new Faculty();
		}
		// If type is director, return new director object
		else if(type.equals("director")){
			return new Director();
		}
		// else return null
		else{
			return null;
		}

	}


}	
