import java.util.Scanner;

public abstract class Person {
    String fname;
    String lname;
    int age;
    String phoneNumber;
    String GovID;
    String email;
    Address address;
    float height;
    float weight;
    Scanner scan = new Scanner(System.in);

    public Person() {
        this.fname = null;
        this.lname = null;
        this.age = 0;
        this.phoneNumber = null;
        this.GovID = null;
        this.email = null;
        this.address = null;
        this.height = 0.0f;
        this.weight = 0.0f;
    }

    public Person(String fname, String lname, int age, String phoneNumber, String GovID, String email, String street,
            String city, String country, float height, float weight) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.GovID = GovID;
        this.email = email;
        address = new Address(street, city, country);
    }

    public void setFname() {
        
    }

    public void setLname() {
        
    }

    public void setPhoneNumber() {
        
    }

    public void setGovID() {
        
    }

    public void setEmail() {
    
    }

    public void setAge() {
        
    }

    public void setHeight() {
        
    }

    public void setWeight() {
        
    }

    public Address getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGovID() {
        return GovID;
    }

    public String getEmail() {
        return email;
    }

    public void print_all_details() {
        System.out.println(
                "FirstName: " + this.fname +
                        ", LastName: " + this.lname +
                        ", PhoneNumber: " + this.phoneNumber +
                        ", Government ID : " + this.GovID +
                        ", E-Mail: " + this.email +
                        ", Street: " + this.address.street +
                        ", city: " + this.address.city +
                        ", country: " + this.address.country);
    }
}
