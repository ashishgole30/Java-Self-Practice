// QUIZ GAME IN JAVA

// Display 1 question with 4 options
// Ask user for option choice
// Display 2 question with 4 options
// Ask user for option choice
// Display 3 question with 4 options
// Ask user for option choice
// Display 4 question with 4 options
// Ask user for option choice
// Display 5 question with 4 options
// Ask user for option choice
// Display Final score example: 0 points, 10 points...50 points
// Display Final result example: 0/5 1/5...5/5

// Imported Scanner Class
import java.util.Scanner;

// Class QuizGame
public class QuizGame {

    // Main Method
    public static void main(String[] args) {

        // Scanner Object
        Scanner scanner = new Scanner(System.in);

        // int data type variables for storing answers
        int answerOne;
        int answerTwo;
        int answerThree;
        int answerFour;
        int answerFive;

        // int data type for storing score
        int score = 0;

        // int data type for storing result
        int result = 0;

        // General Welcome Line
        System.out.println("------ JAVA QUIZ GAME -------");
        // Text Decoration
        System.out.println("----------------------------");
        // Question 1
        System.out.println("Que 1. Who is the Current Prime Minister of India?");
        // Options 1
        System.out.println("Options: 1. Narenda Modi 2. Barack Obama 3. Donald Trump 4. Joe Biden");
        // Prompt for User Answer
        System.out.print("Enter Your Answer(1/2/3/4):");
        // AnswerOne variable used for storing user input using scanner.nextInt() method
        answerOne = scanner.nextInt();
        System.out.println("----------------------------");

        // Question 2
        System.out.println("Que 2. Who Drew the Picture of Mona Lisa?");
        // Options 2
        System.out.println("Options: 1. Cristiano Ronaldo 2. Lionel Messi 3. Leonardo Da Vinci 4. Neymar Jr");
        // Prompt for User Answer
        System.out.print("Enter Your Answer(1/2/3/4):");
        // AnswerTwo variable used for storing user input using scanner.nextInt() method
        answerTwo = scanner.nextInt();
        // Text Decoration
        System.out.println("----------------------------");

        // Question 3
        System.out.println("Que 3. Which is the Most Played Sport?");
        // Options 3
        System.out.println("Options: 1. Basketball 2. Cricket 3. Volleyball 4. Football");
        // Prompt for User Answer
        System.out.print("Enter Your Answer(1/2/3/4):");
        // AnswerThree variable used for storing user input using scanner.nextInt()
        // method
        answerThree = scanner.nextInt();
        // Text Decoration
        System.out.println("----------------------------");

        // Question 4
        System.out.println("Que 4. Who Invented Telephone?");
        // Options 4
        System.out.println("Options: 1. Christopher Coloumbus 2. Alexander Grahambell 3. Manual Neueur 4. Putin");
        // Prompt for User Answer
        System.out.print("Enter Your Answer(1/2/3/4):");
        // AnswerFour variable used for storing user input using scanner.nextInt()
        // method
        answerFour = scanner.nextInt();
        // Text Decoration
        System.out.println("----------------------------");

        // Question 5
        System.out.println("Que 5. Who is the First Person to Step on the Moon?");
        // Options 5
        System.out.println("Options: 1. Roger Fedrer 2. Neel Armstrong 3. John Cena 4. Rae Mysterio");
        // Prompt for User Answer
        System.out.print("Enter Your Answer(1/2/3/4):");
        // AnswerFive variable used for storing user input using scanner.nextInt()
        // method
        answerFive = scanner.nextInt();
        // Text Decoration
        System.out.println("----------------------------");

        // Checking if user input is equal to correct answer
        // IF yes incrementing score by 10 and result by 1
        if (answerOne == 1) {
            score = score + 10;
            result = result + 1;
        }
        if (answerTwo == 3) {
            score = score + 10;
            result = result + 1;
        }
        if (answerThree == 4) {
            score = score + 10;
            result = result + 1;
        }
        if (answerFour == 2) {
            score = score + 10;
            result = result + 1;
        }
        if (answerFive == 2) {
            score = score + 10;
            result = result + 1;
        }
        // Text Decoration
        System.out.println("----------------------------");
        // Displaying Final Score
        System.out.println("Final score : " + score + " points");
        // Displaying Final Result
        System.out.println("Final result : " + result + "/5");
        // Text Decoration
        System.out.println("----------------------------");
        // Text Decoration
        System.out.println("----------------------------");

        // Closing scanner
        scanner.close();
    }
}
