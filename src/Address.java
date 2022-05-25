import java.util.Scanner;

public class Address {
    String street;
    String city;
    String country;

    Scanner scan = new Scanner(System.in);

    public Address() {
    }

    public Address(
            String street,
            String city,
            String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getstreet() {

        return street;
    }

    public String getcity() {
        return city;

    }

    public String getcountry() {
        return country;
    }
}