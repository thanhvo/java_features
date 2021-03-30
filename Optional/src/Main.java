import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional<User> user = Optional.ofNullable(getUser());
        String result = user
                .map(User::getAddress)
                .map(Address::getStreet)
                .orElse("not specified");
        System.out.println(result);

        String value = "Random";
        Optional<String> valueOpt = Optional.ofNullable(value);
        System.out.println(valueOpt.orElseThrow(Exception::new).toUpperCase());
    }

    private static User getUser() {
        User user = new User("Thanh");
        user.setAddress(new Address("Nguyen Luong Bang"));
        return user;
    }
}
