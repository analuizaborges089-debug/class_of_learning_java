import java.util.Scanner;

public class Verifica_Idade_2 {

    public static void main(String[] args) {
        // Inicializa o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("--- Verificação de Idade ---");

        // Loop infinito para permitir múltiplas tentativas
        while (true) {
            System.out.println("Digite a idade (ou 0 para sair):");

            // Verifica se a próxima entrada é um inteiro
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();

                // 1. Condição de Saída
                if (idade == 0) {
                    System.out.println("O programa está encerrando.");
                    break; // Sai do loop
                }

                // 2. Condições de Verificação de Idade (Assumindo idades positivas)
                if (idade > 0) {
                    if (idade >= 60) {
                        System.out.println("Você é idoso, Vó/Tio!");
                        // O código original não tinha um 'break' aqui, mas geralmente em um 'while(true)' você
                        // sairia após uma entrada válida, a menos que quisesse processar várias idades.
                        // Mantendo o comportamento de 'não sair' após a entrada válida, como o original parece sugerir,
                        // mas idealmente, você sairia se fosse uma única verificação.
                        // Para fins de demonstração, não adicionarei o 'break' aqui, seguindo a lógica do código projetado.
                    } else if (idade >= 18) {
                        System.out.println("Você é maior de idade!");
                    } else { // 1 a 17 anos
                        System.out.println("Você é uma criança/adolescente!");
                    }
                } else {
                    // Condição para idade negativa, embora a verificação 'if (idade > 0)' cuide disso,
                    // é bom ter uma mensagem mais clara para idades inválidas.
                    System.out.println("Entrada Inválida! Digite novamente uma idade positiva.");
                }
            } else {
                // 3. Lidando com entrada não numérica (ex: letras)
                System.out.println("Entrada Inválida! Por favor, digite um número inteiro.");
                // Limpa o buffer do scanner para evitar loop infinito
                scanner.next();
            }
        }

        // Fecha o scanner após o uso para liberar recursos
        scanner.close();
    }
}

