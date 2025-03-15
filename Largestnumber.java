import java.util.Scanner;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner large = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int no1 = large.nextInt();
        System.out.print("Enter the second number:");
        int no2 = large.nextInt();
        System.out.print("Enter the third number:");
        int no3= large.nextInt();
        int largest= no1 ;
        if (no1>=largest){System.out.println (largest = no1);}
        if (no2 >largest) {System.out.println(largest = no2);}
        if(no3>largest){System.out.println(largest =no3);}
        System.out.println ("the largest number is:"+ largest);
    }
}