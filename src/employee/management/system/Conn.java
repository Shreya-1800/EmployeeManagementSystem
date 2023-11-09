package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           c= DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","Shreya@2002");
           s= c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
