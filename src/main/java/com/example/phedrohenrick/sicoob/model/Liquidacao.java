package com.example.phedrohenrick.sicoob.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "liquidacao")
public class Liquidacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String valorOriginal;
    private String valorLiquidado;

    public String getValorOriginal() {
        return valorOriginal;
    }
    public void setValorOriginal(String valorOriginal) {
        this.valorOriginal = valorOriginal;
    }
    public String getValorLiquidado() {
        return valorLiquidado;
    }
    public void setValorLiquidado(String valorLiquidado) {
        this.valorLiquidado = valorLiquidado;
    }
}
