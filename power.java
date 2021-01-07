import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        int res = 1;
        for(int i=1;i<=b;i++){
            res = res*a;
            // This is the power function 
        }
        System.out.println(res);
        cs.close();
        }
}
