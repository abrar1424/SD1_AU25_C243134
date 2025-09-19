public class test {
    public static void main(String[] args) {
        String[] cars = { "Toyota", "BMW", "Mercedes", "Texla" };
        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        String[] cars2 = new String[4]; // size is 4
        cars2[0] = "Toyota";
        cars2[1] = "BMW";
        cars2[2] = "Mercedes";
        cars2[3] = "Texla";
        System.out.println(cars2[1]);
    }
}
