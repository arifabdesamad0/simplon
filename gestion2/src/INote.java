public interface INote {

    void addMatterToStudent(int studentId);

    void createStudent(int studentId);

    void deleteStudent(int studentId);



    double calculateAveragePerSubject(int studentId);

    double calculateAverageAll();

}
