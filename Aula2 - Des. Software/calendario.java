import java.util.Scanner;

public class calendario {
    // Faça um programa que leia um número de 1 a 12 e escreve o nome do mês correspondente. Faça duas funções, uma usando a estrutura if...else e a outra usando o comando switch...case.

    // função mostrar NomeMes usando if (int mês);
    // função mostrar NomeMes usando switch (int mês);
    
    // funções e procedimentos
    public static String mostrarNomeMesIf(int mes) {
        String nomeMes = "";
        if (mes == 1) {
            nomeMes = "Janeiro";
            } else if (mes == 2) {
                nomeMes = "Fevereiro";
            } else if (mes == 3) {
                nomeMes = "Março";
            } else if (mes == 4) {
                nomeMes = "Abril";
            } else if (mes == 5) {
                nomeMes = "Maio";
            } else if (mes == 6) {
                nomeMes = "Junho";
            } else if (mes == 7) {
                nomeMes = "Julho";
            } else if (mes == 8) {
                nomeMes = "Agosto";
            } else if (mes == 9) {
                nomeMes = "Setembro";
            } else if (mes == 10) {
                nomeMes = "Outubro";
            } else if (mes == 11) {
                nomeMes = "Novembro";
            } else if (mes == 12) {
                nomeMes = "Dezembro";
            }
        return nomeMes;
        }
    
    public static String mostrarNomeMesSwitch(int mes) {
        String nomeMes = "Digite um mês válido";
        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;

        }
        return nomeMes;
        
    }
    // função principal "main"
    public static void main(String[] args) {
        // mostrar uma mensagem para o usuário
        System.out.println("Digite o mês:");
        Scanner input = new Scanner(System.in);

        // ler um número digitado no teclado
        int mes = input.nextInt();

        // mostrar o nome do mês usando if e switch 
        System.out.println("número digitado = " + mes);
        System.out.println("nome do mês (if) = " + mostrarNomeMesIf(mes));
        System.out.println("nome do mês (switch) = " + mostrarNomeMesSwitch(mes));
        input.close();
    }
    
}