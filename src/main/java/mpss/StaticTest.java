package mpss;

public  class StaticTest {

    private static String studentname;
    private int age;

    public void setStudentname(String name){
        studentname= name;
    }

    public StaticTest(String name,int age){
        studentname = name;
        this.age = age;
    }

    public StaticTest(int age){
        this.age = age;
    }

    public void disp(){
        System.out.println(studentname + "  " + age);
    }




}
