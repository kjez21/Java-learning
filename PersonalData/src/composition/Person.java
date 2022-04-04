package composition;

/**
 * Describes a person.
 */
public class Person {

    protected String name;
    protected Address address;

    /**
     * Creates a person.
     * @param name    the name
     * @param a the address
     */
    Person (String name, Address a ) {
        this.name = name;
        this.address = a;
    }
    public Person(String name, String street, String zipcode, String city) {
        this.name = name;
        Address a = new Address(street, zipcode, city);
        this.address = a;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Formats information in single line.
     * @return a string suitable for printing on screen.
     */
    @Override
    public String toString() {
        return name + " [" + address + "]";
    }

    /**
     Formats the person's name and address for mailing.
     @return a string suitable for printing on a mailing label
     */
    public String formatForMailing(){
        return name + "\n" + address.formatForMailing();  // TODO!
    }}
