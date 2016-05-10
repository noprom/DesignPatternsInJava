package composite.pattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * CompositePatternEx
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/11/16 6:25 AM.
 */
interface ITeacher {
    public String getDetails();
}

class Teacher implements ITeacher {

    private String teacherName;
    private String deptName;
    private List<ITeacher> controls;

    Teacher(String teacherName, String deptName) {
        this.teacherName = teacherName;
        this.deptName = deptName;
        controls = new ArrayList<ITeacher>();
    }

    public void add(Teacher teacher) {
        controls.add(teacher);
    }

    public void remove(Teacher teacher) {
        controls.remove(teacher);
    }

    public List<ITeacher> getControllingDepts() {
        return controls;
    }

    public String getDetails() {
        return (teacherName + " is the " + deptName);
    }
}

public class CompositePatternEx {

    public static void main(String[] args) {
        Teacher Principal = new Teacher("Dr.S.Som", "Principal");
        Teacher hodMaths = new Teacher("Mrs.S.Das", "Hod-Math");
        Teacher hodCompSc = new Teacher("Mr. V.Sarcar", "Hod-ComputerSc.");
        Teacher mathTeacher1 = new Teacher("Math Teacher-1", "MathsTeacher");
        Teacher mathTeacher2 = new Teacher("Math Teacher-2", "MathsTeacher");
        Teacher cseTeacher1 = new Teacher("CSE Teacher-1", "CSETeacher");
        Teacher cseTeacher2 = new Teacher("CSE Teacher-2", "CSETeacher");
        Teacher cseTeacher3 = new Teacher("CSE Teacher-3", "CSETeacher");
        //Principal is on top of college
        /** HOD -Maths and Comp. Sc. directly reports to him */
        Principal.add(hodMaths);
        Principal.add(hodCompSc);
        /** Teachers of Mathematics directly reports to HOD-Maths*/
        hodMaths.add(mathTeacher1);
        hodMaths.add(mathTeacher2);
        /** Teachers of Computer Sc. directly reports to HOD-Comp.Sc.*/
        hodCompSc.add(cseTeacher1);
        hodCompSc.add(cseTeacher2);
        hodCompSc.add(cseTeacher3);
        /** Leaf nodes. There is no department under Mathematics*/
        mathTeacher1.add(null);
        mathTeacher2.add(null);
        /** Leaf nodes. There is no department under CSE.*/
        cseTeacher1.add(null);
        cseTeacher2.add(null);
        cseTeacher3.add(null);
        //Printing the details
        System.out.println("***COMPOSITE PATTERN DEMO ***");
        System.out.println("\nThe college has following structure\n");
        System.out.println(Principal.getDetails());
        List<ITeacher> hods = Principal.getControllingDepts();
        for (int i = 0; i < hods.size(); i++) {
            System.out.println("\t" + hods.get(i).getDetails());
        }
        List<ITeacher> mathTeachers = hodMaths.getControllingDepts();
        for (int i = 0; i < mathTeachers.size(); i++) {
            System.out.println("\t\t" + mathTeachers.get(i).getDetails());
        }
        List<ITeacher> cseTeachers = hodCompSc.getControllingDepts();
        for (int i = 0; i < cseTeachers.size(); i++) {
            System.out.println("\t\t" + cseTeachers.get(i).getDetails());
        }
        //One computer teacher is leaving
        hodCompSc.remove(cseTeacher2);
        System.out.println("\n After CSE Teacher-2 leaving the organization- CSE department has following employees:");
        cseTeachers = hodCompSc.getControllingDepts();
        for (int i = 0; i < cseTeachers.size(); i++) {
            System.out.println("\t\t" + cseTeachers.get(i).getDetails());
        }
    }
}

