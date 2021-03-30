public class User {
    private String name;
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
