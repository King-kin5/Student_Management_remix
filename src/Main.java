import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        admin min = new admin();
        int option=0;
        boolean f=true;
        do {
            try {
                System.out.println("\n1.Add Student\n2.View Student\n3.Remove student" +
                        "\nWhat action will u like to perform:");
                option=input.nextInt();
            }catch (InputMismatchException ex){
                System.out.println("Invalid Input");
            }
            try {
                switch (option){
                    case 1:
                        min.addStudent();
                        break;
                    case 2:
                        min.viewStudent();
                        break;
                    case 3:
                        min.removeStudent();
                        break;
                    default:System.out.println("\nInvalid number entered");
                }
            }catch (InputMismatchException e){
                System.out.println(e);
            }
            System.out.println("Want to continue\nTrue/false");
            f=input.nextBoolean();
        }while (f);
    }
}