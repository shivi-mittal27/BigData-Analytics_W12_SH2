package DDL;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class disableTable {
	public static void main(String args[]) throws IOException, MasterNotRunningException {
		Configuration conf = HBaseConfiguration.create(); 
														
		HBaseAdmin had = new HBaseAdmin(conf); 
		boolean disable = had.isTableDisabled("Employee"); 
		if (!disable) {
			had.disableTable("Employee"); 
			System.out.println("Selected Table is disabled now"); 
			}
		else {
			System.out.println("Selected Table is already disabled");
		}
		
}
}