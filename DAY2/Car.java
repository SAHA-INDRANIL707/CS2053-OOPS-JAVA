package Lab1.Programms;

import java.sql.SQLOutput;

public class Car {
    String brand;
    int year;

    Car (String b, int y){
        brand =b;
        year = y;
    }
    void display(){
        System.out.println("Car: "+brand+" (" + year+")");
    }

    public static void main(String[] args) {
        Car c1= new Car("Porche",2020) ;

        c1.display();
    }

}
