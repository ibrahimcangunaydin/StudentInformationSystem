# Student Information System

* It was created using the **Constructor** methods.

### Properties of the Course Class
* **Attributes**: name,code,prefix,note,courseTeacher, verbalMark,
contributeRate.
* **Methods**: Course() , addTeacher() , printTeacher()
* **Notes:** While assigning the teacher to the course, it will 
be ensured that the branch of the course and the branch of the 
teacher are the same.

### Properties of the Teacher Class
* **Attributes**:  name,mpno(Phone),branch
* **Methods**: Teacher()

### Properties of the Student Class
* **Attributes**: name,stuNo (Student No),classes,math,phys,chem,avarage,
isPass
* **Methods**: Student(), addBulkExamNote(),addVerbalExamNote, 
isPass(), calcAvarage(), printNote()
* **Notes**: When calculating the average, we take certain ratios of 
the exam and verbal marks entered.
