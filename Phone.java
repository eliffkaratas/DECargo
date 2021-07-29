
public class Phone {
	private String countryCode;
	private String areaCode;
	private String number;

	public Phone (String countryCode, String areaCode, String number) {
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.number = number;
		}
	public String getCountryCode() {return countryCode;}
	public String getAreaCode() {return areaCode;}
	public String getNumber() {return number;}

	public void setCountryCode(String countryCode) {this.countryCode = countryCode;}
	public void setAreaCode(String areaCode) {this.areaCode = areaCode;}
	public void setNumber(String number) {this.number = number;}
	public void display() {
		System.out.println(this.countryCode + " " + this.areaCode + " " + this.number);
	}
}
