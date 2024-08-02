import java.util.Scanner;

class Fact{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f=1;
        for(int i = 1; i <= n; i ++){
            System.out.println(f);
            f = f * i;
        }
    }

}