import model.Student;

public class Main {
    public static void main(String[] args) {
        Student Jason = new Student("Jason", 20, "male", "20192019");
        System.out.println(Jason.getName());
        System.out.println(Jason.getAge());
        System.out.println(Jason.getGender());
        System.out.println(Jason.getStudentID());
    }

}
