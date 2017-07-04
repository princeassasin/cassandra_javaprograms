package com.cassandrakeyspace;

public abstract class Cassadra_Keyspace  {

	public String createquery() {
	
		 String query = "CREATE KEYSPACE sriram WITH replication "
		         + "= {'class':'SimpleStrategy', 'replication_factor':3};";		    
	
		 return query;
		 
		
	}
	
	public abstract String  createtable(); 
	public abstract String createdata1() ;
	public abstract String createdata2(); 
	public abstract String createdata3();
}
