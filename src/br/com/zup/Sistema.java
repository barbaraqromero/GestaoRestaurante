package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
  public static void menu() {
    System.out.println("\n*** RESTAURANTE COMIDAS DE VÓ ***");
    System.out.println("\n\t\t\t M E N U");
    System.out.println("\n1 - Adicionar novo prato");
    System.out.println("2 - Exibir cardápio");
    System.out.println("3 - Sair");
  }

  private static Scanner pegarDadosExternos(String mensagem) {
    System.out.println(mensagem);
    return new Scanner(System.in);
  }

  public static Prato adicionarPrato() {
    String nome = pegarDadosExternos("Digite o nome do prato a ser adicionado: ").nextLine();
    double valorDoPrato = pegarDadosExternos("Digite o valor do prato: ").nextDouble();
    Prato prato = new Prato(nome, valorDoPrato);
    return prato;

  }

  public static Ingrediente adicionarIngrediente() {
    String nome = pegarDadosExternos("Digite o ingrediente a ser adicionado: ").nextLine();
    Ingrediente ingrediente = new Ingrediente();
    return ingrediente;
  }


  public static void executar() {
    boolean menu = true;
    Cardapio cardapio = new Cardapio();

    while (menu) {
      menu();
      int opcaoDesejada = pegarDadosExternos("Digite a opção desejada: ").nextInt();

      if (opcaoDesejada == 1) {
        Prato prato = adicionarPrato();
        cardapio.criarPrato(prato);

        int qtdeDeIngredientes = pegarDadosExternos("Digite a quantidade de ingredientes: ").nextInt();
        for (int i = 0; i < qtdeDeIngredientes; i++) {
          Ingrediente ingrediente = adicionarIngrediente();
          prato.adicionarIngrediente(ingrediente);

        }

      } else if (opcaoDesejada == 2) {
        System.out.println(cardapio);
      } else {
        menu = false;
      }

    }
  }

}

