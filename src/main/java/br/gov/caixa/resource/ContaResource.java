package br.gov.caixa.resource;

import br.gov.caixa.dto.ContaDTO;
import br.gov.caixa.entity.Conta;
import br.gov.caixa.service.ContaService;
import io.quarkus.logging.Log;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/conta")
public class ContaResource {

    public ContaResource(ContaService service) {
        this.service = service;
    }

    @POST
    public void criarConta(ContaDTO body) {
        Log.info("Cirando conta: " + body);
        Conta conta = new Conta(body.email());
    }
}
