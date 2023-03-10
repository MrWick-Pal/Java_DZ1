// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class TaskOne {
    
    public static int SumDigits (int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
            }
        return result;
        }
    
    public static int ProductOfNumbers (int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            System.out.println(result);
        }
        return result;
    }
    
    public static void main (String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        
        // Сумма числа от 1 до n.
        System.out.println("Сумма чисел от 1 до " + n + " = " + SumDigits(n));
        
        // Факториал числа от 1 до n.
        // System.out.println("Произведение чисел от 1 до " + n + " = " + ProductOfNumbers(n));
        scanner.close();
    }
}