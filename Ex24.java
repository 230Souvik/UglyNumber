
package ex24;
import java.io.*;  
import java.util.*;  

public class Ex24 {
    static int divideBy(int number, int gdp)  
    {  
        while (number % gdp == 0)  
            number = number / gdp;  
        return number;  
    }  
   

     static boolean checkUgly(int number)  
    {  
        number = divideBy(number, 2);  
        number = divideBy(number, 3);  
        number = divideBy(number, 5);  
   
        return (number == 1) ? true : false;  
    }  
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter number to check");  
        int number1 = sc.nextInt();  
        if (checkUgly(number1))   
                        System.out.println(number1 + " is an Ugly number.");   
                else  
                        System.out.println(number1 + " is not an Ugly number.");  
    }
    
}
