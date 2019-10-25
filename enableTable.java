package DDL;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class enableTable {
	
	public static void main(String args[]) throws IOException, MasterNotRunningException {
		Configuration conf = HBaseConfiguration.create(); 
		HBaseAdmin had = new HBaseAdmin(conf); 
		boolean enable = had.isTableEnabled("Employee"); // checking table is enable or not
		if (!enable) { 
			had.enableTable("Employee");
			System.out.println("Selected Table is Enabled now"); 
		}
		else {
			System.out.println("The table is already enabled");
		}
	}
}