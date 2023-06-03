package SistUber;

import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha qual o véiculo");
        System.out.println("|-------------------------------|");
        System.out.println("|[1]Carro de luxo - R$:10,00/km |");
        System.out.println("|[2]Carro Basico - R$:5,00/km   |");
        System.out.println("|[3]Moto - R$:3,00/km           |");
        System.out.println("|-------------------------------|");
        //Escolhe o veiculo
        int veiculo = input.nextInt();

        //Quilometragem inicial do carro
        System.out.print("Qual o quilometro inicial do carro? ");
        double quilometroInicial = input.nextDouble();

        //Quilometragem final do carro
        System.out.print("Qual o quilometro final do carro? ");
        double quilometroFinal = input.nextDouble();


        //Verificando condições
        if(quilometroInicial == 0){
            double valor = quilometroInicial + quilometroFinal;
        }
        if(quilometroInicial < 0){
            System.out.println("Quilometragem invalida");
            return;
        }
        if (quilometroFinal < quilometroInicial){
            System.out.println("A quilometragem final não pode ser menor que a incial");
            return;
        }
        double valor1 = quilometroFinal - quilometroInicial;

        //Switch Case que faz os calculos com base na sua escolha
        switch (veiculo){
            case 1:
                System.out.println("Você escolheu carro de luxo");
                double carroLuxo = 10.00;
                double valor2 = valor1 * carroLuxo;
                System.out.println("O valor da corrida é: " + valor2);
                break;
            case 2:
                System.out.println("Você escolheu carro basico");
                double carroBasico = 5.00;
                double valor3 = valor1 * carroBasico;
                System.out.println("O valor da corrida é: " + valor3);
                break;
            case 3:
                System.out.println("Você escolheu moto");
                double moto = 3.00;
                double valor4 = valor1 * moto;
                System.out.println("O valor da corrida é: " + valor4);
                break;
            default:
                System.out.println("Escolha invalida");
                return;
        }

        //Nota final
        System.out.println("-----------------------------");
        if (veiculo == 1){
            System.out.println("Você escolheu carro de luxo");
        }
        else if (veiculo == 2){
            System.out.println("Voce escolheu carro basico");
        }
        else if (veiculo == 3){
            System.out.println("Você esclheu moto");
        }
        System.out.println("A corrida foi iniciada com a valor de: " + quilometroInicial + " e terminou com: " + quilometroFinal);
        System.out.println("-----------------------------");
    }
}