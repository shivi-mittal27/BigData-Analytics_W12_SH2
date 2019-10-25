package DML;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class scan {
	public static void main(String args[]) throws IOException {
		Configuration conf = HBaseConfiguration.create(); 
		String Table = "Employee"; // Table name
		HTable Htable = new HTable(conf, Table);  // H table 
		Scan scanable = new Scan(); 
		scan.addColumn(Bytes.toBytes("cofl_2"), Bytes.toBytes("Salary"));  // Scanning 
		ResultScanner scanner = Htable.getScanner(scanable); 
		
		for (Result result = scanner.next(); result != null; result = scanner
				.next())
			System.out.println("salary: " + result);
		scanner.close(); 
	}
}