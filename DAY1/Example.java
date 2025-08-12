// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//write a program in java whether a given number is odd or even
//write a program in java to sum all the digit in a number
//write a program in java to reverse a number
//write a program in java to check whether a given number is palindrome or not
//find out whether a number is prime or not

import java.util.Scanner;  // Import the Scanner class

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();  // Read a full line of text

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();  // Read an integer

        // System.out.println("Hello " + name + ", you are " + age + " years old.");
        
        System.out.print("Enter a number to find its sum of digits");
        int num=scanner.nextInt();
        
        Example example = new Example();
        Sumofdigits sumObj = example.new Sumofdigits();
        
        int sum = sumObj.Sumdigits(num);
        System.out.print("sum of digits :" + sum);
        
        check_even_or_odd check = example.new check_even_or_odd();
        boolean result = check.check_even(num);
        if (result){
            System.out.print("the number is even"  );
        }else {
            System.out.print("the number odd" );
        }
        
        hero_class reverse_obj =example.new hero_class();
        String result2 = reverse_obj.reverse_num( num);
        System.out.print(result2 );
       
        
        
        
        scanner.close();  // Close the scanner to free resources
    }
    
    public class Sumofdigits{
        public int Sumdigits(int n){
            int sum =0;
            while (n>0){
               int x=n%10;
                sum=sum+x;
                n=n/10;
            }
            return sum;
        }
        
    }
    
    public class check_even_or_odd{
        public check_even_or_odd (){
            
        }
        public boolean check_even (int num ){
            if (num%2==0){
                return true;
            }else{
                return false;
            }
            
        }
    }
    
    public class hero_class{
        public hero_class(){}
        public String reverse_num(int num ){
            String result ="";
            while(num > 0){
                int x = num%10;
                result = result + x;
                num=num/10;
                
            }
            return result;
        }
        
    }
    
    
}
