class PassportApplicationTester{
public static void main(String[] args){
PassportApplication p1=new PassportApplication();
PassportApplication p2=new PassportApplication();
PassportApplication p3=new PassportApplication();
 
 p1.setApplicationId(1);
 p1.setFirstName("Aswin");
 p1.setLastName("Raj");
 p1.setDob("12-11-1996");
 p1.setPob("Salem");
 p1.setgender("Male");
 p1.setPhoneNumber(8501479632l);
 p1.setAddress("Yeshwanthpur");
 p1.setPanCard("BVSUK2501J");
 
 System.out.println("Application ID :"+p1.getApplicationId());
 System.out.println("First Name:"+p1.getFirstName());
 System.out.println("Last Name:"+p1.getLastName());
 System.out.println("Date Of Birth:"+p1.getDob());
 System.out.println("Place Of Birth:"+p1.getPob());
 System.out.println("Gender:"+p1.getGender());
 System.out.println("Phone Number :"+p1.getPhoneNumber());
 System.out.println("Address :"+p1.getAddress());
 System.out.println("Pan Card :"+p1.getPanCard());
 System.out.println("Fees for Application:"+PassportApplication.fees);
 System.out.println();
	  

 p2.setApplicationId(2);
 p2.setFirstName("Sharan");
 p2.setLastName("S");
 p2.setDob("07-02-2000");
 p2.setPob("Chennai");
 p2.setgender("Male");
 p2.setPhoneNumber(7619449516l);
 p2.setAddress("Jalahalli");
 p2.setPanCard("YERFD8542R");
 
 System.out.println("Application ID :"+p2.getApplicationId());
 System.out.println("First Name:"+p2.getFirstName());
 System.out.println("Last Name:"+p2.getLastName());
 System.out.println("Date Of Birth:"+p2.getDob());
 System.out.println("Place Of Birth:"+p2.getPob());
 System.out.println("Gender:"+p2.getGender());
 System.out.println("Phone Number:"+p2.getPhoneNumber());
 System.out.println("Address:"+p2.getAddress());
 System.out.println("Pan Card:"+p2.getPanCard());
 System.out.println("Fees for Application:"+PassportApplication.fees);
 System.out.println();
	  
 p3.setApplicationId(3);
 p3.setFirstName("Ullas");
 p3.setLastName("MC");
 p3.setDob("06-12-2023");
 p3.setPob("Goa");
 p3.setgender("male");
 p3.setPhoneNumber(9512357846l);
 p3.setAddress("Kengeri");
 p3.setPanCard("AHSTD9561H");
 
 System.out.println("Application ID :"+p3.getApplicationId());
 System.out.println("First Name:"+p3.getFirstName());
 System.out.println("Last Name:"+p3.getLastName());
 System.out.println("Date Of Birth:"+p3.getDob());
 System.out.println("Place Of Birth:"+p3.getPob());
 System.out.println("Gender:"+p3.getGender());
 System.out.println("Phone Number :"+p3.getPhoneNumber());
 System.out.println("Address :"+p3.getAddress());
 System.out.println("Pan Card :"+p3.getPanCard());
 System.out.println("Fees for Application:"+PassportApplication.fees);
 System.out.println();
	  
}
}