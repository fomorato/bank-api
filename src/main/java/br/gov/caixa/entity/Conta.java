package br.gov.caixa.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "contas")
public class Conta extends PanacheEntity {

    private String email;
    private BigDecimal saldo;

    public Conta(String email) {
        this.email = email;
        if (this.email == null) {
            throw new IllegalStateException();
        }
        this.saldo = BigDecimal.valueOf(1000.00);
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
