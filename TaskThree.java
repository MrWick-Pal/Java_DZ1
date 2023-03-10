// Реализовать простой калькулятор.
import java.util.Scanner;

public class TaskThree {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("\nУкажите операцию | + | - | * | / |: ");
        char operation = scanner.next().charAt(0);
        double answer;
        scanner.close();
        
        switch(operation) {
           case '+': answer = num1 + num2;
              break;
           case '-': answer = num1 - num2;
              break;
           case '*': answer = num1 * num2;
              break;
           case '/': answer = num1 / num2;
              break;
           default:  System.out.print("Введите правильную операцию!");
              return;
        }
        System.out.print("\nРезультат:\n");
        System.out.print(num1 + " " + operation + " " + num2 + " = " + answer);
     }
  }
