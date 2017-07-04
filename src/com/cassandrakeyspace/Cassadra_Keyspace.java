package com.cassandrakeyspace;

//import com.datastax.*;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Cassadra_Keyspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String query = "CREATE KEYSPACE tp WITH replication "
			         + "= {'class':'SimpleStrategy', 'replication_factor':3};";
			                    
			      //creating Cluster object
			      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
			    
			      //Creating Session object
			      Session session = cluster.connect();
			     
			      //Executing the query
			      session.execute(query);
			     
			      //using the KeySpace
			      session.execute("USE tp");
			      System.out.println("Keyspace created"); 
	}

}
