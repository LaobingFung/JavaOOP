package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String studentID;

    public Student(String name, int age, String gender, String studentID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }
}
