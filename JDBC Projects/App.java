package com.productJdbc.productProject;

import java.util.Scanner; // import Scanner Class.

import java.sql.*;  // import sql classes.
public class App  // create a main Class.
{
    public static void main( String[] args ) // create main() method. 
    {
    	String url="jdbc:mysql://localhost:3306/school"; // initialize the url.
		String user="root"; // initialize username as root.
		String pass="root"; // initialize password as root.
    	try // create try block for handling the run time sql exceptions.
    	{
    		Connection con=DriverManager.getConnection(url,user,pass); // create connection object con.
    		if(con.isClosed()) // check connection is establish or not.
    		{
    			System.out.println("Connection Not Established.\n");
    		}
    		else
    		{
    			System.out.println("Connection Established.\n");
    		}
    		Scanner sc=new Scanner(System.in); //create Scanner object sc.
       		int ch,ProductId,ProductPrice; // declare int type variables.
    		String ProductName,ProductDescription; // declare String type Variables.
    		do // start do-while loop here.
    		{
    			System.out.println("=========Menu========");
    			System.out.println("1. Create Table.");
    			System.out.println("2. Add New Data To The Table.");
    			System.out.println("3. Delete Data From Table.");
    			System.out.println("4. Update Data In The Table.");
    			System.out.println("5. View All Data From Table.");
    			System.out.println("6. Exit.");
    			System.out.println("Enter Your Choice :");
    			ch=sc.nextInt(); // get book id from user.
    			switch(ch) // it is used to check multiple cases.
    			{
    			case 1: // case 1 created.
    				String q="create table product(product_Id int primary key,product_Name varchar(50) not null,product_Price int not null,product_Description varchar(50) not null)"; // create query.
    				Statement stm=con.createStatement(); // create Statement object .
    				stm.execute(q); // execute query q.
    				System.out.println("Table Created Successfully...!");
    				break; // break the case execution. 
    			case 2: // case 2 created.
    				System.out.println("Enter Product Id :");
    				ProductId=sc.nextInt(); // get Product id from user.
    				System.out.println("Enter Product Name :");
    				ProductName=sc.next();// get Product name from user.
    				System.out.println("Enter Product Price :");
    				ProductPrice=sc.nextInt(); // get Product Price from user.
    				System.out.println("Enter Product Description :"); 
    				ProductDescription=sc.next(); // get Product Description from user.
    				String q1="insert into product values(?,?,?,?)"; // insert query.
    				PreparedStatement ps=con.prepareStatement(q1); // create prepareStatement object query.
    				ps.setInt(1, ProductId); // set product id .
    				ps.setString(2, ProductName); // set product name.
    				ps.setInt(3, ProductPrice); // set product Price.
    				ps.setString(4, ProductDescription); // set product description.
    				ps.executeUpdate();// execute and update query.
    				System.out.println("Data Inserted Successfully...!");
    				break; //break the case.
    			case 3: // case 3 created.
    				System.out.println("Enter Product Id to Delete Data from Table :");
    				ProductId=sc.nextInt(); // get product id from user.
    				String q2="delete from product where product_Id=?"; // delete query.
    				PreparedStatement ps1=con.prepareStatement(q2); // create perparedStatement object with query.
    				ps1.setInt(1, ProductId); // set product id from user.
    				ps1.executeUpdate(); // execute and update query.
    				System.out.println("Data Deleted Successfully...!");
    				break; // break the case.
    			case 4: // case 4 created.
    				System.out.println("Enter Product Name :");
    				ProductName=sc.next(); // get product name from user.
    				System.out.println("Enter Product Id for Update Product Name :");
    				ProductId=sc.nextInt(); // get product id from user.
    				System.out.println("Enter Product Price :");
    				ProductPrice=sc.nextInt(); // get product price from user.
    				System.out.println("Enter New Description :");
    				ProductDescription=sc.next(); // get product description from user.
    				String q3="update product set product_Name=?,product_Price=?,product_Description=? where product_Id=?";
    				PreparedStatement ps2=con.prepareStatement(q3); //  create perparedStatement object with query.
    				ps2.setString(1, ProductName); // set product name .
    				ps2.setInt(2, ProductPrice); // set product price.
    				ps2.setString(3, ProductDescription); // set product description.
    				ps2.setInt(4, ProductId); // set product id.
    				ps2.executeUpdate(); // execute and update query.
    				System.out.println("Data Updated Successfully...!");
    				break; // break the case.
    			case 5: // case 5 created.
    				String q4="select product_Id,product_Name,product_Price,product_Description from product"; // select query.
    				Statement st=con.createStatement(); // create Statement object.
    				ResultSet set=st.executeQuery(q4); // create ResultSet object with query.
    				while(set.next()) // create while loop with next() method for get next set row from table.
    				{
    					int pid=set.getInt(1); // get product id from table and store in bid variable.
    					String pname=set.getString(2); // get product name from table and store in bname variable.
    					int pprice=set.getInt(3); // get product price from table and store in aname variable.
    					String pdescription=set.getString(4); // get product description from table and store in pdescription variable.
    					System.out.println(pid+" "+pname+" "+pprice+" "+pdescription+"\n"); // print all values of a table.
    				}
    				break;// break the case.
    			}
    			
    		}while(ch!=6);  // check the condition here when it is false then the do-while loop ends.
    		
    	}
    	catch(Exception e) // catch block is used to handle the exceptions given by the try block.
    	{
    		System.out.println(e);// print exception message.
    	}
    	
    }
}

