public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Alongkorn", "KMITL")
                .age(21).build();
        System.out.println(student);
    }
}
