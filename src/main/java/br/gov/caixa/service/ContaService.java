package br.gov.caixa.service;

import br.gov.caixa.entity.Conta;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.Random;

@ApplicationScoped
public class ContaService {

    @Transactional(rollbackOn = Exception.class)
    public void criarConta(Conta conta) throws Exception {
        conta.persist();

        if (new Random().nextBoolean()) {
            Log.info("Ocorreu um erro ao criar a conta!");
            throw new Exception();
        } else {
            Log.info("Conta criada com sucesso!");
        }
    }
}
