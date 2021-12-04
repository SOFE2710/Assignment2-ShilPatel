import java.util.Vector;

public class Course {
    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code (e.g. SOFE, ELEE, MANE, etc.)
    private int number; // course number (e.g. 1200, 2710, 2800, etc.)
    private Vector<Student> classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title) {
        this.code = code;
        this.dept = dept;
        this.number  = number;
        this.title = title;
        classList = new Vector<Student>(); // also initialize the classList;
    }


    public Course() {
        // TODO Auto-generated constructor stub
    }

    public void addStudentToCourse(Student stud){
        classList.add(stud);
    }
    //getter methods
    public String getTitle(){
        return title;
    }
    public String getCode(){
        return code;
    }
    public int getClassSize(){
        return classList.size();
    }
    public int getNumber(){
        return number;
    }

    public boolean equals(Course course){
        if(code.equals(course.getCode())){
            if(number == course.getNumber()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        // return a string representation of the course with the course code, name, and number of people registered in the course in the following format:
        System.out.println(code + " " + number + ", " + title + ", Enrollment  = " + classList.size()); // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260
        return " ";
    }
}
