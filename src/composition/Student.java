package composition;

public class Student {

    private String name;
    private int age;
    private Address address;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.address = new Address(streetAddress, zipCode, state, phone);
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return address.getState();
    }

    public String getStreetAddress() {
        return address.getStreetAddress();
    }

    public int getZipCode() {
        return address.getZipCode();
    }

    public String getPhone() {
        return address.getPhone();
    }
}


//In this updated Student class:
//The Student class no longer inherits from the Address class.
//Instead, it has a private Address object as a member variable.
//The constructor takes the address-related parameters and creates a new Address object.
//The getter methods for the address-related properties (state, street address, zip code, and phone) now delegate to the corresponding methods of the Address object.