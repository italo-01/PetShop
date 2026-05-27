package org.example;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var option =-1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina com água");
            System.out.println("3 - Abastecer a maquina com shampoo");
            System.out.println("4 - Verifica água da máquina");
            System.out.println("5 - verifica Shampoo da máquina")
            System.out.println("6- Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina ");
            System.out.println("8- Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 7 ->setPetinPetMachine();
            }

        }while (option != 0);

    }

    public static void setPetinPetMachine(){
        System.out.println("Informe o nome do pet");
        var name = s
    }
}