package DML;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
public class put{
public static void main(String[] args) throws IOException {
Configuration conf = HBaseConfiguration.create(); 
String Table  = "Employee"; // Table name
HTable hTable = new HTable(conf, Table);      
Put row1 = new Put(Bytes.toBytes("01"));
// ROW 1
// syntax  column family name, column name  and its value
// column family 1
row1.add(Bytes.toBytes("colf_1"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("EM122"));
row1.add(Bytes.toBytes("colf_1"),	Bytes.toBytes("Name"),		Bytes.toBytes("Preet"));
row1.add(Bytes.toBytes("colf_1"),	Bytes.toBytes("Designation"),		Bytes.toBytes("Manager"));
// column family 2
row1.add(Bytes.toBytes("colf_2"),   	Bytes.toBytes("Gmail"),	Bytes.toBytes("preetinder566@gamil.com"));
row1.add(Bytes.toBytes("colf_2"),	Bytes.toBytes("Salary"),		Bytes.toBytes("67000"));
row1.add(Bytes.toBytes("colf_2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("9874646353"));
//column family 3
row1.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
row1.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("Age"),		Bytes.toBytes("33"));
row1.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("City"),		Bytes.toBytes("Batinda"));
hTable.put(row1); // Adding the data into HTable

//ROW 2
Put row2 = new Put(Bytes.toBytes("02"));  
//syntax  column family name, column name  and its value
//column family 1
row2.add(Bytes.toBytes("colf_1"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("EM882"));
row2.add(Bytes.toBytes("colf_1"),	Bytes.toBytes("Name"),		Bytes.toBytes("Nikhil"));
row2.add(Bytes.toBytes("colf_1"),	Bytes.toBytes("Designation"),		Bytes.toBytes("Tester"));
//column family 2
row2.add(Bytes.toBytes("colf_2"),   	Bytes.toBytes("Gmail"),	Bytes.toBytes("nikhil445@gmail.com"));
row2.add(Bytes.toBytes("colf_2"),	Bytes.toBytes("salary"),		Bytes.toBytes("56000"));
row2.add(Bytes.toBytes("colf_2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("9833535353"));
//column family 3
row2.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
row2.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("Age"),		Bytes.toBytes("39"));
row2.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("City"),		Bytes.toBytes("Guntur"));
hTable.put(row2); // Adding the data into HTable

//ROW 3
Put row3 = new Put(Bytes.toBytes("03"));  
//syntax  column family name, column name  and its value
//column family 1
row3.add(Bytes.toBytes("colf_1"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("EM667"));
row3.add(Bytes.toBytes("colf_1"),	Bytes.toBytes("Name"),		Bytes.toBytes("Mahesh"));
row3.add(Bytes.toBytes("colf_1"),	Bytes.toBytes("Designation"),		Bytes.toBytes("Developer"));
//column family 2
row3.add(Bytes.toBytes("colf_2"),   	Bytes.toBytes("Gmail"),	Bytes.toBytes("mahesh333@gmail.com"));
row3.add(Bytes.toBytes("colf_2"),	Bytes.toBytes("salary"),		Bytes.toBytes("56000"));
row3.add(Bytes.toBytes("colf_2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("98335353445"));
//column family 3
row3.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
row3.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("Age"),		Bytes.toBytes("34"));
row3.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("City"),		Bytes.toBytes("Tirupathi"));
hTable.put(row3); // Adding the data into HTable


//ROW 4
Put row4 = new Put(Bytes.toBytes("04"));  
//syntax  column family name, column name  and its value
//column family 1
row4.add(Bytes.toBytes("colf_1"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("EM223"));
row4.add(Bytes.toBytes("colf_1"),	Bytes.toBytes("Name"),		Bytes.toBytes("Shivi"));
row4.add(Bytes.toBytes("colf_1"),	Bytes.toBytes("Designation"),		Bytes.toBytes("Senior manager"));
//column family 2
row4.add(Bytes.toBytes("colf_2"),   	Bytes.toBytes("Gmail"),	Bytes.toBytes("shivi2708@gmail.com"));
row4.add(Bytes.toBytes("colf_2"),	Bytes.toBytes("salary"),		Bytes.toBytes("90000"));
row4.add(Bytes.toBytes("colf_2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("9833534577"));
//column family 3
row4.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
row4.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("Age"),		Bytes.toBytes("25"));
row4.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("City"),		Bytes.toBytes("Tirupathi"));
hTable.put(row4); // Adding the data into HTable

//ROW 5
Put row5 = new Put(Bytes.toBytes("05"));  
//syntax  column family name, column name  and its value
//column family 1
row5.add(Bytes.toBytes("colf_1"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("EM088"));
row5.add(Bytes.toBytes("colf_1"),	Bytes.toBytes("Name"),		Bytes.toBytes("Akshay"));
row5.add(Bytes.toBytes("colf_1"),	Bytes.toBytes("Designation"),		Bytes.toBytes("Asst manager"));
//column family 2
row5.add(Bytes.toBytes("colf_2"),   	Bytes.toBytes("Gmail"),	Bytes.toBytes("Akshay333@gmail.com"));
row5.add(Bytes.toBytes("colf_2"),	Bytes.toBytes("salary"),		Bytes.toBytes("67000"));
row5.add(Bytes.toBytes("colf_2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("9833534577"));
//column family 3
row5.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
row5.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("Age"),		Bytes.toBytes("28"));
row5.add(Bytes.toBytes("colf_3"),	Bytes.toBytes("City"),		Bytes.toBytes("Parchur"));
hTable.put(row5); // Adding the data into HTable

System.out.println("Data is inserted in the ",Table," table");     
hTable.close();   // Closing HTable   
}
}