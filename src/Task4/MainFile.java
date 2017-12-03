package Task4;

import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Ксюша on 02.12.2017.
 */
public class MainFile {



    public static void main(String[] args) throws FileNotFoundException {


        String fileName = "src/Task4/Password";
        String textFromFile = Util.read(fileName);

        System.out.println(textFromFile);





    }
}

