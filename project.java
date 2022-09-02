import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.awt.SystemColor.info;

public class project
{
    public static void main (String[] args)
    {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "289731");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from details");
            while (resultSet.next())
            {
                System.out.println(resultSet.getString("name"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
