package lab10;

import java.util.ArrayList;

public class Lab10 {

    public static void main(String[] args) {
        SalariedEmployee s = new SalariedEmployee("Ahmed", 12000, 2000, 500);
        HourlyEmployee e = new HourlyEmployee("Mohammed", 5, 50);

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(s);
        emp.add(e);
        for (Employee employee : emp) {
            System.out.println(employee);
            System.out.println("============================");
        }
    }

}
