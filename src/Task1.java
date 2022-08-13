import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Where are you live, " + name + "?");
        String address = sc.nextLine();
        System.out.println(address);
    }
}
