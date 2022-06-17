public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalMark;
    double contributeRate;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Assignment successful");
        } else {
            System.out.println("Academician " + t.name + " cannot be given this course!");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("Academician of " + this.name + " Course is " + this.courseTeacher.name);
        } else {
            System.out.println("No academician was assigned to the " + this.name + " course");
        }
    }

}