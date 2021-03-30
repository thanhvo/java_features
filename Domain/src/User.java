public class User {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static boolean isRealUser(String name) {
        return name.equals("Thanh");
    }

    public boolean isLegalName(String name) {
        return name.equals("Thanh");
    }

    public User() {
        name = "";
    }

    public User(String name) {
        this.name = name;
    }
}
