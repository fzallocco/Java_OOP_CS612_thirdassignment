//********************************************************************
//  Nurse.java       Author: Filippo Zallocco
//
//  CS612, third assignment, March 25 2023
//********************************************************************

class Nurse extends HospitalEmployee {	/***The nurse class is a child class of HospitalEmployee***/

	private int NumberOfPatients;		/***NumberOfPatients is a private integer-based that characterizes the Nurse object***/

	Nurse() {}

	Nurse(String Name, int Number, int NumberOfPatients) {	/***the Nurse object is defined by the same parameters as the ones featured in the parent class, HospitalEmployee, in addition to NumberOfPatients***/

		super(Name, Number);	/***I call the super keyword to link Nurse's parameters to the ones inside the HospitalEmployee class' constructor***/ 
		
		this.NumberOfPatients=NumberOfPatients;

	}

	public void setPatients(int myNumberOfPatients) {	/***I create a Nurse-specific setter method to store int-based attribute information independently from Nurse's parent class' methods***/
	
		NumberOfPatients = myNumberOfPatients;

	}

	public int getPatients() {

		return NumberOfPatients;		/***I add another Nurse-specific getter method to retrieve data that we stored inside the class' object earlier***/

	}

	public void work() {
	
		System.out.println(Name+" works for the hospital and has "+NumberOfPatients+" patients to attend to\n");		/***In this instance, I override the method created in the parent class by adding an attribute unique to the Nurse class. That is NumberOfPatients.***/

	}
}//end of class