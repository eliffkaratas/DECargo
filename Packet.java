
public class Packet {
	private int senderCustomerID;
	private int receiverCustomerID;
	private int weight;
	private String volume;
	private Date date;
	private int id ;
	static int PacketUniqueId = 1;
	private int status;
	private int price;

	public Packet (int senderCustomerID, int receiverCustomerID, int weight, String volume, Date date) {
		id = PacketUniqueId;
		PacketUniqueId++;
		this.senderCustomerID = senderCustomerID;
		this.receiverCustomerID = receiverCustomerID;
		this.weight = weight;
		this.volume = volume;
		this.date = date;
		status=0; // it will be 0 when added to the system
		}
	
	public Packet(int weight, String volume) {
		price=CalculatePrice(weight, volume);
	}

	public int CalculatePrice(int weigth, String volume) { // calculating prices
		if(this.weight <= 5 &&  this.weight >= 1 && this.volume.equalsIgnoreCase("small")) {
			price = 10;
		}
		else if(this.weight <= 10 && this.weight >= 6 && this.volume.equalsIgnoreCase("small")) {
			price = 25;
		}
		else if(this.weight >= 11 && this.volume.equalsIgnoreCase("small")) {
			price = 45;
		}
		else if(this.weight <= 5 &&  this.weight >= 1 && this.volume.equalsIgnoreCase("medium")) {
			price = 15;
		}
		else if(this.weight <= 10 && this.weight >= 6 && this.volume.equalsIgnoreCase("medium")) {
			price = 30;
		}
		else if(this.weight >= 11 && this.volume.equalsIgnoreCase("medium")) {
			price = 50;
		}
		else if(this.weight <= 5 &&  this.weight >= 1 && this.volume.equalsIgnoreCase("large")) {
			price = 20;
		}
		else if(this.weight <= 10 && this.weight >= 6 && this.volume.equalsIgnoreCase("large")) {
			price = 40;
		}
		else if(this.weight >= 11 && this.volume.equalsIgnoreCase("large")) {
			price = 55;
		}
		return price;	
	}
	
	public int getSenderCustomerID() {return senderCustomerID;}
	public int  getReceiverCustomerID() {return receiverCustomerID;}
	public int getWeight() {return weight;}
	public String getVolume() {return volume;}
	public Date getDate() {return date;}
	public int getId() {return id;}
	public int getPrice() {return price;}
	public int getStatus() {return status;}

	public void setSenderCustomerID(int senderCustomerID) {this.senderCustomerID = senderCustomerID;}
	public void setReceiverCustomerID(int receiverCustomerID) {this.receiverCustomerID = receiverCustomerID;}
	public void setWeight(int weight) {this.weight = weight;}
	public void setVolume(String volume) {this.volume = volume;}
	public void setDate(Date date) {this.date = date;}
	public void setId(int id) {this.id = id;}
	public void setPrice(int price) {this.price = price;}
	public void setStatus(int status) {this.status = status;}

	public void display() {
		System.out.print("Sender Customer ID: " + this.senderCustomerID);
		System.out.print(" Receiver Customer ID: " + this.receiverCustomerID);
		System.out.print(" Weight: " + this.weight);
		System.out.print(" Volume: " + this.volume);
		System.out.print(" Date: ");
		date.display();
		System.out.println("");
	}
}
