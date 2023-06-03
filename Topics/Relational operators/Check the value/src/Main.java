import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String ans = scanner.nextInt()<10 ? "true" : "false";
        System.out.println(ans);
    }
}