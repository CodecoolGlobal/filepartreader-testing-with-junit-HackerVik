import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {
    private FilePartReader filePartReader;
    @Test
    public void testReadAllLines() {
        String expected = "1234567890asdfgjkl\n" +
                "2sd 5hgfd\n" +
                "4sd 6jhgf 5jhgfdztr\n" +
                "3sf 5dfgh 8kjhgfdsjhgfd 3jhgfztr";
        filePartReader.setup(1, 4, "text.txt");
        String received = null;
        try {
            received = filePartReader.readLines();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(expected, received);

    }
}