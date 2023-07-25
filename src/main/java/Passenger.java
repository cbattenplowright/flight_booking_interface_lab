public class Passenger {

    private String name;
    private String phoneNumber;
    private String email;
    private int uniqueID;

    public Passenger(String name, String phoneNumber, String email, int uniqueID) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUniqueID() {
        return this.uniqueID;
    }

}
