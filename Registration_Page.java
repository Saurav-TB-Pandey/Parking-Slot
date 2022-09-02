import java.util.*;

class Taking_Inputs
{
    static String vehicle_number,address,vehicle_type,first_name,last_name,password,mobileno;
    static long mobile_number;
    static Scanner input= new Scanner(System.in);
    public static void inputs()
    {
        System.out.println("**********************  WELCOME TO PARKING SYSTEM APPLICATION  ************************");
        System.out.println("**********************   REGISTER YOURSELF FOR PARKING  ************************");
        System.out.print("First Name - ");
        first_name= input.nextLine();          // Taking First Name

        System.out.print("Last Name - ");
        last_name= input.nextLine();           // Taking Last Name

        System.out.print("Address - ");
        address= input.nextLine();             // Taking Address

        System.out.print("Mobile Number - ");
        mobileno= input.nextLine();       // Taking Mobile Number
        mobile_number=Long.valueOf(mobileno);

        System.out.print("Vehicle Type (Two-Wheeler/Four-Wheeler) - ");
        vehicle_type= input.nextLine();        // Taking Vehicle Type

        System.out.print("Vehicle Number - ");
        vehicle_number= input.nextLine();      // Taking Vehicle Number

        System.out.print("Create Password - ");
        password= input.nextLine();

        System.out.println("\n\tYour Details");
        System.out.print("Your Name- " +first_name+ " " +last_name+
                "\nYour Address- " +address+
                "\nYour Mobile No: " +mobile_number+
                "\nVehicle Type- " +vehicle_type+
                "\nVehicle No: " +vehicle_number+
                "\nPassword: *********\n");
    }
}
public class Registration_Page extends connection
{
    static Scanner input= new Scanner(System.in);

    public static void main(String[] args)
    {
        Taking_Inputs repeat= new Taking_Inputs();
        repeat.inputs();

        Registration_Page obj = new Registration_Page();

        System.out.println("\nPress 1 To Confirm ");
        System.out.println("Press 2 To Edit Details ");
        System.out.println("Press 9 To Exit ");

        Integer choice=input.nextInt();
        switch (choice)
        {
            case 1:
                obj.sql(Taking_Inputs.first_name,Taking_Inputs.last_name,Taking_Inputs.address,Taking_Inputs.mobile_number,
                        Taking_Inputs.vehicle_type,Taking_Inputs.vehicle_number,Taking_Inputs.password);
                System.out.println("\tCongratulations Your Registration Is Done");
                break;
            case 2:
                repeat.inputs();
                obj.sql(Taking_Inputs.first_name,Taking_Inputs.last_name,Taking_Inputs.address,Taking_Inputs.mobile_number,
                        Taking_Inputs.vehicle_type,Taking_Inputs.vehicle_number,Taking_Inputs.password);
                System.out.println("\tCongratulations Your Registration Is Done");
                break;
            case 9:
                System.out.println("\tThank You For Using Our Service");
                break;
        }
    }
}
