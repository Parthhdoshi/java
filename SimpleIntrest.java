import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();

        float simple_intrest = (principal*rate*time)/100;
        System.out.println(simple_intrest);
        sc.close();

    }
}
