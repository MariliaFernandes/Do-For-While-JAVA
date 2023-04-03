package sistema.spring.sistemaalunos;
import java.util.Scanner;
public class DoDecre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha um número para ver ele em decremento: ");
        int num = sc.nextInt();

        do {
            System.out.print(num + " ");
            num--;
        } while (num >= 0);
    }
}
