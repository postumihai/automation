package testCases;

import  java.sql.Connection;
import  java.sql.Statement;
import  java.sql.ResultSet;
import  java.sql.DriverManager;
import  java.sql.SQLException;

public class DB_TC {

        public static void  main(String[] args) throws ClassNotFoundException, SQLException, SQLException {
            //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
            String dbUrl = "jdbc:mysql://localhost:3306/sample";

            //Database Username
            String username = "root";

            //Database Password
            String password = "Pa$$w0rd";

            //Query to Execute
            String query = "select *  from agents;";

            //Load mysql jdbc driver
            Class.forName("com.mysql.jdbc.Driver");

            //Create Connection to DB
            Connection con = DriverManager.getConnection(dbUrl,username,password);

            //Create Statement Object
            Statement stmt = con.createStatement();

            // Execute the SQL Query. Store results in ResultSet
            ResultSet rs= stmt.executeQuery(query);

            // While Loop to iterate through all data and print results
            while (rs.next()){
                String myName = rs.getString(1);
                String myAge = rs.getString(2);
                String Other = rs.getString(3);
                String Other2 = rs.getString(3);
                System. out.println(myName+"  "+myAge+"  "+Other);
            }
            // closing DB Connection
            con.close();
        }
    }

