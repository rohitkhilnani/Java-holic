package design_patterns.factory_design_pattern;

/*
	Abstract class Person
*/

abstract class Person{

	// Person's Name
	protected String name;

	// Access type
	String access;
	
	// Sets Name

	public void setName(String name){
		this.name = name;
	}  	


	// Returns Name
	public String getName(){
		return name;
	}


		// Sets access type

	public void setAccessType(String type){
		access = type;
	}  	


	// Returns Name
	public String getAccessType(){
		return access;
	}

}	

