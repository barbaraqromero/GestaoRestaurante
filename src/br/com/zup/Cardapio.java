package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
  List<Prato> pratoList = new ArrayList<>();

  public Cardapio() {

  }

  public List<Prato> getPratoList() {
    return pratoList;
  }

  public void setPratoList(List<Prato> pratoList) {
    this.pratoList = pratoList;
  }

  public void adicionarPrato(Prato novoPrato) {
    pratoList.add(novoPrato);
  }

  @Override
  public String toString() {
    StringBuilder mostrarPratos = new StringBuilder();
    mostrarPratos.append("*** PRATOS ***");
    mostrarPratos.append(pratoList);
    return mostrarPratos.toString();
  }
}

