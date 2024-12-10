import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.println("This programme is made to check if Fermat's theorem holds.");

        System.out.print("Please input 'a' as a double: ");
        double a = inp.nextDouble();
        System.out.print("Please input 'b' as a double: ");
        double b = inp.nextDouble();
        System.out.print("Please input 'c' as a double: ");
        double c = inp.nextDouble();
        System.out.print("Please input 'n' as a double: ");
        double n = inp.nextDouble();
        
        if (n <= 2 && (Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n)){
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn’t work.");
        }

        inp.close();
    }
}
