import java.util.Scanner;
public class seminar1 {
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);
        int x = 0; 
        System.out.printf("Введите число x: ");
        x = in.nextInt();
        int T = 0;
        T = (int) (0.5 * x * (x+1)); 
        System.out.println("Треугольное число x = : " + T);
        }
    }


