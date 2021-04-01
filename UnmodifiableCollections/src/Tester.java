import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {

    @Test
    public void whenModifyCopyOfList_thenThrowsException() {
        List<Integer> copyList = List.copyOf(Arrays.asList(1, 2, 3, 4));
        assertThrows(UnsupportedOperationException.class, () -> copyList.add(4));
    }

    @Test
    public void whenModifyToUnmodifiableList_thenThrowsException() {
        List<Integer> evenList = Arrays.asList(1, 2, 3, 4).stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
        assertThrows( UnsupportedOperationException.class, () -> evenList.add(4));
    }
}
