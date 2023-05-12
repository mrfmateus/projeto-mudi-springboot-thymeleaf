package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {

  private String nomeProduto;
  private String urlProduto;
  private String imagemProduto;
  private String descricaoProduto;

  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public String getUrlProduto() {
    return urlProduto;
  }

  public void setUrlProduto(String urlProduto) {
    this.urlProduto = urlProduto;
  }

  public String getImagemProduto() {
    return imagemProduto;
  }

  public void setImagemProduto(String imagemProduto) {
    this.imagemProduto = imagemProduto;
  }

  public String getDescricaoProduto() {
    return descricaoProduto;
  }

  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  public Pedido toPedido() {
    Pedido pedido = new Pedido();
    pedido.setDescricaoDoProduto(descricaoProduto);
    pedido.setUrlDoProduto(urlProduto);
    pedido.setUrlDaImagemDoProduto(imagemProduto);
    pedido.setNomeDoProduto(nomeProduto);
    return pedido;
  }
}
