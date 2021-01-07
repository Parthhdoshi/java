import java.util.Scanner;

public class whielloops {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.close(); 
        int temp = n;
        int sum = 0;
        while(temp > 0){
            int lastdigit = temp % 10;
            temp /= 10;
            sum += lastdigit;
            System.out.println(lastdigit+" "+" "+temp+" "+sum);
        }
        System.out.println("The sum of digit of "+n+" is "+sum);
        
        int countOfNumber = (int)Math.log10(n) + 1;
        System.out.println(countOfNumber);

    }
}
