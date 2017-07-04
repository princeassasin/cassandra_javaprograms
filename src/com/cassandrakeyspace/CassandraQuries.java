package com.cassandrakeyspace;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraQuries extends Cassadra_Keyspace{

	 
	public String createquery2() {
		
		String query1 = "CREATE TABLE emp(emp_id int PRIMARY KEY, "
		         + "emp_name text, "
		         + "emp_city text, "
		         + "emp_sal varint, "
		         + "emp_phone varint );";	
		return query1;
	}
	public static void main (String args[])  {
		

		Cassadra_Keyspace cq = new CassandraQuries();
		
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		
		Session session = cluster.connect();
		
		session.execute(cq.createquery());
		
		session.execute("USE sriram");
		
		session.execute(cq.createquery2());
		
		System.out.println("key created");
		System.out.println("table created ");
	}
}
