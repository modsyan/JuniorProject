public abstract class Person {
    String fname;
    String lname;
    String phoneNumber;
    String GovID;
    String email;
    Adrress adrress = new Address();

    public Person() {
        this.fname = null;
        this.lname = null;
        this.phoneNumber = null;
        this.GovID = null;
        this.email = null;
    }

    public Person(String fname, String lname, String phoneNumber, String GovID, String email) {
        this.fname = fname;
        this.lname = lname;
        this.phoneNumber = phoneNumber;
        this.GovID = GovID;
        this.email = email;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGovID(String govID) {
        GovID = govID;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
