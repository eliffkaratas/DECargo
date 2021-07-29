
public class Office {
	private String name;
	private Address address;
	private Phone phone;
	private int id=0;
	static int OfficeUniqueId = 1;

	public Office (String name, Address address, Phone phone) {
		id = OfficeUniqueId;
		OfficeUniqueId++;
		this.name = name;
		this.address = address;
		this.phone = phone;
		}

	public String getName() {return name;}
	public Address getAddress() {return address;}
	public Phone getPhone() {return phone;}
	public int getId() {return id;}

	public void setName(String name) {this.name = name;}
	public void setAddress(Address address) {this.address = address;}
	public void setPhone(Phone phone) {this.phone = phone;}
	public void setId(int id) {this.id = id;}
	
	public void display() {
		System.out.print("Type: "+ this.name);
		System.out.print(" Address: ");
		address.display();
		System.out.print("Phone: ");
		phone.display();
	}
}

