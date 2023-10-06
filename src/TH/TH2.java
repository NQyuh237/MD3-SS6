package TH;

public class TH2 {
    // Các thuộc tính của học sinh
    private String studentId;
    private String studentName;
    private String sex;
    private String className;
    private int age;
    private String address;
        public TH2() {
    }

    public TH2(String studentId, String studentName, String sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Sex: " + sex);
        System.out.println("Class Name: " + className);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        TH2 student1 = new TH2("S001", "huy", "Male", "Jv230630", 18, "123 Ha Noi");

        System.out.println("Student Information:");
        student1.display();
    }
}
