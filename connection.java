import  java.sql.*;
import  java.util.*;
public  class connection
{
        static void sql (String first_name, String last_name, String address,long mobile_number, String
        vehicle_type, String vehicle_number, String password)
        {
            Connection conn = null;
            Statement stmt = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parking_slot", "root", "12345678");

                stmt = conn.createStatement();
                String sql = "INSERT INTO User_Details (First_Name,Last_Name,Address,Mobile_Number,Vehicle_Type,Vehicle_Number,Password_) values (?,?,?,?,?,?,?)";

                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, first_name);
                pstmt.setString(2, last_name);
                pstmt.setString(3, address);
                pstmt.setLong(4, mobile_number);
                pstmt.setString(5, vehicle_type);
                pstmt.setString(6, vehicle_number);
                pstmt.setString(7, password);

                pstmt.executeUpdate();

            } catch (SQLException se) {
                se.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (stmt != null)
                        conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }
