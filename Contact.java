import Address_book.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone_number;
    private String email;
    public Contact(String firstName,String lastName,String address,String city,String state,String zip,String phone_number,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phone_number=phone_number;
        this.email=email;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Address Book Program in AddressBookMain");







        System.out.println("Want to add new contact yes/no");
        String res=sc.nextLine();


        while(res.equals("yes")){
            System.out.println("FirstName:");
            String FirstName= sc.nextLine();
            System.out.println("LastName:");
            String LastName= sc.nextLine();
            System.out.println("Address:");
            String Address= sc.nextLine();
            System.out.println("City:");
            String City=sc.nextLine();
            System.out.println("State:");
            String State= sc.nextLine();
            System.out.println("ZIP:");
            String ZIP=sc.nextLine();
            System.out.println("Phone_number:");
            String PhoneNumber= sc.nextLine();
            System.out.println("Email:");
            String Email=sc.nextLine();




            Contact contact=new Contact(FirstName,LastName,Address,City,State,ZIP,PhoneNumber,Email );
            AddressBook.Contact_Information(contact);
            System.out.println("Want to add new contact yes/no");
            res=sc.nextLine();



        }

        if(res.equals("no")) {

          
            AddressBook.display();
        }



    }

}
class AddressBook{

    public static final ArrayList<Contact> contact_Information=new ArrayList<Contact>();



    public static void Contact_Information(Contact contact){
        contact_Information.add(contact);
    }
    public static void display(){
        for(Contact c:contact_Information){
            System.out.println(c);
        }
    }

}
