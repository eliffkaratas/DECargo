
public class Customer {
	private String name;
	private Date birthDate;
	private String gender;
	private String mail;
	private Address address;
	private Phone phone;
	private int id;
    static int CustomerUniqueId = 1;

	public Customer (String name, Date birthDate, String gender, String mail, Address address, Phone phone) {
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.mail = mail;
		this.address = address;
		this.phone = phone;
		id = CustomerUniqueId;
		CustomerUniqueId++;
		}

	public String getName() {return name;}
	public Date getBirthDate() {return birthDate;}
	public String getGender() {return gender;}
	public String getMail() {return mail;}
	public Address getAddress() {return address;}
	public Phone getPhone() {return phone;}
	public int getId() {return id;}
	
	public void setName(String name) {this.name = name;}
	public void setBirthDate(Date birthDate) {this.birthDate = birthDate;}
	public void setGender(String gender) {this.gender = gender;}
	public void setMail(String mail) {this.mail = mail;}
	public void setAddress(Address address) {this.address = address;}
	public void setPhone(Phone phone) {this.phone = phone;}
	public void setId(int id) {this.id = id;}
	
	public void display() {
		System.out.print("Name: " + this.name);
		System.out.print(" Birth Date: ");
		birthDate.display();
		System.out.print("Gender:" + this.gender);
		System.out.print(" Mail: " + this.mail);
		System.out.print(" Address: ");
		address.display();
		System.out.print("Phone: ");
		phone.display();
	}
}
