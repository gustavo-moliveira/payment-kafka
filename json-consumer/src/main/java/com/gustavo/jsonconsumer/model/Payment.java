package com.gustavo.jsonconsumer.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Payment implements Serializable {
    private Long id;
    private Long idUser;
    private Long idProduto;
    private Long cardNumber;
}
