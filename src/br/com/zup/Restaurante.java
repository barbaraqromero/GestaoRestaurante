package br.com.zup;

public class Restaurante {
  private Cardapio cardapio;

  public Restaurante(Cardapio cardapio) {
    this.cardapio = cardapio;
  }

  public Cardapio getCardapio() {
    return cardapio;
  }

  public void setCardapio(Cardapio cardapio) {
    this.cardapio = cardapio;
  }
}
