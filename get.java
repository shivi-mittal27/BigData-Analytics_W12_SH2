package DML;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

public class GetDataFromTable {
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create(); 
		String Table ="Employee";
		HTable Htable = new HTable(conf, "Table"); 
		Get gr = new Get(Bytes.toBytes("01")); 
		Result result = Htable.get(gr); 
	
		byte[] value = result.getValue(Bytes.toBytes("colf_1"),Bytes.toBytes("Name"));
		String name_values = Bytes.toString(value); 
		System.out.println("Name: " + name_values);
	}
}