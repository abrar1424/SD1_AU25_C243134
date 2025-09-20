import java.util.Scanner;
public class workhour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter workhour");
        int workhour = sc.nextInt();

        System.out.println("enter workhour on thursday");
        int workhourthursday = sc.nextInt();

        if (workhour>workhourthursday) {
            int totalworkhour = workhour*4 +  workhourthursday;
            System.out.println("total workhour per week= "+totalworkhour);
        }
        else {
            System.out.println("workhour is not greater than workhour on thursday");
        }
        sc.close();
    }
}   