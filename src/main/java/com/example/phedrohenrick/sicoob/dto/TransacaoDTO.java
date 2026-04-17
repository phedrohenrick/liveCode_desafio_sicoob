package com.example.phedrohenrick.sicoob.dto;

import java.math.BigDecimal;

public record TransacaoDTO(BigDecimal valorOriginal, BigDecimal valorLiquidado) {

    public TransacaoDTO(BigDecimal valorOriginal, BigDecimal valorLiquidado) {
        this.valorOriginal = valorOriginal;
        this.valorLiquidado = valorLiquidado;
    }
     
    public BigDecimal getValorOriginal() {
        return valorOriginal;
    }

    public BigDecimal getValorLiquidado() {
        return valorLiquidado;
    }
    
}
