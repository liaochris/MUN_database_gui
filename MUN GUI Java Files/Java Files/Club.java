import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Club {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/EMP";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "rootpass";

	public static void getAllMemberInformation() {
		String result = "";
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query

			stmt = conn.createStatement();
			String sql;
			sql = "SELECT NAME, EMAIL,PHONE_NUMBER, GRADE, CONFERENCE_AND_YEAR, SOI, PAUSD_FORM, CONFERENCE_EMERGENCY, CONFERENCE_WAIVER, PARENT_EMAIL, PARENT_NAME, PARENT_PHONE_NUMBER,PARENT_CHAPERONE FROM MUN_DATA_CONFERENCE";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column name
				String name = rs.getString("NAME");
				String email = rs.getString("EMAIL");
				int phone_number = rs.getInt("PHONE_NUMBER");
				int grade = rs.getInt("GRADE");
				String conference_year = rs.getString("CONFERENCE_AND_YEAR");
				boolean soi = rs.getBoolean("SOI");
				boolean pausd_form = rs.getBoolean("PAUSD_FORM");
				boolean conference_emergency = rs.getBoolean("CONFERENCE_EMERGENCY");
				boolean conference_waiver = rs.getBoolean("CONFERENCE_WAIVER");
				String parent_name = rs.getString("PARENT_NAME");
				String parent_email = rs.getString("PARENT_EMAIL");
				int parent_phone_number = rs.getInt("PARENT_PHONE_NUMBER");
				boolean parent_chaperone = rs.getBoolean("PARENT_CHAPERONE");

				//Display values
				System.out.print("Name: " + name);
				System.out.print(",   email: " + email);
				System.out.print(",   phone number: " + phone_number);
				System.out.print(",   grade: " + grade);
				System.out.print(",   conference: " + conference_year);
				System.out.print(",   soi: " + soi);
				System.out.print(",   pausd form: " + pausd_form);
				System.out.print(",   conference disclosure form: " + conference_emergency);
				System.out.print(",   conference waiver: " + conference_waiver);
				System.out.print(",   parent email: " + parent_email);
				System.out.print(",   parent name: " + parent_name);
				System.out.print(",   parent phone number: " + parent_phone_number);
				System.out.println(",   parent chaperone: " + parent_chaperone);

			}
			//STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}// nothing we can do
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
	}//end main
	public static void getAllEmails() {
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query

			stmt = conn.createStatement();
			String sql;
			sql = "SELECT EMAIL FROM MUN_DATA_CONFERENCE";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column name

				
				String email = rs.getString("EMAIL");
				
				//Display values
				
				System.out.println(email);
				

			}
			//STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}// nothing we can do
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main
	public static void getAllPhoneNumbers() {
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query

			stmt = conn.createStatement();
			String sql;
			sql = "SELECT NAME, EMAIL,PHONE_NUMBER, GRADE, CONFERENCE_AND_YEAR, SOI, PAUSD_FORM, CONFERENCE_EMERGENCY, CONFERENCE_WAIVER, PARENT_NAME, PARENT_EMAIL, PARENT_PHONE_NUMBER,PARENT_CHAPERONE FROM MUN_DATA_CONFERENCE";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column name
				String phone_num = rs.getString("PHONE_NUMBER");
				//Display values
				System.out.println(phone_num);
			}
			//STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}// nothing we can do
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
	}//end main
	public static void numberOfMembers() {
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query

			stmt = conn.createStatement();
			String sql;
			sql = "SELECT COUNT(*) AS total FROM MUN_DATA_CONFERENCE";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				int total = rs.getInt("total");
				System.out.println("The total number of members in this club right now is " + total);
			}
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}	
	public static void getPhoneNumber(String name) {
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query

			stmt = conn.createStatement();
			String sql;
			sql = "SELECT NAME, PHONE_NUMBER FROM MUN_DATA_CONFERENCE WHERE NAME LIKE'%"+name+"%'";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				String n = rs.getString("NAME");
				Integer p = rs.getInt("PHONE_NUMBER");
				if (n.equals(name)) {
					System.out.println(n + "'s phone number is " + p);
				}
				
			}
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}	
	public static void getEmail(String name) {
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query

			stmt = conn.createStatement();
			String sql;
			sql = "SELECT NAME, EMAIL FROM MUN_DATA_CONFERENCE WHERE NAME LIKE'%"+name+"%'";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				String n = rs.getString("NAME");
				String e = rs.getString("EMAIL");
				if (n.equals(name)) {
					System.out.println(n + "'s email is " + e);
				}
			}
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
	public static void getParentEmail() {
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query

			stmt = conn.createStatement();
			String sql;
			sql = "SELECT PARENT_EMAIL FROM MUN_DATA_CONFERENCE";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column name

				
				String remail = rs.getString("PARENT_EMAIL");
				
				//Display values
				
				System.out.println(remail);
				

			}
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
	
	public static void deletePerson(String name) {
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query

			stmt = conn.createStatement();
			String sql;
			sql = "DELETE FROM MUN_DATA_CONFERENCE WHERE NAME = '%'+name+'%'";
			stmt.executeUpdate(sql);
			System.out.println(name + " has been deleted.");
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}	
	public static void loadData(String location) {
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query

			stmt = conn.createStatement();
			String sql;
			sql = "LOAD DATA LOCAL INFILE \"" + location + "\"INTO TABLE MUN_DATA_CONFERENCE LINES TERMINATED BY '\r\n'";
			stmt.executeUpdate(sql);
			System.out.println("Data loaded...");
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
	public static void deleteAll() {
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//STEP 4: Execute a query

			stmt = conn.createStatement();
			String sql;
			sql = "TRUNCATE TABLE MUN_DATA_CONFERENCE";
			stmt.executeUpdate(sql);
			System.out.println("All data has been removed.");
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}	
}
