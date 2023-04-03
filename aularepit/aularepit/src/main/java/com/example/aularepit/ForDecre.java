package sistema.spring.sistemaalunos;
import java.util.Scanner;
public class ForDecre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha um número : ");
        int num = sc.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
