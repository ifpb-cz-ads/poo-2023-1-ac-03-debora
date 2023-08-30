
import java.util.Scanner;


public class CBBAtividadePratica4 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int MetrosCubico;
        System.out.println("qual o valor em metros cubicos que vc deseja");
         MetrosCubico = Scan.nextInt();
         double ValorTotal = MetrosCubico * 100;
         System.out.println("o valor total deu R$" + ValorTotal);

    }
}
