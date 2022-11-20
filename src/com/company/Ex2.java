import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        int firstNum;
        int difference;
        int amount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number in your arithmetic progression");
        firstNum = scanner.nextInt();

        System.out.println("Enter the difference between the elements in your arithmetic progression");
        difference = scanner.nextInt();

        do {System.out.println("Enter the amount of elements in your arithmetic progression");
            amount = scanner.nextInt();

        } while (amount<0);

        for (int i=1; i<=amount; i++){
            System.out.println(firstNum);
            firstNum+=difference;}




    }
}

