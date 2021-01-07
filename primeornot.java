import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int Prime = cs.nextInt();
        cs.close();

        boolean flag = true;

        for(int i=2;i*i<Prime;i++){
            if(Prime % i == 0){
                flag = false;
                break;
            } 
        }
        if(Prime<2) flag=false;
        String s = (flag == false) ? "its is not prime number" : "its is prime number";
        System.out.println(s);  
    } 

}
