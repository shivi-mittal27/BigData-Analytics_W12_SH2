package DDL;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class list {
	public static void main(String args[]) throws IOException, MasterNotRunningException {
		Configuration conf = HBaseConfiguration.create(); 
														
		HBaseAdmin had = new HBaseAdmin(conf);
		HTableDescriptor[] htd = ad.listTables();
															
		for (int i = 0; i < htd.length; i++) {
			System.out.println(htd[i].getNameAsString()); // Printing the list of tables avaliable in the Hbase.
																	
		}
	}
}