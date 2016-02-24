# Factory Design Pattern

Person - Abstract class representing a person

Student - Extends Person

Faculty - Extends Person

Director - Extends Person

PersonFactory - Factory class for Person. Method createPerson() returns Student, Faculty or Director object based on parameter 'type'.
				public static Person createPerson(String type)

TestPersonFactory - Class to test class PersonFactory