package shital.serializationPractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) throws IOException {

        Student student = new Student(10,"AAA","mmmm");

        FileOutputStream fo = new FileOutputStream("C:\\Users\\Unique\\IdeaProjects\\myPractice\\src\\main\\java\\shital\\serializationPractice\\abc.txt");

        ObjectOutputStream oss = new ObjectOutputStream(fo);

        oss.writeObject(student);

        fo.close();
        oss.close();
        System.out.println("object created");




    }
}
