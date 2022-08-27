import java.util.Scanner;
import java.util.InputMismatchException;
public class Test {
    static Scanner input=new Scanner(System.in);
    public void errorMsg(){
        System.out.println("Invalid Input");
    }
    public int testMethods(){
        int value=0;
        do {
            try {
                System.out.println("SELECT:");
                value=input.nextInt();
            }catch (InputMismatchException ex){
                errorMsg();
            }
            input.nextLine();
        }while (value==0);
        return value;
    }
    public String firstNameGet(){
        System.out.println("Enter First Name:");
        String firstName=input.next();
        return firstName;
    }
    public String lastNameGet(){
        System.out.println("Enter Last Name:");
        String lastName=input.next();
        return lastName;
    }
    public int idGet(){
        System.out.println("Enter Id");
        int id=input.nextInt();
        return id;
    }
    public double phoneNumberGet(){
        System.out.println("Enter Phone Number:");
        double phoneNumber= input.nextDouble();
        return phoneNumber;
    }
    public String genderGet(){
        System.out.println("Enter Gender");
        String  gender=input.next();
        return gender;
    }


    public static void main(String[] args) {
        Test test=new Test();

        System.out.println("Picked number is:"+test.testMethods());
    }
}
