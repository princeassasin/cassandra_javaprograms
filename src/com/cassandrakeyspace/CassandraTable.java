package com.cassandrakeyspace;

public abstract class CassandraTable extends Cassadra_Keyspace{

	 
	public String createtable() {
		
		String query1 = "CREATE TABLE emp(emp_id int PRIMARY KEY, "
		         + "emp_name text, "
		         + "emp_city text, "
		         + "emp_sal varint, "
		         + "emp_phone varint );";	
		return query1;
	}
	
	public abstract String createdata1();
	public abstract String createdata2();
	public abstract String createdata3();
}

