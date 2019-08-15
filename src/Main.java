import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        FilePartReader filePartReader = new FilePartReader();
        filePartReader.setup(1,4,"text.txt");

    }
}