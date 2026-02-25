
import java.util.Scanner;

public class DataPorExtenso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia, mes, ano;
        String nomeMes;

        System.out.print("Digite o dia: ");
        dia = sc.nextInt();

        System.out.print("Digite o mês: ");
        mes = sc.nextInt();

        System.out.print("Digite o ano: ");
        ano = sc.nextInt();

        switch (mes) {
            case 1:
                nomeMes = "janeiro";
                break;
            case 2:
                nomeMes = "fevereiro";
                break;
            case 3:
                nomeMes = "março";
                break;
            case 4:
                nomeMes = "abril";
                break;
            case 5:
                nomeMes = "maio";
                break;
            case 6:
                nomeMes = "junho";
                break;
            case 7:
                nomeMes = "julho";
                break;
            case 8:
                nomeMes = "agosto";
                break;
            case 9:
                nomeMes = "setembro";
                break;
            case 10:
                nomeMes = "outubro";
                break;
            case 11:
                nomeMes = "novembro";
                break;
            case 12:
                nomeMes = "dezembro";
                break;
            default:
                nomeMes = "mês inválido";
        }

        System.out.println(dia + " de " + nomeMes + " de " + ano);

        sc.close();
    }
}
