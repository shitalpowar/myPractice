package shital.serializationPractice;

import java.io.Serializable;

public class Student implements Serializable {
    int rollNo;
    transient String name;
    String city;

    public Student() {
    }

    public Student(int rollNo, String name, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
