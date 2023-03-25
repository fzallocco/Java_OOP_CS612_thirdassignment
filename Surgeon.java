//********************************************************************
//  Surgeon.java       Author: Filippo Zallocco
//
//  CS612, third assignment, March 25 2023
//********************************************************************

class Surgeon extends HospitalEmployee {		/***This is another child class of HospitalEmployee***/

	private String Operating;	/***The Surgeon class is characterized by the string data type Operating, which summarizes what operation the object Surgeon is performing and whether or not it is performing said task***/

	Surgeon() {}	

	Surgeon(String Name, int Number, String Operating)  {		/***Surgeon's constructor, too, accepts HospitalEmployee's parameters, Name and Number, as well as its unique Operating attribute***/
	
		super(Name, Number);
		this.Operating=Operating;

	}

	public void setOperation(String myOperation) {		/***Like in Nurse and Doctor classes, I provide a setter method to allow the user to define the Surgeon object in their test file***/

		Operating=myOperation;

	}

	public String getOperation() {		/***Additionally, there is a getter method to retrieve a Surgeon object's string-based attribute that is unique to this class***/

		return Operating;
	}

	public boolean verifyOperation() {		/***The boolean verifyOperation method is another important feature of the Surgeon class whose sole purpose is verifying whether the object has an operation scheduled***/

		if(Operating !=".....")
			return true;
		else
			return false;

	}

	public void work() {

		System.out.println(Name+" works for the hospital and performs "+Operating);	/***Finally, I override the work method in this class as well in a way that it is characterized by its unique attribute***/

	}

}//end of class