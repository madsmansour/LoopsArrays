import java.util.Scanner;

public class WhileLoop {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your score" + " -1 will end the program");

// beder brugeren om at indtaste en score
            int score = input.nextInt();

            // får programmet til at kører i loop indtil at der bliver indtastet -1

            while (score != -1) {
                if (score <= 80 && score > -1) {
                    System.out.println("You failed the exam");
                } else if (score >= 80 && score > -1) {
                    System.out.println("You passed the exam");
                } else if (score == -1) {
                    System.out.println("You chose to exit... ");
                }
                score = input.nextInt();
            }
        }
    }

