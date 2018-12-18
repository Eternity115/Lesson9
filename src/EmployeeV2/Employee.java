package EmployeeV2;


public abstract class Employee {
    protected String name;
    protected double rate;
    protected int hours;
    protected static double totalpay=0;
    public static double LOW_RATE = 6.75;
    public static double HIGH_RATE = 30.50;
    public static double LOW_HOURS = 1;
    public static double HIGH_HOURS = 60;
    
    
    
    public Employee(){ //this sets the characteristics (this is why you can go "Dice d = new Dice();", default settings)
        name="";
        rate=0;
        hours=0;
    }
   
    
    public static String getNameRules(){
        return "2 or more characters";
    }
    
    public static String getRateRules(){
        return "between " + LOW_RATE + " and " + HIGH_RATE;
    }
    
    public static String getHourRules(){
        return "between " + LOW_HOURS + " and " + HIGH_HOURS;
    }
    
    //setters: boolean
    //return true if property Can be set, false if not
    //will enforce rules from above
    
    public boolean setName(String nm){
        boolean badname = nm.length() <2;
        if (badname) return false;
        else{
            name = nm;
            return true;
        }
    }
    
    public boolean setRate(double rt){
        boolean rateok = rt >=6.75 && rt <= 30.50;
        if (rateok){
            rate=rt;
            return true;
        }
        else return false;
    }
    
    public boolean setHours(int hrs){
        boolean hoursok = hrs>=1 && hrs<=60;
        if (hoursok){
            hours = hrs;
            return true;
        }
        else return false;
    }
    
    public String getName(){
        return name;
    }
    
    public static double getTotalPay(){
        return totalpay;
    }

    public abstract double getPay(); 
    
    
}
