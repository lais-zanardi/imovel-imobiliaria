import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imoveis")
@RequiredArgsConstructor
public class ImovelController {
    /** CHECKLIST ENDPOINTS
     * POST: Cadastrar novo imóvel
     * GET: Consultar imóveis por id
     * GET: Consultar imóveis por localização
     * GET: Consultar imóveis por cômodos
     * GET: Consultar por tipo de imóvel
     * GET: Consultar por imóveis a venda
     * GET: Consultar por imóveis para locação
     * GET: Consultar por faixa de preço
     * UPDATE: Atualizar imóvel por id
     * DELETE: Deletar imóvel por id
     */
    private final CriarImovelService service;

    @PostMapping("/{id}")
    public void salvarImovel(@RequestBody Imovel imovel) {
        service.salvarImovel(imovel);
    }
}
