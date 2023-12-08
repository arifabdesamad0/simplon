import javax.naming.OperationNotSupportedException;

public class Services implements INote{


 Student se;

    {
        se = Student();
    }

    @Override
    public void addMatterToStudent(int studentId) {

    }

    @Override
    public void addMarkToMatter(int studentId) {
        Student s=Student.search(studentId);
        for (int i = 0; i < ; i++) {

        }
    }

    @Override
    public void createStudent(int studentId) {

    }

    @Override
    public void deleteStudent(int studentId) {

    }

    @Override
    public double calculateAveragePerSubject(int studentId) {
        return 0;
    }

    @Override
    public double calculateAverageAll() {
        return 0;
    }
}
