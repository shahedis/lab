
import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int smallNumber;
        int bigNamber;
        int m = 2;
        Boolean n = false;

        if(x < y) {
            bigNamber = y;
            smallNumber = x;
        }
        else {
            bigNamber = x;
            smallNumber = y;
        }
        while(m <= smallNumber) {
            if(bigNamber % m == 0 & smallNumber % m == 0) {
                n = true;
            }
            m++ ;
        }
        if(n == false) {
            System.out.println("YES!!! They Are Co-Prime");
        }else
        {
            System.out.println("NO!!! They Are Not Co-Prime");
        }
    }

}
