
public class Employee {
	private int OfficeID;
	private String type;
	private String name;
	private Date date;
	private String gender;
	private Address address;
	private Phone phone;
	private double salary;
	private int id;
	static int EmployeeUniqueId = 1;
	

	public Employee (int OfficeID, String type, String name, Date date, String gender, Address address, Phone phone) {
		id = EmployeeUniqueId;	
		EmployeeUniqueId++;
		this.OfficeID = OfficeID;
		this.type = type;
		this.name = name;
		this.date = date;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.salary = 2020.58;
		}
	
	public int getOfficeID() {return OfficeID;}
	public String getType() {return type;}
	public String getName() {return name;}
	public Date getDate() {return date;}
	public String getGender() {return gender;}
	public Address getAddress() {return address;}
	public Phone getPhone() {return phone;}
	public int getId() {return id;}
	public double getSalary() {return salary;}

	public void setOfficeID(int OfficeID) {this.OfficeID = OfficeID;}
	public void setType(String type) {this.type = type;}
	public void setName(String name) {this.name = name;}
	public void setDate(Date date) {this.date = date;}
	public void setGender(String gender) {this.gender = gender;}
	public void setAddress(Address address) {this.address = address;}
	public void setPhone(Phone phone) {this.phone = phone;}
	public void setId(int id) {this.id = id;}
	public void setSalary(double salary) {this.salary = salary;}
	
	public void display() {
		System.out.print("Type: " + this.type);
		System.out.print(" Name: " + this.name);
		System.out.print(" Date: ");
		date.display();
		System.out.print("Gender: " + this.gender);
		System.out.print(" Address: ");
		address.display();
		System.out.print(" Phone: ");
		phone.display();
	}
}
