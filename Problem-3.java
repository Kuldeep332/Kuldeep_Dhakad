import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 2 == 0) a--;

        for(int i = 1; i <= a * 2; i += 2)
            System.out.print(i + " ");
    }
}
