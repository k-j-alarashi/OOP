package lab10;

public abstract class Employee {
    private int id ;
    private String name ;
    private final String position = "IT";
    private static int counter = 1;

    public Employee(String name) {
        id = counter;
        this.name = name;
        counter++;
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

    public String getPosition() {
        return position;
    }
    
    public abstract double getSalary();

    @Override
    public String toString() {
        return "ID          : "+getId()+
             "\nNAME        : "+getName()+
             "\nDEPT        : "+getPosition();
    } 
}
