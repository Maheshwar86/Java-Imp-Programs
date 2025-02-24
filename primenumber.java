import java.util.Scanner;

public class primenumber {
    public static void fun(int num){
        int count =0;
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }

        }else{
            System.out.println("Its not a prime number !");
        }
        System.out.println(count);
        if(count==2){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int num = sc.nextInt();
fun(num);
    }
}
