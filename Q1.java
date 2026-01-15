import java.util.Scanner;
public class Q1{
    public static void main(String[]args){
       double Obt;
       Scanner read= new Scanner(System.in);
       System.out.print("Enter obtained marks:  ");
        Obt=read.nextDouble();
        int Max;
        System.out.print("Enter maximum marks:  ");
        Max=read.nextInt();
        double Per;
        Per=Obt/Max*100;
        System.out.print("Percentage marks = ");
        System.out.println(Per);  
        


    }
}