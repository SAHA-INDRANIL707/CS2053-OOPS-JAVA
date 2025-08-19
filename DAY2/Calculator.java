package Lab1.Programms;

public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    int subtract(int a , int b){
        return (a-b);
    }

    public static void main(String[] args) {
        Calculator calc1= new Calculator();
        System.out.println("Addition "+calc1.add(10,5));
        System.out.println("Subtraction "+calc1.subtract(5,2));
    }







}
