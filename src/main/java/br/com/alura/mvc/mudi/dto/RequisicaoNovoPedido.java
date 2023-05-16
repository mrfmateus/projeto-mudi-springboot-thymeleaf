package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

import javax.validation.constraints.NotBlank;

public class RequisicaoNovoPedido {

  @NotBlank
  private String nomeProduto;

  @NotBlank
  private String urlProduto;

  @NotBlank
  private String urlImagemProduto;

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

  public String getUrlImagemProduto() {
    return urlImagemProduto;
  }

  public void setUrlImagemProduto(String urlImagemProduto) {
    this.urlImagemProduto = urlImagemProduto;
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
    pedido.setUrlDaImagemDoProduto(urlImagemProduto);
    pedido.setNomeDoProduto(nomeProduto);
    return pedido;
  }
}
