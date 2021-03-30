import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Thanh", "Khanh", "Duong", "Hoa", "");
        boolean isReal = list.stream().anyMatch(u -> User.isRealUser(u));
        if (isReal) System.out.println("There is a real user!");
        User user = new User();
        boolean isLegalName = list.stream().anyMatch(user::isLegalName);
        if (isLegalName) System.out.println("There is a legal name!");
        long count = list.stream().filter(String::isEmpty).count();
        System.out.println("The number of empty strings is " + count);
        Stream<User> stream = (Stream<User>) list.stream().map(User::new);
    }
}
