class Patient{
	private int patientId;
	private String patientName;
	private int age;
	private String bloodGroup;
	private String gender;
	private String address;
	private long contactNo;
	private String wardNo;
	private String attenderName;
	private String diseaseName;
	private String consultantName;
	private String hospitalName;
	private double fees;
	
public void setPatientId(int patientId){
    this.patientId=patientId;
}
public int getPatientId(){
	return patientId;
}

public void setPatientName(String patientName){
	this.patientName=patientName;
}
public String getPatientName(){
	return patientName;
}

public void setAge(int age){
	this.age=age;
}
public int getAge(){
	return age;
}
public void setBloodGroup(String bloodGroup){
	this.bloodGroup=bloodGroup;
}
public String getBloodgroup(){
	retutn bloodGroup;
}
public void setGender(String gender){
this.gender=gender;
}
public String getGender(){
	return gender;
}
public void setAddress(String address){
	this.address=address;
}
public String getAddress(){
	return address;
}
public void setContactNo(long contactNo){
	this.contactNo=contactNo;
} 
public long getContactNo(){
	return contactNo;
}
public void setWardNo(String wardNo){
	this.wardNo=wardNo;
}
public String getWardNo(){
	return wardNo;
}
public void setAttenderName(String attenderName){
	this.attenderName=attenderName;
}
public String getAttenderName(){
	return attenderName;
}
public void setDiseaseName(String diseaseName){
	this.diseaseName=diseaseName;
}
public String getDiseaseName(){
	return diseaseName;
}
public void setConsultantName(String consultantName){
	this.consultantName=consultantName;
}
public String getConsultantName(){
	return consultantName;
}
public void setHospitalName(String hospitalName){
	this.hospitalName=hospitalName;
}
public String getHospitalName(){
	return hospitalName;
}
public void setFees(double fees){
	this.fees=fees;
}
public double getFees(){
	return fees;
}
}