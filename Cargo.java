
public class Cargo {
	private Office[] offices;
	private Customer[] customers;
	private Employee[] employees;
	private Packet[] packets;
	private int capacity;

	public Cargo(int index) {
		capacity = index;
		offices = new Office[capacity];
		customers = new Customer[capacity];
		employees = new Employee[capacity];
		packets = new Packet[capacity];
	}

	public void addOffice(String type, Address address, Phone number) {
		boolean isFullorAdded = false;
		for (int i = 0; i < capacity; i++) {
			if (offices[i] == null) {
				offices[i] = new Office(type, address, number); // adding office
				isFullorAdded = true;
				break;
			}
		}
		if (!isFullorAdded) {
			System.out.println("Offices are Full or added.");
		}
	}

	public void addCustomer(String name, Date birthDate, String gender, String mail, Address address, Phone phone) {
		boolean isFullorAdded = false;
		for (int i = 0; i < capacity; i++) {
			if (customers[i] == null) {
				customers[i] = new Customer(name, birthDate, gender, mail, address, phone); // adding customer
				isFullorAdded = true;
				break;
			}
		}
		if (!isFullorAdded) {
			System.out.println("Customers are Full or added.");
		}
	}

	public void addEmployee(int officeID, String type, String name, Date date, String gender, Address address,
			Phone phone) {
		boolean isExist = false;
		for (int i = 0; i < capacity; i++) {
			if (offices[i] != null && offices[i].getId() == officeID) {  // adding after office id controlling
				isExist = true;
				break;
			}
		}
		if (isExist) {
			boolean isFullorAdded = false;
			for (int i = 0; i < capacity; i++) {
				if (employees[i] == null) {
					employees[i] = new Employee(officeID, type, name, date, gender, address, phone);  // adding employee
					isFullorAdded = true;
					break;
				}
			}
			if (!isFullorAdded) {
				System.out.println("Employees are Full or added.");
			}
		} else {
			System.out.println("Office ID does not exist.");
		}

	}

	public void addPacket(int senderCustomerID, int receiverCustomerID, int weight, String volume, Date date) {
		boolean isSenderExist = false;
		for (int i = 0; i < capacity; i++) {
			if (customers[i] != null && customers[i].getId() == senderCustomerID) { // adding packet after sender customer id controlling
				isSenderExist = true;
				break;
			}
		}
		boolean isReceiverExist = false;
		for (int i = 0; i < capacity; i++) {
			if (customers[i] != null && customers[i].getId() == receiverCustomerID) { // adding packet after receiver customer id controlling
				isReceiverExist = true;
				break;
			}
		}
		if (isSenderExist && isReceiverExist) {
			boolean isFullorAdded = false;
			for (int i = 0; i < capacity; i++) {
				if (packets[i] == null) {
					packets[i] = new Packet(senderCustomerID, receiverCustomerID, weight, volume, date); // adding packet
					packets[i].setStatus(0);
					isFullorAdded = true;
					break;
				}
			}
			if (!isFullorAdded) {
				System.out.println("Packets are Full or added.");
			}
		} else {
			System.out.println("Sender or customer ID doest not exist.");
		}

	}

	public void updateOffice(int id, String name, Address address, Phone phone) {
		boolean isExist = false;
		if (id <= capacity && id >= 1) {
			for (int i = 0; i < capacity; i++) {
				if (offices[i] != null && offices[i].getId() == id) { // updating office
					offices[i].setName(name);
					offices[i].setAddress(address);
					offices[i].setPhone(phone);
					isExist = true;
					break;
				}
			}
			if (!isExist) {
				System.out.println("Office ID is already empty."); // if delete office before update
			} else {
				System.out.println("Office is updated.");
			}
		} else
			System.out.println("Office does not exist.");
	}

	public void updateEmployee(int employeeID, int OfficeID, String type, String name, Date date, String gender,
			Address address, Phone phone) {
		boolean isOfficeExist = false;
		for (int i = 0; i < capacity; i++) {
			if (offices[i] != null && offices[i].getId() == OfficeID) { // updating employee
				isOfficeExist = true;
				break;
			}
		}
		if (isOfficeExist) {
			boolean isExist = false;
			if (employeeID <= capacity && employeeID >= 1) {
				for (int i = 0; i < capacity; i++) {
					if (employees[i].getId() == employeeID) {
						employees[i].setOfficeID(OfficeID);
						employees[i].setType(type);
						employees[i].setName(name);
						employees[i].setDate(date);
						employees[i].setGender(gender);
						employees[i].setAddress(address);
						employees[i].setPhone(phone);
						isExist = true;
						break;
					}
				}
				if (!isExist) {
					System.out.println("Employee ID is already empty.");  // if delete employee before update
				} else {
					System.out.println("Employee is updated.");
				}
			} else
				System.out.println("Employee does not exist.");
		} else {
			System.out.println("Office ID doest not exist.");
		}
	}

	public void updateCustomer(int id, String name, Date birthDate, String gender, String mail, Address address,
			Phone phone) {
		boolean isExist = false;
		if (id <= capacity && id >= 1) {
			for (int i = 0; i < capacity; i++) {
				if (customers[i] != null && customers[i].getId() == id) {
					customers[i].setName(name);
					customers[i].setBirthDate(birthDate);
					customers[i].setGender(gender);
					customers[i].setMail(mail);
					customers[i].setAddress(address);
					customers[i].setPhone(phone);
					isExist = true;
					break;
				}
			}
			if (!isExist) {
				System.out.println("Customer ID is already empty.");
			} else {
				System.out.println("Customer is updated.");
			}
		} else
			System.out.println("Customer does not exist.");
	}

	public void updatePacket(int id, int senderCustomerID, int receiverCustomerID, int weight, String volume,
			Date date) {
		boolean isSenderExist = false;
		for (int i = 0; i < capacity; i++) {
			if (customers[i].getId() == senderCustomerID) {
				isSenderExist = true;
				break;
			}
		}
		boolean isReceiverExist = false;
		for (int i = 0; i < capacity; i++) {
			if (customers[i].getId() == receiverCustomerID) {
				isReceiverExist = true;
				break;
			}
		}
		if (isSenderExist && isReceiverExist) {
			boolean isExist = false;
			if (id <= capacity && id >= 1) {
				for (int i = 0; i < capacity; i++) {
					if (packets[i].getId() == id) {
						packets[i].setSenderCustomerID(senderCustomerID);
						packets[i].setReceiverCustomerID(receiverCustomerID);
						packets[i].setWeight(weight);
						packets[i].setVolume(volume);
						packets[i].setDate(date);
						isExist = true;
						break;
					}
				}
				if (!isExist) {
					System.out.println("Packet ID is already empty.");
				} else {
					System.out.println("Packet is updated.");
				}
			} else
				System.out.println("Packet doest not exist.");
		} else
			System.out.println("Sender or receiver customer does not exist.");
	}

	public void deleteCustomer(int id) {
		boolean isExist = false;
		if (id <= capacity && id >= 1) {
			for (int i = 0; i < capacity; i++) {
				if (customers[i] != null && customers[i].getId() == id) {
					customers[i] = null;
					isExist = true;
					break;
				}
			}
			if (!isExist) {
				System.out.println("ID already empty.");
			} else {
				System.out.println("Customer deleted.");
			}
		} else {
			System.out.println("Invalid customer id.");
		}

	}

	public void deleteEmployee(int employeeID) {
		boolean isExist = false;
		if (employeeID <= capacity && employeeID >= 1) {
			for (int i = 0; i < capacity; i++) {
				if (employees[i] != null && employees[i].getId() == employeeID) {
					employees[i] = null;
					isExist = true;
					break;
				}
			}
			if (!isExist) {
				System.out.println("ID already empty");
			} else {
				System.out.println("Employee deleted");
			}
		} else {
			System.out.println("Invalid employee id");
		}
	}
	
	public void deliverPacket(int id, int employeeID) {
		for(int i = 0; i < capacity; i++) {
			if(packets[i] != null && packets[i].getId() != 0 && employees[i] != null && employees[i].getId() != 0) {
				if(packets[i].getId() == id && employees[i].getId() == employeeID) {
					packets[i].setStatus(1);
					System.out.println("Packet " + packets[i].getId() + " is delivered.");
				}
			}
		}
	}
	public void lossPacket(int id, int employeeID) {
		String firedEmployeeName = null;
		int lossPacketCounter = 0;
		boolean flag = true;
		for(int i = 0; i < capacity; i++) {
			if(packets[i] != null && packets[i].getId() != 0 && employees[i] != null && employees[i].getId() != 0) {
				if(packets[i].getId() == id) {
					packets[i].setStatus(2);
					System.out.println("Packet " + packets[i].getId() + " is loss.");
					
					if(employees[i].getId() == employeeID) {
						lossPacketCounter++;
						
						if(lossPacketCounter >= 3 ) {
							firedEmployeeName = employees[i].getName();
							employees[i] = null;
							flag = false;
							break;
						}
					}
				}	
			}	
		}
		if(!flag) {
			System.out.println("Employee " + firedEmployeeName + " is fired.");
		}
		else
			System.out.println("No one is fired.");
	}
	
	public void trackPacket(int id) {
		for(int i = 0; i < capacity; i++) {
			if(packets[i] != null && packets[i].getId() != 0) {
				if(packets[i].getStatus() == 0) {
					System.out.println("Packet " + packets[i].getId() + " is added.");
				}
				else if(packets[i].getStatus() == 1) {
					System.out.println("Packet " + packets[i].getId() + " is delivered.");
				}
				else if(packets[i].getStatus() == 2) {
					System.out.println("Packet " + packets[i].getId() + " is loss.");
				}
			}
		}
	}

	public void listOffice() {
		for (int i = 0; i < capacity; i++) {
			if (offices[i] != null)
				offices[i].display();
		}
	}

	public void listEmployee() {
		for (int i = 0; i < capacity; i++) {
			if (employees[i] != null)
				employees[i].display();
		}
	}

	public void listCustomer() {
		for (int i = 0; i < capacity; i++) {
			if (customers[i] != null)
				customers[i].display();
		}
	}

	public void listPacket() {
		for (int i = 0; i < capacity; i++) {
			if (packets[i] != null)
				packets[i].display();
		}
	}
	
	public void Search(String fromCity, String toCity, int status, int min_weight, int max_weight, String volume) {
		for(int i = 0; i < capacity; i++) {
			if(packets[i] != null && customers[i] != null) {
				if(packets[i].getSenderCustomerID() == customers[i].getId() && customers[i].getAddress().getCity().equalsIgnoreCase(fromCity)) {
					packets[i].display();
					System.out.println("Packet " + packets[i].getId() + "'s status is " + packets[i].getStatus() + ".");
				}
				if(packets[i].getReceiverCustomerID() == customers[i].getId() && customers[i].getAddress().getCity().equalsIgnoreCase(toCity)) {
					packets[i].display();
					System.out.println("Packet " + packets[i].getId() + "'s status is " + packets[i].getStatus() + ".");
				}
				if(packets[i].getStatus() == status) {
					packets[i].display();
				}
				if(packets[i].getWeight() >= min_weight && packets[i].getWeight() <= max_weight && packets[i].getWeight() != 0) {
					packets[i].display();
				}
				if(packets[i].getVolume() == volume) {
					packets[i].display();
				}
				else
					packets[i].display();
			}
		}
	}

	public void topCustomer() { // it doesn't work correctly
		int packetCounter1 = 0;
		int packetCounter2 = 0;
		int packetCounter3 = 0;
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		String[] tempCustomers = new String[3];
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		
		for(int i = 0; i < capacity; i++) {
			if(customers[i] != null && packets[i] !=null && packets[i].getSenderCustomerID() == customers[i].getId()) {
				packetCounter1++;
				temp1 = packetCounter1;
				index1 = i;
			}
			if(packets[i] != null)
			packets[i].setSenderCustomerID(0);
		}
		tempCustomers[0] = customers[index1].getName();
		
		for(int i = 0; i < capacity; i++) {
			if(customers[i] != null && packets[i] !=null && packets[i].getSenderCustomerID() != 0 && packets[i].getSenderCustomerID() == customers[i].getId()) {
				packetCounter2++;
				temp2 = packetCounter2;
				index2 = i;
			}
			if(packets[i] != null)
			packets[i].setSenderCustomerID(0);
		}
		tempCustomers[1] = customers[index2].getName();
		
		for(int i = 0; i < capacity; i++) {
			if(customers[i] != null && packets[i] !=null && packets[i].getSenderCustomerID() != 0 && packets[i].getSenderCustomerID() == customers[i].getId()) {
				packetCounter3++;
				temp3 = packetCounter3;
				index3 = i;
			}
			if(packets[i] != null)
			packets[i].setSenderCustomerID(0);
		}
		tempCustomers[2] = customers[index3].getName();
		
		if(temp1 >= temp2 && temp2 >= temp3) {
			System.out.println("Top1 Customer: " + tempCustomers[0]);
			System.out.println("Top2 Customer: " + tempCustomers[1]);
			System.out.println("Top3 Customer: " + tempCustomers[2]);
		}
		else if(temp3 >= temp2 && temp2 >= temp1) {
			System.out.println("Top1 Customer: " + tempCustomers[2]);
			System.out.println("Top2 Customer: " + tempCustomers[1]);
			System.out.println("Top3 Customer: " + tempCustomers[0]);
		}
		else if(temp2 >= temp3 && temp3 >= temp1) {
			System.out.println("Top1 Customer: " + tempCustomers[1]);
			System.out.println("Top2 Customer: " + tempCustomers[2]);
			System.out.println("Top3 Customer: " + tempCustomers[0]);
		}
		else if(temp3 >= temp1 && temp1 >= temp2) {
			System.out.println("Top1 Customer: " + tempCustomers[2]);
			System.out.println("Top2 Customer: " + tempCustomers[0]);
			System.out.println("Top3 Customer: " + tempCustomers[1]);
		}
		else if(temp2 >= temp1 && temp1 >= temp3) {
			System.out.println("Top1 Customer: " + tempCustomers[1]);
			System.out.println("Top2 Customer: " + tempCustomers[0]);
			System.out.println("Top3 Customer: " + tempCustomers[2]);
		}
		else if(temp1 >= temp3 && temp3 >= temp2) {
			System.out.println("Top1 Customer: " + tempCustomers[0]);
			System.out.println("Top2 Customer: " + tempCustomers[2]);
			System.out.println("Top3 Customer: " + tempCustomers[1]);
		}
	}
	
	public void increaseSalary() { // increasing all salaries
		double increasedSalary = 0;
		for(int i = 0; i < capacity; i++) {
			if(employees[i] != null) {
				increasedSalary = employees[i].getSalary() + (employees[i].getSalary() / 10);
				employees[i].setSalary(increasedSalary);
			}
		}
		System.out.println("Salary increased to " + increasedSalary + ".");
	}

	public void totalIncome (int id) { // calculating total income with packet prices
		double totalPrice = 0;
		double totalIncome = 0;
		String officeName = null;
		for(int i = 0; i < capacity; i++) {
			if(offices[i] !=null && employees[i] != null && offices[i].getId() == id && employees[i].getOfficeID() == offices[i].getId()) {
				totalPrice += packets[i].CalculatePrice(packets[i].getWeight(), packets[i].getVolume());
				officeName = offices[i].getName();
				}
			else if(offices[i] !=null && id != offices[i].getId()) {
				System.out.println("Office doesnt exist.");
			}
		}
		totalIncome = totalPrice;
		System.out.println("Total income of " + officeName + " is " + totalIncome + ".");
	}
}
