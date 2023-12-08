import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private static int id;
    private String fname;
    private String lname;
    private static ArrayList<Matter> matters = new ArrayList<>();
    static Scanner matterLabel=new Scanner(System.in);
    public Student(){
        this.lname=null;
        this.fname=null;
    }
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public static Student search(int studentId) {
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public static void setMatters(ArrayList<Matter> matters) {
        Student.matters = matters;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public static ArrayList<Matter> getMatters() {
        return matters;
    }

    public static void addMatter() {
        System.out.print("Enter matter name: ");
        String MatterLabel= matterLabel.next();


        if (!matterExists(MatterLabel)) {
            Matter newMatter = new Matter(MatterLabel);
            System.out.println("Matter added: " + newMatter.getLabel() + " - ADDED SUCCESSFULLY");
        } else {
            System.out.println("Matter already exists.");
        }
    }

    public static boolean matterExists(String matterLabel) {
        for (Matter matter : matters) {
            if (matter.getLabel().equalsIgnoreCase(matterLabel)) {
                return true;
            }
        }
        return false;
    }
    public Student Search (int id){
        for (Student student:Student.students) {
            if (student.getId()==id){
                return student;
            }
        }return null;


    }
}



