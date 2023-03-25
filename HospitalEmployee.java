//********************************************************************
//  Hospital.java       Author: Filippo Zallocco
//
//  CS612, third assignment, March 25 2023
//********************************************************************

class HospitalEmployee{

	protected String Name;	/***I use protected instead of private to allow child classes to use parent class' attributes***/
	
	protected int Number;	/***I created general string and integer data type variables that make up the object HospitalEmployee***/

	HospitalEmployee() {}	/***I leave the default constructor empty as I provide the user-defined constructor below***/
	
	HospitalEmployee(String Name, int Number) {

		this.Name=Name;			/***I use the keyword "this" to distinguish between the constructor's parameters and the class's data fields.***/
		this.Number=Number;

	}

	public void setName(String myName) {
	
		Name = myName;	/***I create a setter method to allow the user to assign a string-based attribute to a newly created object in their test file***/
	}

	public String getName(){			/***I create a getter method to allow an object to fetch and display its string-based attribute in the user's test file***/

		return Name;
	}

	public void setNumber(int myNumber) {		/***I define another setter method for the object's integer-based attribute***/

		Number=myNumber;

	}

	public int getNumber(){				/***I create another getter method to enable the user to fetch and output an object's integer attribute in the test file***/ 

		return Number;
	}

	public void work(){				/***I implement the work method with its default, object's name works for the hospital***/
	
		System.out.println(Name+" works for the hospital.");
	}
	
}//end of class