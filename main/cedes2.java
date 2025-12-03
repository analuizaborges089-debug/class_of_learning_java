public import java.util.Scanner;
public class cedes2 {
    public static void main(String [] args) {
        Scanner scani = new Scanner(System.in);
        System.out.println(" === Vendas de CDs === ");
        System.out.println("Qual o cd que você deseja comprar?");
        String cdzin = scani.nextLine();
        if (cdzin.equalsIgnoreCase("Azul")) {
            System.out.println("A cor do CD azul é R$10,00.");
        }
        else if (cdzin.equalsIgnoreCase("Vermelho")){
            System.out.println("A cor do CD vermelho é R$20,00.");
        }
        else if (cdzin.equalsIgnoreCase("Amarelo")){
            System.out.println("A cor do CD amarelo é R$30,00.");
        }
        else
            System.out.println("Não existe essa bosta de");
    }
} {
    
}
