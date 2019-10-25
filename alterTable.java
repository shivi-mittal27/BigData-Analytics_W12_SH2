package DDL;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class alterTable {
	public static void main(String args[]) throws IOException,MasterNotRunningException {
		Configuration conf = HBaseConfiguration.create(); 
														
		HBaseAdmin had = new HBaseAdmin(conf); 
		HColumnDescriptor hcd = new HColumnDescriptor("Name"); 
																		
		had.addColumn("FirstTable", hcd); // Adding column family by altering the table 
		System.out.println("Tabled is alter succefully");
	}
}