import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Problem1 {

    public static void partOne() {
        Scanner scanner = new Scanner(System.in);
        do {

            SecureRandom secureRandom = new SecureRandom();
            int n1 = secureRandom.nextInt(9) + 1;
            int n2 = secureRandom.nextInt(9) + 1;
            int answer = n1 * n2;
            int studentAnswer;
            do {
                System.out.println("What is " + n1 + " times " + n2);
                studentAnswer = scanner.nextInt();
                if (studentAnswer != answer) {
                    System.out.println("No, Please Try again");
                }
            } while (studentAnswer != answer);
            System.out.println("Very Good!");
            System.out.println("Another question? (Yes/No)?");
        } while (scanner.next().equalsIgnoreCase("Yes"));
    }

    public static void partTwo() {
        Scanner scanner = new Scanner(System.in);
        do {
            SecureRandom secureRandom = new SecureRandom();
            Random random = new Random();
            int n1 = secureRandom.nextInt(9) + 1;
            int n2 = secureRandom.nextInt(9) + 1;
            int answer = n1 * n2;
            int studentAnswer;
            do {
                System.out.println("What is " + n1 + " times " + n2);
                studentAnswer = scanner.nextInt();
                if (studentAnswer != answer) {
                    int IncorrectOptions = random.nextInt(4);
                    switch (IncorrectOptions) {
                        case 1:
                            System.out.println("No, Please Try again");
                            break;
                        case 2:
                            System.out.println("Wrong, Try once more!");
                            break;
                        case 3:
                            System.out.println("Don't Give Up!");
                            break;
                        case 4:
                            System.out.println("No, keep trying");
                            break;
                    }
                }
            } while (studentAnswer != answer);
            int correctOptions = random.nextInt(4);
            switch (correctOptions) {
                case 1:
                    System.out.println("Very Good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice Work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
            System.out.println("Another question? (Yes/No)?");
        } while (scanner.next().equalsIgnoreCase("Yes"));
    }

    public static void partThree() {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        Random random = new Random();
        int count = 0, correct = 0, wrong = 0;
        for (count = 0; count < 10; count++) {
            int n1 = secureRandom.nextInt(9) + 1;
            int n2 = secureRandom.nextInt(9) + 1;
            int answer = n1 * n2;
            int studentAnswer;
            System.out.println("What is " + n1 + " times " + n2);
            studentAnswer = scanner.nextInt();
            if (studentAnswer == answer) {
                correct++;
            } else {
                wrong++;
            }
        }
        if (correct >= 8) {
            System.out.println("Congrats you can move on to the next level");
        } else {
            System.out.println("Please ask your teacher for more help");
        }
    }


    public static void partFour() {
        Scanner scan = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int count = 0, correct = 0, wrong = 0;
        System.out.println("Select from the following level of difficulties: 1, 2, 3, 4");
        int choice = scan.nextInt();
        if (choice == 1) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(9) + 1;
                int n2 = secureRandom.nextInt(9) + 1;
                int answer = n1 * n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " times " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (choice == 2) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(99) + 1;
                int n2 = secureRandom.nextInt(99) + 1;
                int answer = n1 * n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " times " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (choice == 3) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(999) + 1;
                int n2 = secureRandom.nextInt(999) + 1;
                int answer = n1 * n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " times " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (choice == 4) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(9999) + 1;
                int n2 = secureRandom.nextInt(9999) + 1;
                int answer = n1 * n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " times " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (correct >= 8) {
            System.out.println("Congrats you can move on to the next level");
        } else {
            System.out.println("Please ask your teacher for more help");
        }
    }


    public static void partFive() {
        Scanner scan = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int count = 0, correct = 0, wrong = 0;
        System.out.println("Choose: 1-Addition, 2-Multiplication, 3-Subtraction, 4-Division");
        int arithmeticChoice = scan.nextInt();

        if (arithmeticChoice == 1) {
            System.out.println("Select from the following level of difficulties: 1, 2, 3, 4");
            int Addchoice = scan.nextInt();
            if (Addchoice == 1) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(9) + 1;
                    int n2 = secureRandom.nextInt(9) + 1;
                    int answer = n1 + n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " plus " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (Addchoice == 2) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(99) + 1;
                    int n2 = secureRandom.nextInt(99) + 1;
                    int answer = n1 + n2;
                    System.out.println("What is " + n1 + " plus " + n2);
                    int studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (Addchoice == 3) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(999) + 1;
                    int n2 = secureRandom.nextInt(999) + 1;
                    int answer = n1 + n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " plus " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (Addchoice == 4) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(9999) + 1;
                    int n2 = secureRandom.nextInt(9999) + 1;
                    int answer = n1 + n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " plus " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
        }

        if (arithmeticChoice == 2) {
            System.out.println("Select from the following level of difficulties: 1, 2, 3, 4");
            int MulChoice = scan.nextInt();
            if (MulChoice == 1) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(9) + 1;
                    int n2 = secureRandom.nextInt(9) + 1;
                    int answer = n1 * n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " times " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (MulChoice == 2) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(99) + 1;
                    int n2 = secureRandom.nextInt(99) + 1;
                    int answer = n1 * n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " times " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (MulChoice == 3) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(999) + 1;
                    int n2 = secureRandom.nextInt(999) + 1;
                    int answer = n1 * n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " times " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (MulChoice == 4) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(9999) + 1;
                    int n2 = secureRandom.nextInt(9999) + 1;
                    int answer = n1 * n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " times " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
        }

        if (arithmeticChoice == 3) {
            System.out.println("Select from the following level of difficulties: 1, 2, 3, 4");
            int Subchoice = scan.nextInt();
            if (Subchoice == 1) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(9) + 1;
                    int n2 = secureRandom.nextInt(9) + 1;
                    int answer = n1 - n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " minus " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (Subchoice == 2) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(99) + 1;
                    int n2 = secureRandom.nextInt(99) + 1;
                    int answer = n1 - n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " minus " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (Subchoice == 3) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(999) + 1;
                    int n2 = secureRandom.nextInt(999) + 1;
                    int answer = n1 - n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " minus " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (Subchoice == 4) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(9999) + 1;
                    int n2 = secureRandom.nextInt(9999) + 1;
                    int answer = n1 - n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " minus " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
        }

        if (arithmeticChoice == 4) {
            System.out.println("Select from the following level of difficulties: 1, 2, 3, 4");
            int DivChoice = scan.nextInt();
            if (DivChoice == 1) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(9) + 1;
                    int n2 = secureRandom.nextInt(9) + 1;
                    int answer = n1 / n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " divided by " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (DivChoice == 2) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(99) + 1;
                    int n2 = secureRandom.nextInt(99) + 1;
                    int answer = n1 / n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " divided " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (DivChoice == 3) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(999) + 1;
                    int n2 = secureRandom.nextInt(999) + 1;
                    int answer = n1 / n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " divided by " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
            if (DivChoice == 4) {
                for (count = 0; count < 10; count++) {
                    int n1 = secureRandom.nextInt(9999) + 1;
                    int n2 = secureRandom.nextInt(9999) + 1;
                    int answer = n1 / n2;
                    int studentAnswer;
                    System.out.println("What is " + n1 + " divided by " + n2);
                    studentAnswer = scan.nextInt();
                    if (studentAnswer == answer) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
        }
        if(correct>=8){
            System.out.println("Congrats you can move on to the next level");
        }else{ System.out.println("Please ask your teacher for more help"); }
    }

    public static void main(String[] args) {
        partOne();
        partTwo();
        partThree();
        partFour();
        partFive();
    }

}
