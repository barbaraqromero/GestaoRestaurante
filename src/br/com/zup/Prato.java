package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {
  private String nomeDoPrato;
  List<Ingrediente> ingredientesList = new ArrayList<>();

  public Prato(String nomeDoPrato) {
    this.nomeDoPrato = nomeDoPrato;
  }

  public String getNomeDoPrato() {
    return nomeDoPrato;
  }

  public void setNomeDoPrato(String nomeDoPrato) {
    this.nomeDoPrato = nomeDoPrato;
  }
}
