package com.cassandrakeyspace;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraMain {

	public static void  main(String args[]) {

		Cassadra_Keyspace cq = new Cassandra_Insertdata();
		
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		
		Session session = cluster.connect();
		
		session.execute(cq.createquery());
		
		session.execute("USE sriram");
		
		session.execute(cq.createtable());
		
		session.execute(cq.createdata1());
		
		session.execute(cq.createdata2());
		
		session.execute(cq.createdata3());
		
		
		System.out.println("key created");
		System.out.println("table created ");
		System.out.println("created data1");
		System.out.println("created data2");
		System.out.println("created data3");
	}
}
