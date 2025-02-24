import java.util.Scanner;

public class PalindromeNumber {
    public static void fun(int num){
        int rev =0;
        int temp = num;
        while(num!=0){
            rev = rev*10+num%10;
            num /=10;
        }
        if(temp==rev){

            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }
        System.out.println("The Reverse Number Is : "+rev);
    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number : ");
int num = sc.nextInt();
fun(num);
    }
}
