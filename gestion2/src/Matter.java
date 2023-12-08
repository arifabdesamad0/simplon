import java.util.ArrayList;
import java.util.Scanner;

public class Matter {
    private String matterLabel;
    private String label;

    private ArrayList<Integer> marks = new ArrayList<>();

    public Matter(String matterLabel) {
        this.matterLabel=matterLabel;
    }


    public String getLabel() {
        return label;
    }


    public ArrayList<Integer> getMark() {
        return marks;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public boolean isValidSubMark(int subMark) {
        return subMark >= 0 && subMark <= 20;
    }

    public void addMark(int mark) {
        if (isValidSubMark(mark)) {
            this.marks.add(mark);
        } else {
            System.out.println("Invalid subMark. Submarks should be between 0 and 20.");
        }
    }








}