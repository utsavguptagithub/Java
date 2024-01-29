package BASICS.function;

import java.util.Scanner;

public class funsub {
        public static int calculatesum(int num1,int num2){
       
        int sub = num1 - num2;
        int sum = num1+num2;
        
         return sum;

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum =  calculatesum(a,b);  //arguments or ac
       System.out.println("sub is :-" +sub);
        System.out.println("sum is :-" +sum);
       
    }
        }
    

