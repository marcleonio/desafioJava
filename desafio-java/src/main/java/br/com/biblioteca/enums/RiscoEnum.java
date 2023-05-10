package br.com.biblioteca.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
// @JsonFormat(shape = JsonFormat.Shape.STRING)
public enum RiscoEnum {

    BAIXO_RISCO("baixo risco"),
    MEDIO_RISCO("médio risco"),
    ALTO_RISCO("alto risco");

    private String label;

    @JsonValue
    public String toValue() {
        return label;
    }
}
