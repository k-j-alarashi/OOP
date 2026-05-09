package lab10;

public class HourlyEmployee extends Employee {

    private int hours;
    private double rate;

    public HourlyEmployee(String name, int hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getSalary() {
        return getHours() * getRate();
    }
    @Override
    public String toString() {
        return super.toString()+
             "\nHOUR NO.    : "+getHours()+
             "\nHOUR RATE   : "+getRate()+" $ "+
             "\nTOTAL       : "+getSalary()+" $ ";
    }
}
