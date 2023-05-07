package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

  private String nomeDoProduto;
  private BigDecimal valorDoProduto;
  private LocalDate dataDaEntrega;
  private String urlDoProduto;
  private String descricaoDoProduto;
  private String urlDaImagemDoProduto;

  public String getNomeDoProduto() {
    return nomeDoProduto;
  }

  public void setNomeDoProduto(String nomeDoProduto) {
    this.nomeDoProduto = nomeDoProduto;
  }

  public BigDecimal getValorDoProduto() {
    return valorDoProduto;
  }

  public void setValorDoProduto(BigDecimal valorDoProduto) {
    this.valorDoProduto = valorDoProduto;
  }

  public LocalDate getDataDaEntrega() {
    return dataDaEntrega;
  }

  public void setDataDaEntrega(LocalDate dataDaEntrega) {
    this.dataDaEntrega = dataDaEntrega;
  }

  public String getUrlDoProduto() {
    return urlDoProduto;
  }

  public void setUrlDoProduto(String urlDoProduto) {
    this.urlDoProduto = urlDoProduto;
  }

  public String getDescricaoDoProduto() {
    return descricaoDoProduto;
  }

  public void setDescricaoDoProduto(String descricaoDoProduto) {
    this.descricaoDoProduto = descricaoDoProduto;
  }

  public String getUrlDaImagemDoProduto() {
    return urlDaImagemDoProduto;
  }

  public void setUrlDaImagemDoProduto(String urlDaImagemDoProduto) {
    this.urlDaImagemDoProduto = urlDaImagemDoProduto;
  }
}
