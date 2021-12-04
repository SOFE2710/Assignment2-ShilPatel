import java.util.Vector;

public class Department {
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.


    public Department(String name, String id) {
        this.name = name;
        this.id  = id;
        courseList = new Vector<Course>();// also initialize the vectors
        registerList = new Vector<Student>();
    }
// getter methods
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public void registerStudentCourseInDepartment(Student name, Course course){
        boolean requirement1 = true;
        for(int j = 0;j<registerList.size();j++){
            if(registerList.get(j).getId()  == name.getId()){
                if(registerList.get(j).getName().equals(name.getName())) {
                    requirement1 = false;
                }
            }
        }
        if(requirement1){
            registerList.add(name);
        }
        boolean requirement2  = true;
        for(int i = 0;i<courseList.size();i++){
            if(course.equals(courseList.get(i))){
                requirement2 = false;
            }
        }
        if(requirement2) {
            courseList.add(course);
        }
    }

    public String toString() {
        String reg = id;// returns a string representation of department name, number
        reg += ": " + courseList.size() + " courses, " + registerList.size() + " students\n";
        return reg;
    }
    public void offerCourse(Course course){
        if(!courseList.contains(course)){
            courseList.add(course);
        }
    }
    public boolean isStudentRegistered(Student stud){
        int l = 0;
        while(l<registerList.size()){
            if(stud.getId() == registerList.get(l).getId()){
                if(stud.getName().equals(registerList.get(l).getId())) {
                    return true;
                }
            }
            l++;
        }
        return false;
    }

    public void printStudentsRegisteredInCourse(int number){
        int l  = 0;
        while(l<registerList.size()){
            if(registerList.get(l).isRegisteredInCourse(number)){
                registerList.get(l).toString();
            }
            l++;
        }
    }

    public String largestCourse(){
        int l = 0, j = 0;
        int[] c = new int[courseList.size()];
        String[] temp  = new String[courseList.size()];
        while(l<courseList.size()){
            c[l] = courseList.get(l).getClassSize();
            temp[l] = courseList.get(l).getTitle();
            l++;
        }
        int maximum = c[0];
        String max = temp[0];// start with the first value
        for (int m=0; m<c.length; m++) {
            if (c[m] > maximum) {
                maximum = c[m];
                max = temp[m];// new maximum
            }
        }
        return max;
    }

    public void printCoursesOffered(){
        for (Course course : courseList) {
            System.out.println(course.toString());
        }
    }

    public void printStudentsByName(){
        for (Student student : registerList) {

            student.toString();
        }
    }
}

