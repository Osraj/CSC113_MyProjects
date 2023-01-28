import java.io.IOException;
public interface IOInterface {
    public void saveToFile(String fileName, String donor) throws IOException;

    public void loadFromFile(String fileName, Check[] arrCheck) throws IOException;
}
