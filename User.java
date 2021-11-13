
public class User {
	String name;
	String email;
	String phoneNum;
	String address;
	String password;
	String dateOfBirth;
	String dateOfVisit;
	
	//constructor
	public User(String name, String email, String phoneNum, String address, String password, String dateOfBirth, String dateOfVisit){
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
		this.password = password; 
		this.dateOfBirth = dateOfBirth;
		this.dateOfVisit = dateOfVisit;
	}
	
	//getters
	public String getName(){
		return name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getPhoneNum(){
		return phoneNum;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getDOBirth(){
		return dateOfBirth;
	}
	
	public String getDOVisit(){
		return dateOfVisit;
	}
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public void setDOBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setDOVisit(String dateOfVisit){
		this.dateOfVisit = dateOfVisit;
	}
}
