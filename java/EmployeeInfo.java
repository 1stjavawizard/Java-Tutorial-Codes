public abstract class EmployeeInfo{
	private String firstName;
	private String lastName;
	private int id;
	private int accountNumber;
	private String address;
	private String role;
	public abstract double earnings();
	
 public void setFirstName(String a){
	 firstName = a;
 }
 
 public String getFirstName(){
	 return firstName;
 }
 
 public void setLastName(String b){
	 lastName = b;
 }
 
 public String getLastName(){
	 return lastName;
 }
 
 public void setId(int c){
	 id = c;
 }
 
 public int getId(){
	 return id;
 }
 
 public void setAccountNumber(int d){
	 accountNumber = d;
 }
 
 public int getAccountNumber(){
	 return accountNumber;
 }
 
 public void setAddress(String e){
	 address = e;
 }
 
 public String getAddress(){
	 return address;
 }
 
 public void setRole(String f){
	 role = f;
 }
 
 public String getRole(){
	 return role;
 }
	}