
public class UniversityOuter {
    String universityName;
    String location;

    UniversityOuter(String un, String loc){
        universityName = un;
        location = loc;
    }

    class Department {
        String deptName;
        String hodName;

        Department(String dept, String hod) {
            deptName = dept;
            hodName = hod;
        }

        void display() {
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department Name: " + deptName);
            System.out.println("HOD Name: " + hodName);
        }
    }

    void createDepartment(String dept, String hod){
        Department d = new Department(dept, hod);
        d.display();
    }

    public static void main(String[] args) {
        UniversityOuter un = new UniversityOuter("KIIT", "Bhubaneswar");
        un.createDepartment("CSE", "Mrs. Suchismita Rout");
    }
}
