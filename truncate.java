package DataManipulationLanguageOperations;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

public class TruncateTable {

	public static void main(String[] args) throws IOException {
		Configuration conf= HBaseConfiguration.create();
		Connection conn = ConnectionFactory.createConnection(conf);
		String Table = "Employee"; // Table name
		Admin admin = conn.getAdmin();
		admin.disableTables(Table); // Disabling the table
		admin.truncateTable(TableName.valueOf(Table), true); // Truncate table
		admin.close();
	}
}
