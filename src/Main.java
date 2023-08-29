import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is total?");
        Scanner scanner= new Scanner(System.in);
        int T= scanner.nextInt();
        String action;// why isn't it working????

        if (T <= 17) {
            action = "hit";
        }
        else if (T <= 21) {
            action = "stay";
        }
        else if (T > 21) {
            action = "bust";
        }
        else {
            action = "Invalid input";
        }

        System.out.println(action);
    }
}






