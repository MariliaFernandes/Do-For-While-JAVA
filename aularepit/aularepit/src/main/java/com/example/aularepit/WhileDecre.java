package sistema.spring.sistemaalunos;
    import java.util.Scanner;

    public class WhileDecre {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Escolha um número para ver ele em decremento: ");
            int num = sc.nextInt();

            while (num >= 0) {
                System.out.print(num + " ");
                num--;
            }
        }
    }
