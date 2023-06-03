import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int g3 = scanner.nextInt();
        int desk1 = g1%2==0 ? (int)(g1/2) : (int)(g1/2+1);
        int desk2 = g2%2==0 ? (int)(g2/2) : (int)(g2/2+1);
        int desk3 = g3%2==0 ? (int)(g3/2) : (int)(g3/2+1);
        System.out.println(desk1+desk2+desk3);
    }
}