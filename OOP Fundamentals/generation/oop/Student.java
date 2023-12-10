package generation.oop;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}

	public void printFullName(){
        System.out.println(firstName+" "+lastName);
     }

     public boolean isApproved(){
         //TODO implement: should return true if grade >= 60
    	 return grade>=60;
     }
     
     public int changeYearIfApproved(){
    	 if (isApproved()) {
             year++;
             System.out.println("Congratulations!");
         }
         return year;
     }
}

