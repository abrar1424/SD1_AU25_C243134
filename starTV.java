import java.util.*;
public class starTV {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int subscription = number/6;
        float cost = sc.nextFloat();
        float total = subscription * cost;
        float minimum = total / number;
        System.out.println(minimum);
        sc.close();
    }
}