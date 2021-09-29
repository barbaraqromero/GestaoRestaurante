package br.com.zup;

public class Ingrediente {
  private String nomeDoIngrediente;

  public Ingrediente() {

  }

  public Ingrediente(String nomeDoIngrediente) {
    this.nomeDoIngrediente = nomeDoIngrediente;
  }

  public String getNomeDoIngrediente() {
    return nomeDoIngrediente;
  }

  public void setNomeDoIngrediente(String nomeDoIngrediente) {
    this.nomeDoIngrediente = nomeDoIngrediente;
  }

  @Override
  public String toString() {
    StringBuilder retorno = new StringBuilder();
    retorno.append(nomeDoIngrediente);
    return retorno.toString();
  }
}

