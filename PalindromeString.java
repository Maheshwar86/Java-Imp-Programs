import java.util.Scanner;

public class PalindromeString {
    public static void fun(String s){
        String temp = s;
        String rev = "";
        char[] arr = temp.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            rev+=arr[i];
        }
        if(temp.equals(rev)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not Palindrome String");
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        fun(s);
    }
}
