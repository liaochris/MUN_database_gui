import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conference {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/EMP";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "rootpass";

	public static void namesOfEveryoneGoingToConference(String conference) {
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
			sql = "SELECT Name as NAMES from MUN_DATA_CONFERENCE WHERE CONFERENCE_AND_YEAR LIKE'%"+conference+"%'";
			ResultSet rs = stmt.executeQuery(sql);
			//STEP 5: Extract data from result set
			System.out.println("Here is the list of people going to the conference: ");
			while(rs.next()){
				String name = rs.getString("NAMES");
				System.out.print(name + ", ");
			}			
		}
		catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
	public static void getFormStatus(String conference) {
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
			sql = "SELECT  NAME, SOI, PAUSD_FORM, CONFERENCE_EMERGENCY, CONFERENCE_WAIVER FROM MUN_DATA_CONFERENCE WHERE CONFERENCE_AND_YEAR LIKE'%"+conference+"%'";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column name

				String name = rs.getString("NAME");
				String soi = rs.getBoolean("SOI") == true ? "turned in" : "not turned in"; 
				String pausd_form = rs.getBoolean("PAUSD_FORM") == true ? "turned in" : "not turned in"; 
				String conference_emergency = rs.getBoolean("CONFERENCE_EMERGENCY") == true ? "turned in" : "not turned in"; 
				String conference_waiver = rs.getBoolean("CONFERENCE_WAIVER") == true ? "turned in" : "not turned in"; 


				//Display values
				System.out.print("Name: " + name);
				System.out.print(",   soi: " + soi);
				System.out.print(",   pausd form: " + pausd_form);
				System.out.print(",   conference disclosure form: " + conference_emergency);
				System.out.print(",   conference waiver: " + conference_waiver);
				System.out.println("");
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
	public static void numberOfPeopleGoingToConference(String conference) {
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
			sql = "SELECT COUNT(*) FROM MUN_DATA_CONFERENCE WHERE CONFERENCE_AND_YEAR LIKE'%"+conference+"%'";
			ResultSet rs = stmt.executeQuery(sql);
			//STEP 5: Extract data from result set
			while(rs.next()){
				String cnt = rs.getString("COUNT(*)");
				System.out.print("There are a total number of " + cnt + " people going to " + conference + ".");
			}
		}
		catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
	public static void emailListForConference(String conference) {
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
			sql = "SELECT  EMAIL FROM MUN_DATA_CONFERENCE WHERE CONFERENCE_AND_YEAR LIKE '%" + conference+"%'";
			ResultSet rs = stmt.executeQuery(sql);
			//STEP 5: Extract data from result set
			System.out.println("Here is the list of emails for people going to the conference: ");
			while(rs.next()){
				String email = rs.getString("EMAIL");
				System.out.println(email);
			}
		}
		catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
	public static void parentEmailListForConference(String conference) {
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
			sql = "SELECT PARENT_EMAIL FROM MUN_DATA_CONFERENCE WHERE CONFERENCE_AND_YEAR LIKE '%" + conference+"%'";
			ResultSet rs = stmt.executeQuery(sql);
			//STEP 5: Extract data from result set
			System.out.println("Here is the list of emails for people going to the conference: ");
			while(rs.next()){
				String email = rs.getString("EMAIL");
				System.out.println(email);
			}
		}
		catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
    public static void phoneListForConference(String conference) {
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
			sql = "SELECT PHONE_NUMBER FROM MUN_DATA_CONFERENCE WHERE CONFERENCE_AND_YEAR LIKE '%" + conference+"%'";
			ResultSet rs = stmt.executeQuery(sql);
			//STEP 5: Extract data from result set
			System.out.println("Here is the list of phone numbers for people going to the conference: ");
			while(rs.next()){
				String phone_num = rs.getString("PHONE_NUMBER");
				System.out.println(phone_num);
			}
		}
		catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
    public static void parentsCanChaperone(String conference) {
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
			sql = "SELECT  NAME FROM MUN_DATA_CONFERENCE WHERE CONFERENCE_AND_YEAR LIKE '%" + conference+"%' AND PARENT_CHAPERONE IS NOT NULL";
			ResultSet rs = stmt.executeQuery(sql);
			//STEP 5: Extract data from result set
			System.out.println("Here is the names for people whose parents can chaperone: ");
			while(rs.next()){
				String name = rs.getString("NAME");
				System.out.print(name + " ,");
			}
		}
		catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
    public static void deletePerson(String name, String conference) {
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
			sql = "DELETE FROM MUN_DATA_CONFERENCE WHERE NAME LIKE'%"+name+"%' AND CONFERENCE_AND_YEAR LIKE '%" + conference+"%'";
			stmt.executeUpdate(sql);
			System.out.println(name + " has been deleted and will not be going to " + conference + ".");
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}	
    public static void turnedInSOI(String name, String conference) {
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
			sql = "UPDATE MUN_DATA_CONFERENCE SET SOI = 1 WHERE NAME LIKE'%"+name+"%' AND CONFERENCE_AND_YEAR LIKE '%" + conference+"%'";
			stmt.executeUpdate(sql);
			System.out.println(name + " has turned in their SOI for " + conference + "!");
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}	
    public static void turnedInPAUSD(String name, String conference) {
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
			sql = "UPDATE MUN_DATA_CONFERENCE SET PAUSD_FORM = 1 WHERE NAME LIKE'%"+name+"%' AND CONFERENCE_AND_YEAR LIKE '%" + conference+"%'";
			stmt.executeUpdate(sql);
			System.out.println(name + " has turned in their PAUSD Form for " + conference + "!");
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}	
    public static void turnedInConferenceDisclosure(String name, String conference) {
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
			sql = "UPDATE MUN_DATA_CONFERENCE SET CONFERENCE_EMERGENCY = 1 WHERE NAME LIKE'%"+name+"%' AND CONFERENCE_AND_YEAR LIKE '%" + conference+"%'";
			stmt.executeUpdate(sql);
			System.out.println(name + " has turned in their conference disclosure form for " + conference + "!");
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}	
    public static void turnedInConferenceWaiver(String name, String conference) {
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
			sql = "UPDATE MUN_DATA_CONFERENCE SET CONFERENCE_WAIVER = 1 WHERE NAME LIKE'%"+name+"%' AND CONFERENCE_AND_YEAR LIKE '%" + conference+"%'";
			stmt.executeUpdate(sql);
			System.out.println(name + " has turned in their conference waiver  for " + conference + "!");
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
	}
    
}