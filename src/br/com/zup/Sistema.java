package br.com.zup;

import java.util.Scanner;

public class Sistema {
  public static void menu() {
    System.out.println("\n*** RESTAURANTE COMIDAS DE VÓ ***");
    System.out.println("\n\t\t\t M E N U");
    System.out.println("\n1 - Adicionar novo prato");
    System.out.println("2 - Adicionar novo ingrediente");
    System.out.println("3 - Exibir cardápio");
    System.out.println("4 - Voltar ao menu principal");
    System.out.println("5 - Sair");
  }

  private static Scanner pegarDadosExternos(String mensagem) {
    System.out.println(mensagem);
    return new Scanner(System.in);
  }

  public static Prato adicionarPrato(Cardapio cardapio) {
    String nome = pegarDadosExternos("Digite o nome do prato a ser adicionado: ").nextLine();
    double valorDoPrato = pegarDadosExternos("Digite o valor do prato: ").nextDouble();
    Prato pratoAdicionado = new Prato(nome, valorDoPrato);
    cardapio.criarPrato(pratoAdicionado);
    return pratoAdicionado;
  }

  public static Ingrediente adicionarIngrediente() {
    String nome = pegarDadosExternos("Digite o ingrediente a ser adicionado: ").nextLine();
    Ingrediente ingrediente = new Ingrediente(nome);
    return ingrediente;
  }

  public static void mostrarCardapio(Cardapio cardapio) {
    System.out.println(cardapio);
  }

  public static void executar() {
    boolean menu = true;
    Cardapio cardapio = new Cardapio();

    while (menu) {
      menu();
      int opcaoDesejada = pegarDadosExternos("Digite a opção desejada: ").nextInt();

      if (opcaoDesejada == 1) {
        adicionarPrato(cardapio);

      }
      if (opcaoDesejada == 2) {
        adicionarIngrediente();
      }

      if (opcaoDesejada == 3) {
        mostrarCardapio(cardapio);
      }
    }

  }

}
