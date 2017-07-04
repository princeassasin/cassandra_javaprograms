package com.cassandrakeyspace;

public class Cassandra_Insertdata extends CassandraTable{

	
	@Override
	public String createdata1() {
		 String query1= "INSERT INTO emp (emp_id, emp_name, emp_city, emp_phone,  emp_sal)"
					
       + " VALUES(1,'ram', 'Hyderabad', 9848022338, 50000);" ;
		 return query1;
	}
	
	@Override
	public String createdata2() {
		 String query2 = "INSERT INTO emp (emp_id, emp_name, emp_city,emp_phone, emp_sal)"
				    
       + " VALUES(2,'robin', 'Hyderabad', 9848022339, 40000);" ;
         return query2;
	}

	@Override
	public String createdata3() {
		 String query3 = "INSERT INTO emp (emp_id, emp_name, emp_city, emp_phone, emp_sal)"
			     
       + " VALUES(3,'rahman', 'Chennai', 9848022330, 45000);" ;

         return query3;
	}
}
