package lab10;

public class SalariedEmployee extends Employee {

    private double baseSalary;
    private double bonus;
    private double deduction;

    public SalariedEmployee(String name, double baseSalary, double bonus, double deduction) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    @Override
    public double getSalary() {
        return getBaseSalary() + getBonus() - getDeduction();
    }

    @Override
    public String toString() {
        return super.toString()+
             "\nBASE SALARY : "+getBaseSalary()+" $ "+
             "\nBONUS       : "+getBonus()+" $ "+
             "\nDEDUCTION   : "+getDeduction()+" $ "+
             "\nTOTAL       : "+getSalary()+" $ ";
    }
}
