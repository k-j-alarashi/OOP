package lab05;

public class Student {
    int id ;
    String name;
    int age ;
    String major;

    // overloading
    
    public Student() {
        id = 0 ;
        name = null;
        age = 0;
        major = null;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        age = 0;
        major = null;
    }

    public Student(int id, String name, int age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public void display(){
        System.out.println("ID        :   "+getId());
        System.out.println("NAME      :   "+getName());
        System.out.println("AGE       :   "+getAge());
        System.out.println("MAJOR     :   "+getMajor());
        System.out.println("============================");
    }
    
}
