import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Tester {
    @Test
    public void whenTextBlocks_thenStringOperationsWorkSame() {
        String TEXT_BLOCK_JSON = """
        {
            "name" : "thanhvo",
            "website" : "https://www.%s.com/"
        }
        """;
        assertTrue(TEXT_BLOCK_JSON.contains("thanhvo"));
        assertTrue(TEXT_BLOCK_JSON.indexOf("www") > 0);
        assertTrue(TEXT_BLOCK_JSON.length() > 0);
    }}
