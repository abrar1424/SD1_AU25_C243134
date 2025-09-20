import java.util.*;
public class assignment {
    public static void main(String[] args) {
        int number=4;
        int timetaken=2;
        int total=number*timetaken;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start time");
        int starttime=sc.nextInt();
        if (starttime+total<11)
        {
            System.out.println("can complete the assignment");
        }
        else 
        {
            System.out.println("cannot complete the assignment");
        }
        sc.close();
    }
}