package generateUniqueCharacter.com;

import java.io.FileWriter;
import java.io.IOException;

public class ManageFile {
    static GenerateString g = new GenerateString();
    static UserInput i = new UserInput();

    public void writeFile(int count) {
        count = i.getNumber();
        System.out.println("count=" + count);
        try
            {
                FileWriter f1 = new FileWriter("C:\\Users\\bhargavi\\Desktop\\filereader\\twoFiles.txt");
                for (int k = 0; k < count; k++) {
                    f1.write(g.generateString() + "\n");
                }
                f1.close();

            System.out.println("output verified");
        }
        catch (IOException e) {
            System.out.println("error occured");
            e.printStackTrace();
        }

    }
}
