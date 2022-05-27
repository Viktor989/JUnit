import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.*;

public class TestMain {

    @Test
    public void testReadString() {
        String fileName = "test.json";
        String result = Main.readString(fileName);
        Assertions.assertNotNull(result);
    }

    @Test
    public void testParseCSV() {
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "John", "Smith", "USA", 25));
        list.add(new Employee(2, "Inav", "Petrov", "RU", 23));
        List<Employee> result = Main.parseCSV(columnMapping, fileName);
        Assertions.assertEquals(list, result);
    }

    @Test
    void testWriteString() {
        File file = new File("tmp.tmp");
        Main.writeString("", "tmp.tmp");
        boolean result = file.exists();
        file.delete();
        Assertions.assertTrue(result);
    }

}

