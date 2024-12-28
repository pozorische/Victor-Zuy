public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName1, String jobTitle1, String email1, String phoneNumber1, double salary1, int age1) {
        fullName = fullName1;
        jobTitle = jobTitle1;
        email = email1;
        phoneNumber = phoneNumber1;
        salary = salary1;
        age = age1;

    }

    public void printInfo() {
        System.out.println("Сотрудник \nФИО:" + fullName + "\nДолжность:" + jobTitle + "\nemail:" + email + "\nНомер:" + phoneNumber +
                "\nЗарплата:" + salary + "\nВозраст:" + age);
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "fullName=" + fullName +
                ", jobTitle=" + jobTitle +
                ", email=" + email +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age + "\n";
    }
}
