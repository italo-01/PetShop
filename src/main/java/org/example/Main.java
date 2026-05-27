package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var option =-1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina com água");
            System.out.println("3 - Abastecer a maquina com shampoo");
            System.out.println("4 - Verifica água da máquina");
            System.out.println("5 - verifica Shampoo da máquina");
            System.out.println("6- Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina ");
            System.out.println("8- Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
        }while (option != 0);

    }
}