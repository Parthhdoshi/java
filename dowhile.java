import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;

        do{
            n = sc.nextInt();
            System.out.println("N is " + n);
        }while(n!=0);
        sc.close();
    }
}
