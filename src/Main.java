import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        assignment2_1();
        assignment2_2();
        assignment2_3();
    }

    static void assignment2_1() {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("enter day!");
        }
        int day = input.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day");
                break;
            case 6:
            case 7:
                System.out.println("It is a holiday");
                break;
            default:
                System.out.println("Please add correct verification in the code!");
        }
    }

    public static void assignment2_2() {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Please enter the grade level of the exam in capital letters!");
        }
        char Grade = input.next().charAt(0);
        switch (Grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Incorrect level! This exam have only A,B,C,D,E and F levels!");
        }
    }

    public static void assignment2_3() {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Choose number A!");
            double A = input.nextInt();
            System.out.println("Choose number B!");
            double B = input.nextInt();
            System.out.println("Choose calculation: " + "a='+'," + " b='-'," + " c='/'," + " d='*'," +" e='%'," + " f= print A&B," + " g= biggest," + " h= smallest;");
            char calculation = input.next().charAt(0);

            switch (calculation) {
                case 'a':
                    System.out.println("A+B = " + (A + B));
                    break;
                case 'b':
                    System.out.println("A-B = " + (A - B));
                    break;
                case 'c':
                    System.out.println("A/B = " + (A / B));
                    break;
                case 'd':
                    System.out.println("A*B = " + (A * B));
                    break;
                case 'e':
                    System.out.println("A%B = " + (A % B));
                    break;
                case 'f':
                    System.out.println("A=" + A + " B=" + B);
                    break;
                case 'g':
                    System.out.println("The bigger number = " + Math.max(A, B));
                    break;
                case 'h':
                    System.out.println("The smaller number = " + Math.min(A, B));
            }
        }
    }
}