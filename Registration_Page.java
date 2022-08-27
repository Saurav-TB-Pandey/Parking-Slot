import java.util.*;

public class Registration_Page
        {
            public static void main(String[] args)
            {
                String vehicle_number,address,mobile_number,vehicle_type,first_name,last_name,password;
                Scanner input= new Scanner(System.in);

                System.out.print("First Name- ");
                first_name= input.nextLine();          // Taking First Name

                System.out.print("Last Name- ");
                last_name= input.nextLine();           // Taking Last Name

                System.out.print("Address- ");
                address= input.nextLine();             // Taking Address

                System.out.print("Mobile Number- ");
                mobile_number= input.nextLine();       // Taking Mobile Number

                System.out.print("Vehicle Type- ");
                vehicle_type= input.nextLine();        // Taking Vehicle Type

                System.out.print("Vehicle Number- ");
                vehicle_number= input.nextLine();      // Taking Vehicle Number

                System.out.print("Create Password- ");
                password= input.nextLine();

                System.out.println("\nCongratulations, Your Registration Is Done");
                System.out.println("Your Details\n");
                System.out.print("Your Name- " +first_name+ " " +last_name+
                        "\nYour Address- " +address+
                        "\nYour Mobile No: " +mobile_number+
                        "\nVehicle Type- " +vehicle_type+
                        "\nVehicle No: " +vehicle_number+
                        "\nPassword: *********");
        }
}
