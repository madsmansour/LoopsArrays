import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Indtast et tal mellem 1 og 10");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i <= 10 || i < 0) {
            System.out.println("Flot");
        }
        else if(i == 1000){
            System.out.println("Du er en boss");
        }
        else {
            System.out.println("Forkert prøv igen mellem 1 og 10");
        }
    }
}