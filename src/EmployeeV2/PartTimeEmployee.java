
package EmployeeV2;


public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(){
        super();
    }
    
    @Override
    public double getPay() {
        double pay = (rate * hours);
        totalpay += pay;
        return pay;
    }
}
