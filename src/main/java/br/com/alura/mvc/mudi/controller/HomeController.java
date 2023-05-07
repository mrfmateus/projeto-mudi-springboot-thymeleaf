package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

  @GetMapping("/home")
  public String home(Model model) {
    Pedido pedido = new Pedido();
    pedido.setNomeDoProduto("ACER Notebook Gamer Nitro 5");
    pedido.setValorDoProduto(BigDecimal.valueOf(4499.99));
    pedido.setDataDaEntrega(LocalDate.of(2022, 10, 20));
    pedido.setUrlDoProduto("https://www.amazon.com.br/ACER-Notebook-AN515-57-52LC-Windows11-vermelho/dp/B0B7KC3QSB?ref_=Oct_d_obs_d_16364755011_5&pd_rd_w=RQnpG&content-id=amzn1.sym.0e1232a0-dc18-4250-8f7f-d8624a5b589a&pf_rd_p=0e1232a0-dc18-4250-8f7f-d8624a5b589a&pf_rd_r=JFRZKHZV3R2MTD0906DP&pd_rd_wg=i53YJ&pd_rd_r=6bffa521-68f7-4640-8b75-6d71e3a6140a&pd_rd_i=B0B7KC3QSB");
    pedido.setDescricaoDoProduto("ACER Notebook Gamer Nitro 5 AN515-57-52LC, CI5 11400H, 8GB, 512GB SDD, (NVIDIA GTX 1650) Windows11. 15,6” LED FHD IPS Preto e vermelho");
    pedido.setUrlDaImagemDoProduto("https://m.media-amazon.com/images/I/61wxOWQ74kL._AC_SL1000_.jpg");

    List<Pedido> pedidosList = Collections.singletonList(pedido);
    model.addAttribute("pedidos", pedidosList);
    return "home";
  }
}
