package DDL;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class drop {
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create(); 
		HBaseAdmin had = new HBaseAdmin(conf); 
		String table = "Employee";
	   // for droping the table first we have to disable it.
		had.disableTable(table);
		had.deleteTable(table);  // Deleting the table
		System.out.printf(table," is droped succesfully);
	}
}