package Lab1.Programms;

import java.util.Scanner;
public class Myjava {
    String name;
    int age;
    void displayinfo(){
        System.out.println("Name : "+name+", Age: "+age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : \n");
        String n= sc.nextLine();
        System.out.println("\n Enter your age : ");
        int a = sc.nextInt();
       Myjava s1 = new Myjava();
       s1.name=n;
       s1.age=a;
       s1.displayinfo();
       sc.close();
    }


}
