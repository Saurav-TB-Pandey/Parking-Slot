package searching;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
 

public class searching  {
	static Scanner sc= new Scanner (System.in);
	
//	static void vehical_type1() {
//		System.out.println("Press 1 for 2-wheeler");
//		System.out.println("press 2 for 4-wheeler");
//		int j=sc.nextInt();
//		switch(j) {
//		case 1:
//			System.out.println("There are 10 slots available for 2-wheeler");
//			break;
//		case 2: 
//			System.out.println("There are 10 slots available for 4-wheeler");
//			break;
//		}
//	}
	static String date() {
		
		 System.out.println("enter your date of booking with space");	
		 LocalDateTime a= LocalDateTime.now();
		 DateTimeFormatter b= DateTimeFormatter.ofPattern("dd-mm-yyyy");
		 String date1 =a.format(b);
	   return date1;
	}
	   static String time() {
		   LocalDateTime a= LocalDateTime.now();
		   DateTimeFormatter c= DateTimeFormatter.ofPattern("hh-mm a");
			 String time1 =a.format(c);
			 System.out.println( "date of booking is:- " + time1);
	   return time1;  
	    
	}
	   //database connectivity part /////////
	   
//	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connecting to the database");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","Rishavkumar3738@");
			System.out.println("you are connected to data base");
			System.out.println("inserting data or record into the table called user");
//	/////////////////////////////////////////	
//			

	   System.out.println("Enter the area or location :- ");
	   System.out.println("press 1 for mohali");
	   System.out.println("press 2 for chandigrah");
	   System.out.println("press 3 for rajpura");
	   System.out.println("press 4 for patiala");
	 
         int area = sc.nextInt();
         switch (area) {
       case 1:
    	   String area1= "mohali";
    	   System.out.println("select your parking area name :- ");
    	   System.out.println("press 1 for IT park mohali");
    	   System.out.println("press 2 for sector 53 mohali");
    	   System.out.println("press 3 for parking area 6 mohali");
    	   System.out.println("press 4 for parking area 7 mohali");
    	   
    	   
    	   int parking_area = sc.nextInt();
    	   switch(parking_area) {
    	   case 1:
    		    System.out.println("you selected IT park mohali");
    		    String s="IT park";
//    		    vehical_type();
//    ///////taking database from user////////////////
    		    
    		    String sql = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
				PreparedStatement pstmt= conn.prepareStatement(sql);
//				String s= "hello";
				pstmt.setString(1, area1);
				pstmt.setString(2, s);
				pstmt.setString(3, date());
				pstmt.setString(4, time());
				System.out.println(pstmt);
			int result=	pstmt.executeUpdate();
			System.out.println(result);
									
				System.out.println("inserted record into the table ..please verify");
	
    		   
    		   break;
    	   case 2:
    		   System.out.println("you selected sector 53 mohali");
    		   String s1 = "sector 53";
    		 //taking detail for data base  
    		   
    		   String sql1 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
				PreparedStatement pqstmt= conn.prepareStatement(sql1);
				pqstmt.setString(1, area1);
				pqstmt.setString(2, s1);
				pqstmt.setString(3, date());
				pqstmt.setString(4, time());
				System.out.println(pqstmt);
			int result1=	pqstmt.executeUpdate();
			System.out.println(result1);
			System.out.println("inserted record into the table ..please verify");
			
    		   break;
    	   case 3:
    		   System.out.println("you selected parking area 6 mohali");
    		   String s2 = "parking area 6";
    		  //taking detail for database
    		   
    		   String sql2 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
				PreparedStatement pstmt2= conn.prepareStatement(sql2);
//				String s= "hello";
				pstmt2.setString(1, area1);
				pstmt2.setString(2, s2);
				pstmt2.setString(3, date());
				pstmt2.setString(4, time());
				System.out.println(pstmt2);
			int result2=	pstmt2.executeUpdate();
			System.out.println(result2);
			System.out.println("inserted record into the table ..please verify");
			
    		   break;
    	   case 4:
    		   System.out.println("you selected parking area 7 mohali");
    		   String s3 = "parking area 7";
    		   //taking detail for database
    		   
    		   String sql3 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
				PreparedStatement pstmt3= conn.prepareStatement(sql3);
//			
				pstmt3.setString(1, area1);
				pstmt3.setString(2, s3);
				pstmt3.setString(3, date());
				pstmt3.setString(4, time());
				System.out.println(pstmt3);
			int result3=	pstmt3.executeUpdate();
			System.out.println(result3);
			System.out.println("inserted record into the table ..please verify");
			
    		   
    		   break;
    	   }
    	   break;
       case 2: 
    	   String area2="chandigrah";
    	   System.out.println("select your parking area name :- ");
    	   System.out.println("press 1 for sector 17C");
    	   System.out.println("press 2 for sector 34 A");
    	   System.out.println("press 3 for sector 17 D");
    	   System.out.println("press 4 for GMCH 32 ");
    	   int parking_area1 = sc.nextInt();
    	   switch(parking_area1) {
    	   case 1:
    		   System.out.println("you selected 17C");
    	     String p= "sector 17c";
    	     
    	     String sql4 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
				PreparedStatement pstmt4= conn.prepareStatement(sql4);
				 //taking detail for data base
				pstmt4.setString(1, area2);
				pstmt4.setString(2, p);
				pstmt4.setString(3, date());
				pstmt4.setString(4, time());
				System.out.println(pstmt4);
			int result4=	pstmt4.executeUpdate();
			System.out.println(result4);
			System.out.println("inserted record into the table ..please verify");
			
    		   
    		   break;
    	   case 2:
    		   System.out.println("you selected sector 34A");
    		   String p1= "sector 34A";
    		   //taking detail for data base
    		   
    		   String sql5 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
				PreparedStatement pstmt5= conn.prepareStatement(sql5);
				pstmt5.setString(1, area2);
				pstmt5.setString(2, p1);
				pstmt5.setString(3, date());
				pstmt5.setString(4, time());
				System.out.println(pstmt5);
			int result5=	pstmt5.executeUpdate();
			System.out.println(result5);
			System.out.println("inserted record into the table ..please verify");
			
    		   
    		   break;
    	   case 3:
    		   System.out.println("you selected sector 17D");
    		   String p2= "sector 17D";
    		   //taking detail for data base
    		   
    		   String sql6 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
				PreparedStatement pstmt6= conn.prepareStatement(sql6);
				pstmt6.setString(1, area2);
				pstmt6.setString(2, p2);
				pstmt6.setString(3, date());
				pstmt6.setString(4, time());
				System.out.println(pstmt6);
			int result6=	pstmt6.executeUpdate();
			System.out.println(result6);
			System.out.println("inserted record into the table ..please verify");
			
    		   
    		   break;
    	   case 4:
    		   System.out.println("you selected GMCH 32");
    		   String p3= "GMCH 32";
    		   //taking detail for data base
    		   String sql7 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
				PreparedStatement pstmt7= conn.prepareStatement(sql7);
            	pstmt7.setString(1, area2);
				pstmt7.setString(2, p3);
				pstmt7.setString(3, date());
				pstmt7.setString(4, time());
				System.out.println(pstmt7);
			int result7=	pstmt7.executeUpdate();
			System.out.println(result7);
			System.out.println("inserted record into the table ..please verify");
			
    		   
    		   break;
    	   }
    	   break;
       case 3:
    	   String area3 = "Rajpura";
    	   System.out.println("select your parking area name :- ");
    	   System.out.println("press 1 for RTTC Bsnl parking");
    	   System.out.println("press 2 for railway parking");
    	   System.out.println("press 3 for chahal parking");
    	   System.out.println("press 4 for bypass parking ");
    	   int parking_area2 = sc.nextInt();
    	   switch(parking_area2) {
    	   case 1:
    		   System.out.println("you selected RTTC Bsnal parking");
    		  String q= "RTTC Bsnal parking";
    		  //taking detail for data base
    		  String sql8 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
				PreparedStatement pstmt8= conn.prepareStatement(sql8);
				pstmt8.setString(1, area3);
				pstmt8.setString(2, q);
				pstmt8.setString(3, date());
				pstmt8.setString(4, time());
				System.out.println(pstmt8);
			int result8=	pstmt8.executeUpdate();
			System.out.println(result8);
			System.out.println("inserted record into the table ..please verify");
			
    		  
    		   break;
    	   case 2:
    		   System.out.println("you selected sector railway parking");
    		   String q1= "railway parking";
    		   //taking detail for data base
    		   
     		  String sql9 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
 				PreparedStatement pstmt9= conn.prepareStatement(sql9);
 				pstmt9.setString(1, area3);
 				pstmt9.setString(2, q1);
 				pstmt9.setString(3, date());
 				pstmt9.setString(4, time());
 				System.out.println(pstmt9);
 			int result9=	pstmt9.executeUpdate();
 			System.out.println(result9);
 			System.out.println("inserted record into the table ..please verify");
 			
    		   
    		   break;
    	   case 3:
    		   System.out.println("you selected chahal parking");
    		   String q2= "chahal parking";
    		   //taking detail for data base
    		   
     		  String sql11 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
 				PreparedStatement pstmt11= conn.prepareStatement(sql11);
 				pstmt11.setString(1, area3);
 				pstmt11.setString(2, q2);
 				pstmt11.setString(3, date());
 				pstmt11.setString(4, time());
 				System.out.println(pstmt11);
 			int result11=	pstmt11.executeUpdate();
 			System.out.println(result11);
 			System.out.println("inserted record into the table ..please verify");
 			
    		   
    		   break;
    	   case 4:
    		   System.out.println("you selected bypass parking");
    		   String q3= "bypass parking";
    		   //taking detail for data base
     		  String sql12 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
 				PreparedStatement pstmt12= conn.prepareStatement(sql12);
 				pstmt12.setString(1, area3);
 				pstmt12.setString(2, q3);
 				pstmt12.setString(3, date());
 				pstmt12.setString(4, time());
 				System.out.println(pstmt12);
 			int result12=	pstmt12.executeUpdate();
 			System.out.println(result12);
 			System.out.println("inserted record into the table ..please verify");
 			
    		   
    		   break;
    	   }
    	   break;
       case 4:
    	   String area4 = "patiala";
    	   System.out.println("select your parking area name :- ");
    	   System.out.println("press 1 for court parking");
    	   System.out.println("press 2 for Atam's car parking");
    	   System.out.println("press 3 for tagore parking");
    	   System.out.println("press 4 for Gurdwara parking ");
    	   
    	   int parking_area3 = sc.nextInt();
    	   switch(parking_area3) {
    	   case 1:
    		   System.out.println("you selected Court4 parking");
    		   String w= "court4"; 
    		   //taking detail for data base
    		   
     		  String sql13 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
 				PreparedStatement pstmt13= conn.prepareStatement(sql13);
 				pstmt13.setString(1, area4);
 				pstmt13.setString(2, w);
 				pstmt13.setString(3, date());
 				pstmt13.setString(4, time());
 				System.out.println(pstmt13);
 			int result13=	pstmt13.executeUpdate();
 			System.out.println(result13);
 			System.out.println("inserted record into the table ..please verify");
 			
    		   
    		   break;
    	   case 2:
    		   System.out.println("you selected Atam's car parking");
    		   String w1= "Atam's parking"; 
    		   //taking detail for data base
    		   
     		  String sql14 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
 				PreparedStatement pstmt14= conn.prepareStatement(sql14);
 				pstmt14.setString(1, area4);
 				pstmt14.setString(2, w1);
 				pstmt14.setString(3, date());
 				pstmt14.setString(4, time());
 				System.out.println(pstmt14);
 			int result14=	pstmt14.executeUpdate();
 			System.out.println(result14);
 			System.out.println("inserted record into the table ..please verify");
 			
    		   
    		   break;
    	   case 3:
    		   System.out.println("you selected tagore parking");
    		   String w2= "tagore parking"; 
    		   //taking detail for data base
    		   
      		  String sql15 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
  				PreparedStatement pstmt15= conn.prepareStatement(sql15);  				pstmt15.setString(1, area4);
  				pstmt15.setString(2, w2);
  				pstmt15.setString(3, date());
  				pstmt15.setString(4, time());
  				System.out.println(pstmt15);
  			int result15=	pstmt15.executeUpdate();
  			System.out.println(result15);
  			System.out.println("inserted record into the table ..please verify");
  			
    		   
    		   break;
    	   case 4:
    		   System.out.println("you selected Gurdwara parking");
    		   String w3= "Gurdwara parking"; 
    		   //taking detail for data base
    		   
      		  String sql16 = "INSERT INTO user "+" (Area,Parking_area,Entry_Date,Entry_Time) VALUES "+"(?,?,?,?)";
  				PreparedStatement pstmt16= conn.prepareStatement(sql16);
  				pstmt16.setString(1, area4);
  				pstmt16.setString(2, w3);
  				pstmt16.setString(3, date());
  				pstmt16.setString(4, time());
  				System.out.println(pstmt16);
  			int result16=	pstmt16.executeUpdate();
  			System.out.println(result16);
  			System.out.println("inserted record into the table ..please verify");
  			
    		   
    		   break;
    	   
    	   }
    	   break;
       }
		}
	
		catch (SQLException se){
			se.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (stmt!=null)
					conn.close();
				
			}catch(SQLException se) {
				se.printStackTrace();
			
		}
	}
	}
//		
}
//}
