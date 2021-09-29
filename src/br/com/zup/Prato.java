package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {
  private String nome;
  private double valorDoPrato;
  List<Ingrediente> ingredientesList = new ArrayList<>();

  public Prato () {

  }

  public Prato(String nomeDoPrato, double valorDoPrato) {
    this.nome = nomeDoPrato;
    this.valorDoPrato = valorDoPrato;
  }

  public String getNomeDoPrato() {
    return nome;
  }

  public void setNomeDoPrato(String nomeDoPrato) {
    this.nome = nomeDoPrato;
  }

  public double getValorDoPrato() {
    return valorDoPrato;
  }

  public void setValorDoPrato(double valorDoPrato) {
    this.valorDoPrato = valorDoPrato;
  }

  public List<Ingrediente> getIngredientesList() {
    return ingredientesList;
  }

  public void setIngredientesList(List<Ingrediente> ingredientesList) {
    this.ingredientesList = ingredientesList;
  }

  public void adicionarIngrediente(Ingrediente novoIngrediente) {
    ingredientesList.add(novoIngrediente);
  }

  @Override
  public String toString() {
    StringBuilder mostrarIngredientes = new StringBuilder();
    mostrarIngredientes.append(nome);
    mostrarIngredientes.append(valorDoPrato);
    mostrarIngredientes.append("Os ingredientes são: ");
    mostrarIngredientes.append(ingredientesList);
    return mostrarIngredientes.toString();
  }


}
