package br.univali.poo.lista02;

public class CommissionEmployee extends Employee{
    private double grossSales, commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double sales, double comm){
        super(first, last, ssn);
        this.grossSales = sales;
        this.commissionRate = comm;
    }
    public void setGrossSales( double sales ) {
        grossSales = ( sales < 0.0 ) ? 0.0 : sales;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void setCommissionRate(double rate) {
        commissionRate = ( rate > 0.0 && rate < 1.0) ? rate : 0.0;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString(){
        return String.format(
                "%s\n%s: %.2f\n%s: %s",
                super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate()
        );
    }
}
