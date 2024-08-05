package Hybrid_inheritance;

public class Avg extends Data1{
    public double avg(){
        return (n1+n2)/2;
    }

    public static void main(String[] args) {
        Avg obj=new Avg();
        System.out.println("The avg of two numbers are: "+obj.avg());
    }
    
}
