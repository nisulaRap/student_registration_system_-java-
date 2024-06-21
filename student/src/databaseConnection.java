
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nisula Premaratne
 */

//Typed code database connection
public class databaseConnection {
    static Connection connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/userdb","root","");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }    
    }
}
