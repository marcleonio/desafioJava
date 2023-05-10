package br.com.biblioteca.enums;


import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusEnum {
    EM_ANALISE("em análise"),
    ANALISE_REALIZADA("análise realizada"),
    ANALISE_APROVADA("análise aprovada"),
    INICIADO("iniciado"),
    PLANEJADO("planejado"),
    EM_ANDAMENTO("em andamento"),
    ENCERRADO("encerrado"),
    CANCELADO("cancelado") ;

    private String label;

    @JsonValue
    public String toValue() {
        return label;
    }
}
