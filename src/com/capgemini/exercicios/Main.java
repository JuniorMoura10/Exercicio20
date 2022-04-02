package com.capgemini.exercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int anoFabricacao = 0;
        float valorVeiculo = 0;
        float percentualDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorAPagar = 0.0f;

        //Armazenamento da qtd de veículos
        int totalCarrosSeminovos = 0;
        int totalCarros = 0;

        Scanner leitor = new Scanner(System.in);

        char desejaRepetir = 'S';

        while (desejaRepetir == 'S' || desejaRepetir == 's'){

            System.out.println("Digite o ano de fabricação do veículo: ");
            anoFabricacao = leitor.nextInt();
            System.out.println("Digite o valor do veícuo: ");
            valorVeiculo = leitor.nextFloat();

            if (anoFabricacao <= 2000){
                percentualDesconto = 0.12f;
            }else{
                percentualDesconto = 0.07f;
                totalCarrosSeminovos++;
            }
            totalCarros++;

            valorDesconto = valorVeiculo * percentualDesconto;
            valorAPagar = valorVeiculo - valorDesconto;

            System.out.println("O valor do desconto foi: " + valorDesconto);
            System.out.println("O valor do a pagar é de: " + valorAPagar);



            System.out.println("Deseja cadastrar mais veículos? S - Sim / N - Não");
            desejaRepetir = leitor.next().charAt(0);
        }

        System.out.println("A quantidade de veículos vendidos foi de: " + totalCarros);
        System.out.println("A quantidade de veículos seminovos vendidos foi de: " + totalCarrosSeminovos);
    }
}
