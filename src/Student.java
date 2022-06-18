public class Student {

    Course math;
    Course phys;
    Course chem;
    String name;
    String stuNo;
    int classes;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course math, Course phys, Course chem) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.phys = phys;
        this.chem = chem;
        this.math.contributeRate = 0.8;
        this.phys.contributeRate = 0.7;
        this.chem.contributeRate = 0.75;
        this.isPass = false;
    }

    void calcAverage() {
        this.average = (this.math.note * this.math.contributeRate + this.math.verbalMark * (1 - this.math.contributeRate) +
                this.phys.note * this.phys.contributeRate + this.phys.verbalMark * (1 - this.phys.contributeRate) +
                this.chem.note * this.chem.contributeRate + this.chem.verbalMark * (1 - this.chem.contributeRate)) / 3.0;

    }

    void addBulkExamNote(int math, int phys, int chem) {
        if (math >= 0 && math < 100) {
            this.math.note = math;
        }
        if (phys >= 0 && phys < 100) {
            this.phys.note = phys;
        }
        if (chem >= 0 && chem < 100) {
            this.chem.note = chem;
        }
    }

    void addVerbalExamNote(int verbalMath, int verbalPhys, int verbalChem) {
        if (verbalMath >= 0 && verbalMath < 100) {
            this.math.verbalMark = verbalMath;
        }
        if (verbalPhys >= 0 && verbalPhys < 100) {
            this.phys.verbalMark = verbalPhys;
        }
        if (verbalChem >= 0 && verbalChem < 100) {
            this.chem.verbalMark = verbalChem;
        }
    }

    public void isPass() {
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Average: " + this.average);
        if (this.isPass) {
            System.out.println("Student passed the class :)");
        } else {
            System.out.println("Student failed!");
        }
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("===============");
        System.out.println("Student: " + this.name);
        System.out.println("Math Marks:" + this.math.note);
        System.out.println("Math Verbal Marks:" + this.math.verbalMark);
        System.out.println("Physics Marks:" + this.phys.note);
        System.out.println("Physics Verbal Marks:" + this.phys.verbalMark);
        System.out.println("Chemistry Marks:" + this.chem.note);
        System.out.println("Chemistry Verbal Marks:" + this.chem.verbalMark);
    }
}