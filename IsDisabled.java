package DDL;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class isDisabled {
	public static void main(String args[]) throws IOException, MasterNotRunningException {
		Configuration conf = HBaseConfiguration.create(); 
		HBaseAdmin had = new HBaseAdmin(conf); 
		boolean is_disbaled = had.isTableDisabled("FirstTable"); 
                System.out.println("The table is Disabled: ");
		System.out.println(is_disbaled);
	}
}