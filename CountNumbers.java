import java.util.Scanner;

public class CountNumbers {
    public static void fun(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("The Number Of Count IS : "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        fun(num);
    }
}
