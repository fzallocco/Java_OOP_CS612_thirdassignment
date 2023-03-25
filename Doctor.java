//********************************************************************
//  Doctor.java       Author: Filippo Zallocco
//
//  CS612, third assignment, March 25 2023
//********************************************************************

class Doctor extends HospitalEmployee {		/***Here, I created a new child class, Doctor, which inherits all relevant attributes and methods from its parent class, HospitalEmployee.***/

	private String Specialty;

	Doctor() {}	

	Doctor(String Name, int Number, String Specialty) {	/***The Doctor child class' constructor fetches the same parameters as its parent class and at the same time picks up its unique attribute
	
		super(Name, Number);		/***I again call the super keyword to connect Doctor's inherited parameters to those inside HospitalEmployee's constructor***/
		this.Specialty = Specialty;

	}

	public void setSpecialty(String mySpecialty) {	/***Additionally, I provide a string-based attribute to further define Doctor and render it distinguishable from other child classes***/

		Specialty = mySpecialty;
	}

	public String getSpecialty() {	/***As in the case for Nurse, I added a getter method to retrieve the class-specific attribute explained above***/

		return Specialty;
	}

	public void work() {

		System.out.println(Name+" works for the hospital and their specialty is: "+Specialty); /***In this instance too, I override the work method created in the HospitalEmployee parent class by featuring the attribute Specialty which is unique to this class.***/

	}

}//end of class