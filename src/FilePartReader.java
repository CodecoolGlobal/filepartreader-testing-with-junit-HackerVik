import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePartReader {
    private String filePath;
    private int fromLine;
    private int toLine;

    public FilePartReader() {
        filePath = "";
        fromLine = 0;
        toLine = 1;
    }

    public void setup(int fromLine, int toLine, String filePath) {
        if (fromLine < 1 || toLine < fromLine) {
            throw new IllegalArgumentException();
        }
        this.fromLine = fromLine;
        this.toLine = toLine;
        this.filePath = filePath;
    }

    private String read() throws FileNotFoundException {
        File file = new File("text.txt");
        StringBuilder text = new StringBuilder();
        Scanner scanner = new Scanner(file);
        do {
            text.append(scanner.nextLine());
            text.append("\n");
        } while (scanner.hasNextLine());

        return String.valueOf(text);
    }

    public String readLines() throws FileNotFoundException {
        String text = read();
        StringBuilder sb = new StringBuilder();
        String[] lines = text.split("\n");
        for (int i = 0; i < lines.length; i++) {
            if (i > fromLine - 1 && i <= toLine - 1) {
                sb.append(lines[i]);
                sb.append("\n");
            }
        }
        return String.valueOf(sb);
    }
}
