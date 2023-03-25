//********************************************************************
//  Hospital.java       Author: Filippo Zallocco
//
//  CS612, third assignment, March 25 2023
//********************************************************************

class Hospital {

	public static void main(String[] args){


		HospitalEmployee hsep = new HospitalEmployee();

		hsep.setName("Jake");
		hsep.setNumber(347957);

		System.out.println("Created new employee and set parameters\n");
		System.out.println("Employee :"+hsep.getName()+" has number :"+hsep.getNumber());

		System.out.println("\n");

		hsep.work();

		System.out.println("Now creating Doctor and Nurse\n"); 

		Nurse newNurs = new Nurse();

		newNurs.setName("Rosita");
		newNurs.setNumber(1111111);
		newNurs.setPatients(3);
		
		Doctor Doct = new Doctor();

		Doct.setName("Chin");
		Doct.setNumber(2222222);
		Doct.setSpecialty("Oncology");

		System.out.println(newNurs.getName() + " has number: " + newNurs.getNumber() + " and patients: " + newNurs.getPatients() + "\n");

		System.out.println(Doct.getName() + " has number: " + Doct.getNumber() + " and their specialty is : " + Doct.getSpecialty() + "\n");

		newNurs.work();
		Doct.work();

		System.out.println("Creating Surgeon...\n");

		Surgeon Surg = new Surgeon();

		Surg.setName("Fred");
		Surg.setNumber(44444);
		Surg.setOperation("Heart Transplant");
		System.out.println(Surg.getName() + " has number: " + Surg.getNumber() + " and performs " + Surg.getOperation());
	
		Surg.work();
		System.out.println("Does Fred have a surgery scheduled? " +Surg.verifyOperation());
		
	}//end of main

}//end of class