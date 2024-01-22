package shital.serializationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Unique\\IdeaProjects\\myPractice\\src\\main\\java\\shital\\serializationPractice\\abc.txt");

        ObjectInputStream stream = new ObjectInputStream(fis);

        Student student= (Student) stream.readObject();

        System.out.println(student);
        System.out.println(">>>>>>>>>>>>>>>> via command prompt");



    }
}
