import java.util.Scanner;
public class User extends Person {
    String username;
    String password;
    

    Scanner scan = new Scanner(System.in);

    public User() {
        super();
        username = null;
        password = null;
    }

    public User(String username, String password, String fname, String lname, int age, String phoneNumber, String GovID,
            String email, String street,
            String city, String country, float height, float weight) {
        super(fname, lname, age, phoneNumber, GovID, email, street, city, country, height, weight);
        this.username = username;
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public void creatUser() {

        this.address = new Address();

        System.out.print("UserName: ");
        this.username = scan.next();
        System.out.print("Password ");
        this.password = scan.next();
        System.out.print("FristName: ");
        this.fname = scan.next();
        System.out.print("LastName: ");
        this.lname = scan.next();
        System.out.print("PhoneNumber: ");
        this.phoneNumber = scan.next();
        System.out.print("GovenmentID: ");
        this.GovID = scan.next();
        System.out.print("Email: ");
        this.email = scan.next();
        System.out.print("Age: ");
        this.age = scan.nextInt();
        System.out.print("height: ");
        this.height = scan.nextFloat();
        System.out.print("weight: ");
        this.weight = scan.nextFloat();
        System.out.print("Street: ");
        this.address.street = scan.next();
        System.out.print("Country: ");
        this.address.country = scan.next();
        System.out.print("City: ");
        this.address.city = scan.next();
    }

    @Override
    public void print_all_details() {
        System.out.println("Username: "+this.username);
        super.print_all_details();
    }
}