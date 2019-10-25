package DDL;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class isEnabled {
	public static void main(String args[]) throws IOException, MasterNotRunningException {
		Configuration conf = HBaseConfiguration.create(); 
		HBaseAdmin had = new HBaseAdmin(conf); 
		boolean is_enabled = had.isTableEnabled("Employee"); 
		System.out.println("The table is Enabled: ");
		System.out.println(is_enabled);
	}
}
