package Hybrid_inheritance;

public class Add_sub_calculator extends Data1{
    public int sum(){
        return n1+n2;
    }
    public int sub(){
        return n2-n1;
    }

    public static void main(String[] args) {
        Add_sub_calculator obj=new Add_sub_calculator();
        System.out.println("The sum of two numbers are: "+obj.sum());
        System.out.println("The subtraction of two numbers are: "+obj.sub());
    }
    
}
