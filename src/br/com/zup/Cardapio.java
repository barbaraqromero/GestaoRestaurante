package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
  List<Prato> pratoList = new ArrayList<>();

  public Cardapio() {

  }



  public void criarPrato (Prato novoPrato){
    pratoList.add(novoPrato);

  }

  @Override
  public String toString() {
    StringBuilder mostrarCardapio = new StringBuilder();
    mostrarCardapio.append("Lista de pratos: ");
    mostrarCardapio.append(pratoList);
    return  mostrarCardapio.toString();
  }
}
