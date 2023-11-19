import java.util.Scanner;

public class quizgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Quiz!");
        System.out.println("--------------------------");

        int score = 0;

        // Question 1
        System.out.println("Question 1: What is the capital of France?");
        System.out.println("a) Berlin");
        System.out.println("b) London");
        System.out.println("c) Paris");
        System.out.println("d) Rome");
        System.out.print("Your answer: ");
        char answer1 = scanner.next().charAt(0);
        if (answer1 == 'c' || answer1 == 'C') {
            System.out.println("Correct! +1 point");
            score++;
        } else {
            System.out.println("Wrong answer. The correct answer is Tokyo.");
        }
        System.out.println();

        // Question 2
        System.out.println("Question 2: Which programming language is known as the 'mother of all languages'?");
        System.out.println("a) Java");
        System.out.println("b) C++");
        System.out.println("c) Assembly");
        System.out.println("d) Fortran");
        System.out.print("Your answer: ");
        char answer2 = scanner.next().charAt(0);
        if (answer2 == 'c' || answer2 == 'C') {
            System.out.println("Correct! +1 point");
            score++;
        } else {
            System.out.println("Wrong answer. The correct answer is Assembly.");
        }
        System.out.println();

        // Question 3
        System.out.println("Question 3: What is the largest mammal?");
        System.out.println("a) Elephant");
        System.out.println("b) Blue Whale");
        System.out.println("c) Giraffe");
        System.out.println("d) Gorilla");
        System.out.print("Your answer: ");
        char answer3 = scanner.next().charAt(0);
        if (answer3 == 'b' || answer3 == 'B') {
            System.out.println("Correct! +1 point");
            score++;
        } else {
            System.out.println("Wrong answer. The correct answer is Blue Whale.");
        }
        System.out.println();

        // Question 4
        System.out.println("Question 4: Which planet is known as the 'Red Planet'?");
        System.out.println("a) Jupiter");
        System.out.println("b) Mars");
        System.out.println("c) Venus");
        System.out.println("d) Saturn");
        System.out.print("Your answer: ");
        char answer4 = scanner.next().charAt(0);
        if (answer4 == 'b' || answer4 == 'B') {
            System.out.println("Correct! +1 point");
            score++;
        } else {
            System.out.println("Wrong answer. The correct answer is Mars.");
        }
        System.out.println();

        // Question 5
        System.out.println("Question 5: What is the largest ocean?");
        System.out.println("a) Atlantic Ocean");
        System.out.println("b) Indian Ocean");
        System.out.println("c) Southern Ocean");
        System.out.println("d) Pacific Ocean");
        System.out.print("Your answer: ");
        char answer5 = scanner.next().charAt(0);
        if (answer5 == 'd' || answer5 == 'D') {
            System.out.println("Correct! +1 point");
            score++;
        } else {
            System.out.println("Wrong answer. The correct answer is Pacific Ocean.");
        }
        System.out.println();

        System.out.println("--------------------------");
        System.out.println("Quiz completed! Your score: " + score + " out of 5 points.");

        scanner.close();
    }
}
