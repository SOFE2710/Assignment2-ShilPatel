import java.util.Vector;

public class Student extends Person{
    private String id;
    private String name;
    private Vector<Course> courses = new Vector<Course>(); // contains all courses the student is registered in


    public Student(String stdId, String stdName) {
        this.name = stdName;
        this.id = stdId;
    }


    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public void registerFor(Course course)
    {
        courses.add(course);

    }

    public String toString()
    {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
        System.out.println(this.id + "  "  + this.name);
        System.out.println("Registered courses: ");
        for(int i = 0;i<courses.size();i++)
        {
            System.out.print(courses.get(i).getCode() + "  "  + courses.get(i).getNumber() + " ");
        }
        System.out.println(" ");
        return " ";
    }

    public boolean equals(Student student)
    {
        if(this.id == student.getId())
        {
            if (name.equals(student.getName()))
            {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean isRegisteredInCourse(Course course)
    {

        for(int s = 0;s<courses.size();s++)
        {
            if(course.getCode().equals(courses.get(s).getCode()))
            {
                if(course.getNumber() == courses.get(s).getNumber())
                {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean isRegisteredInCourse(int number){


        for(int n = 0;n<courses.size();n++)
        {
            if(courses.get(n).getNumber() == number)
            {
                return true;
            }

        }
        return false;
    }
}
