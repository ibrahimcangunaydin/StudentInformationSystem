public class Main {
    public static void main(String[] args) {

        Course math = new Course("Mathematics", "Math101", "Math");
        Course phys = new Course("Physics", "phys101", "Phys");
        Course chem = new Course("Chemistry", "chem101", "Chem");

        Teacher t1 = new Teacher("Olivia Lovato", "7778", "Math");
        Teacher t2 = new Teacher("Micheal Johnson", "7958", "Phys");
        Teacher t3 = new Teacher("Abel Williams", "4995", "Chem");

        math.addTeacher(t1);
        phys.addTeacher(t2);

        math.printTeacher();
        chem.printTeacher();

        Student s1 = new Student("Jonathan Brown", 4, "112457896", math, phys, chem);
        s1.addBulkExamNote(50, 65, 80);
        s1.addVerbalExamNote(70,80,55);
        s1.isPass();

        Student s2 = new Student("Gregor Miller", 4, "112457996", math, phys, chem);
        s2.addBulkExamNote(40, 30, 60);
        s2.addVerbalExamNote(50,65,75);
        s2.isPass();

        Student s3 = new Student("Abel Moore", 4, "112458998", math, phys, chem);
        s3.addBulkExamNote(55,70,95);
        s3.addVerbalExamNote(70,80,65);
        s3.isPass();
    }
}