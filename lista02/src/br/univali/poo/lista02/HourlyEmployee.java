package br.univali.poo.lista02;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;
    public HourlyEmployee(String first, String last, String ssn, double hours, double wage){
        super(first, last, ssn);
        setHours(hours);
        setWage(wage);
    }

    public void setHours(double hours) {
        this.hours = (hours > 0 && hours < 168) ? hours : 0.0;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        this.wage = (wage > 0.0) ? wage : 0.0;
    }

    public double getWage() {
        return wage;
    }

    public double earnings(){
        return wage * hours;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n%s: %.2f\n%s: %.2f",
                super.toString(),
                "wage", getWage(),
                "hours", getHours()
        );
    }
}
