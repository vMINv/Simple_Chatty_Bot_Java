import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        if (num>=19||(num>14&&num<17)||(num>-15&&num<=12)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}