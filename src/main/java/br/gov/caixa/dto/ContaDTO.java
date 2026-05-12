package br.gov.caixa.dto;

import jakarta.ws.rs.Path;

import java.math.BigDecimal;

@Path("/conta")
public class ContaDTO {

    public String email;

    public BigDecimal saldo;
}
