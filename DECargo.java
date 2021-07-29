import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DECargo {

	public static void main(String[] args) throws IOException {

		Cargo DECargo = new Cargo(150);
		File file = new File("input.txt");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		String satir = reader.readLine();

		while (satir != null) { // Reading txt file loop, while it has nextLine.
			// Lines splited by ";"
			String[] satirArray = satir.split(";");
			satir = reader.readLine();
			
			if (satirArray[0].equalsIgnoreCase("addOffice")) {
				Address officeAddress = new Address(satirArray[2], satirArray[3], satirArray[4]);
				Phone officePhone = new Phone(satirArray[5].substring(0,3), satirArray[5].substring(3,6), satirArray[5].substring(6)); // splitting phone
				DECargo.addOffice(satirArray[1], officeAddress, officePhone);
			}else if (satirArray[0].equalsIgnoreCase("addEmployee")) {
				Address employeeAddress = new Address(satirArray[6], satirArray[7], satirArray[8]);
				Phone employeePhone = new Phone(satirArray[9].substring(0,3), satirArray[9].substring(3,6), satirArray[9].substring(6));
				String[] dateArray = satirArray[4].split("/");
				Date employeeDate = new Date(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				employeeDate.controllingDate(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2])); // controlling date function
				DECargo.addEmployee(Integer.parseInt(satirArray[1]), satirArray[2], satirArray[3], employeeDate, satirArray[5], employeeAddress, employeePhone);
			}else if (satirArray[0].equalsIgnoreCase("addCustomer")) {
				Address customerAddress = new Address(satirArray[5], satirArray[6], satirArray[7]);
				Phone customerPhone = new Phone(satirArray[8].substring(0,3), satirArray[8].substring(3,6), satirArray[8].substring(6));
				String[] dateArray = satirArray[2].split("/");
				Date customerDate = new Date(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				customerDate.controllingDate(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				DECargo.addCustomer(satirArray[1], customerDate, satirArray[3], satirArray[4], customerAddress, customerPhone);
			}else if (satirArray[0].equalsIgnoreCase("addPacket")) {
				String[] dateArray = satirArray[5].split("/");
				Date packetDate = new Date(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				packetDate.controllingDate(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				DECargo.addPacket(Integer.parseInt(satirArray[1]), Integer.parseInt(satirArray[2]),Integer.parseInt(satirArray[3]), satirArray[4], packetDate);
			}
			else if(satirArray[0].equalsIgnoreCase("updateOffice")) {
				Address officeAddress = new Address(satirArray[3], satirArray[4], satirArray[5]);
				Phone officePhone = new Phone(satirArray[6].substring(0,3), satirArray[6].substring(3,6), satirArray[6].substring(6));
				DECargo.updateOffice(Integer.parseInt(satirArray[1]), satirArray[2], officeAddress, officePhone);
			}
			else if(satirArray[0].equalsIgnoreCase("updateEmployee")) {
				Address employeeAddress = new Address(satirArray[7], satirArray[8], satirArray[9]);
				Phone employeePhone = new Phone(satirArray[10].substring(0,3), satirArray[10].substring(3,6), satirArray[10].substring(6));
				String[] dateArray = satirArray[5].split("/");
				Date employeeDate = new Date(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				employeeDate.controllingDate(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				DECargo.updateEmployee(Integer.parseInt(satirArray[1]), Integer.parseInt(satirArray[2]), satirArray[3], satirArray[4], employeeDate, satirArray[6], employeeAddress, employeePhone);
			}
			else if(satirArray[0].equalsIgnoreCase("updateCustomer")) {
				Address customerAddress = new Address(satirArray[6], satirArray[7], satirArray[8]);
				Phone customerPhone = new Phone(satirArray[9].substring(0,3), satirArray[9].substring(3,6), satirArray[9].substring(6));
				String[] dateArray = satirArray[3].split("/");
				Date customerDate = new Date(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				customerDate.controllingDate(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				DECargo.updateCustomer(Integer.parseInt(satirArray[1]), satirArray[2], customerDate, satirArray[4], satirArray[5], customerAddress, customerPhone);
			}
			else if(satirArray[0].equalsIgnoreCase("updatePacket")) {
				String[] dateArray = satirArray[6].split("/");
				Date packetDate = new Date(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				packetDate.controllingDate(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
				DECargo.updatePacket(Integer.parseInt(satirArray[1]), Integer.parseInt(satirArray[2]), Integer.parseInt(satirArray[3]), Integer.parseInt(satirArray[4]), satirArray[5], packetDate);
			}
			else if(satirArray[0].equalsIgnoreCase("deleteCustomer")) {
				DECargo.deleteCustomer(Integer.parseInt(satirArray[1]));
			}		
	
			else if(satirArray[0].equalsIgnoreCase("deleteEmployee")) {
				DECargo.deleteEmployee(Integer.parseInt(satirArray[1]));
			}
			else if(satirArray[0].equalsIgnoreCase("listOffices")) {
				System.out.println("List Offices");
				DECargo.listOffice();
			}
			else if(satirArray[0].equalsIgnoreCase("listEmployees")) {
				System.out.println("");
				System.out.println("List Employees");
				DECargo.listEmployee();
			}
			else if(satirArray[0].equalsIgnoreCase("listCustomers")) {
				System.out.println("");
				System.out.println("List Customers");
				DECargo.listCustomer();
			}
			else if(satirArray[0].equalsIgnoreCase("listPackets")) {
				System.out.println("");
				System.out.println("List Packets");
				DECargo.listPacket();
				System.out.println("");
			}
			else if(satirArray[0].equalsIgnoreCase("deliverPacket")) {
				DECargo.deliverPacket(Integer.parseInt(satirArray[1]), Integer.parseInt(satirArray[2]));
			}
			else if(satirArray[0].equalsIgnoreCase("lossPacket")) {
				DECargo.lossPacket(Integer.parseInt(satirArray[1]), Integer.parseInt(satirArray[2]));
			}
			else if(satirArray[0].equalsIgnoreCase("trackPacket")) {
				DECargo.trackPacket(Integer.parseInt(satirArray[1]));
			}
			else if(satirArray[0].equalsIgnoreCase("search")) {
			//	System.out.println("Search");
			//	String[] weightArray = satirArray[4].split("-");  // ArrayIndexOutOfBoundsException error occurs in this line.
				 												   //  if all inputs are not null, this statement runs correctly.
			//	DECargo.Search(satirArray[1], satirArray[2], Integer.parseInt(satirArray[3]), Integer.parseInt(weightArray[0]), Integer.parseInt(weightArray[1]), satirArray[5]);
			}
			else if(satirArray[0].equalsIgnoreCase("top3Customers")) {
				System.out.println("Top 3 Customers");
				DECargo.topCustomer();
			}
			else if(satirArray[0].equalsIgnoreCase("increaseSalaries")) {
				System.out.println("Increase Salaries");
				DECargo.increaseSalary();
			}
			else if(satirArray[0].equalsIgnoreCase("totalIncome")) {
				System.out.println("Total Income");
				DECargo.totalIncome(Integer.parseInt(satirArray[1]));
			}
		}
		reader.close();
	}
}
