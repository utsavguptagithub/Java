package BASICS.function;

public class multiply {
    public static int multiply(int a , int b){
int product = a*b;
    
    return product;

    
}
public static void main(String[] args) {
    int  a = 40;
    int b = 50;
    int prod = multiply(a,b);
    System.out.println("a*b=" +prod);
    }
}
