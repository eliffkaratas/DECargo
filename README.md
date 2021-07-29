# DECargo
Object-Oriented Programming in Java

The software has to include some entities to handle the records of offices, employees, customers, packets, etc.

Currently, the company has three offices, each one in different city (Izmir, Istanbul and Ankara) in Turkey. However, new offices can join the system over time. Each office deals with the cargo packets in its region and has some attributes, including name, address, and phone. 

Several employees work on each office. Each employee has several properties, including name, birthdate, gender, address and phone number. There are two types of employees; the first one (office boy) always seats in the office and receives the packages from the customers, and the second one (service staff) delivers the packages to the receivers by driving a car. The intercity transport of the packages is provided by a third party company, ignore it in this system. The salary of each employee is the minimum wage (currently net 2020.58 TL). If an employee losses three packages, he / she is automatically fired from the DECargo. 

When a customer arrives to the office to send a packet, the office boy enters both the sender and receiver customer information to the system, including his/her name, birthdate, gender, e-mail, address, and phone. 

Cargo fees are calculated according to the volume and weight of each package, independently from the starting and destination cities.

When a new package is added to the system, its status must be “0”. This property must be updated to “1” when it is delivered to the receiver's address or it must be updated to “2” if it is lost. A user can track the status of the packet by its ID.

Office, Employee, Customer and Package entities have ID properties to identify each record. These properties must be auto increment numbers and the user should not have to (and cannot) enter ID information during adding new records.

The system should allow users to manage data by add, delete, update and list operations. The records should be flagged as “false” when they are deleted.

The software should also enable users to search packages according to the specified options.

The system should allow users the following operations: 
- Finding top 3 customers    (in terms of the number of packets they send)
- Increasing the salaries of all employees by %10 by using set method
- Finding the total income of a given office    (only sum the fees of packages which are sent by the given office)  
