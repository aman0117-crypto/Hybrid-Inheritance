package Hybrid_inheritance;

public class Multi_div_calculator extends  Add_sub_calculator{
    public int mul(){
        return n1*n2;
    }
    public int div(){
        return n2/n1;
    }

    public static void main(String[] args) {
        Multi_div_calculator obj =new Multi_div_calculator();
        Add_sub_calculator obj1=new Add_sub_calculator();
        System.out.println("The sum of two numbers are: "+obj1.sum());
        System.out.println("The subtraction of two numbers are: "+obj1.sub());
        System.out.println("The multiplication of two numbers are: "+obj.mul());
        System.out.println("The division of two numbers are: "+obj.div());

    }
    
}
