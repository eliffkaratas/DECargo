
public class Address {
	private String city;
	private String district;
	private String street;

	public Address (String street, String district, String city) {
		this.street = street;
		this.district = district;
		this.city = city;
		}
	
	public String getStreet() {return street;}
	public String getDistrict() {return district;}
	public String getCity() {return city;}
	
	public void setStreet(String street) {this.street = street;}
	public void setDistrict(String district) {this.district = district;}
	public void setCity(String city) {this.city = city;}
	
	public void display() {
		System.out.print(this.street + " " + this.district + " " + this.city + " ");
	}
}
