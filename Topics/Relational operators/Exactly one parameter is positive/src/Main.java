import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1>0&&num2<=0&&num3<=0){
            System.out.println("true");
        } else if (num2>0&&num3<=0&&num1<=0) {
            System.out.println("true");
        } else if (num3>0&&num2<=0&&num1<=0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}