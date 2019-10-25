package DML;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;

public class delete {
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create();
		String Table = "Employee"; // table name
		HTable Htable = new HTable(conf, Table); 
		Delete delete_data = new Delete(Bytes.toBytes(04));  // Row 4
		delete_data.deleteColumn(Bytes.toBytes("cofl_3"), Bytes.toBytes("City"));
		
		Htable.delete(delete_data); 
		Htable.close();
		System.out.println("Data is deleted from the selected table");
	}
}