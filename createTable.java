package DDL;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class createTable {
	public static void main(String[] args) throws IOException {
		HBaseConfiguration hconf = new HBaseConfiguration(new Configuration());
		HTableDescriptor htd = new HTableDescriptor("Employee");
        // adding 3 column famlies
		htd.addFamily(new HColumnDescriptor("Colf_1")); 
		htd.addFamily(new HColumnDescriptor("Colf_2")); 
		htd.addFamily(new HColumnDescriptor("Colf_3"));
		
		HBaseAdmin hba = new HBaseAdmin(hconf);

		hba.createTable(htd);
		System.out.println("Table created sucessfully");
	}
}