package Leepyear;
import java.util.Scanner;

public class Leepyear {

    public static void main(String[] args) {
        Year y= new Year();
        System.out.println("Enter the year");
        Scanner s = new Scanner(System.in);
        y.a = s.nextInt();  
        y.year = y.a %4;
        y.leep();
    }
    
}
class Year extends Leepyear{
    int a;
float year;

void leep() {
   

    if(year == 0){
       
        System.out.println("This year is leep year");
    }
    else if(year!=0){
       

        System.out.println("This year is not a leep year");

    }
}


}
