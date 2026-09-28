package com.cosenza.dscommerce.dto;

public class FieldMessage {

    private String FildName;
    private String message;

    public FieldMessage(String FildName, String message) {
        this.FildName = FildName;
        this.message = message;
    }

    public String getFildName() {
        return FildName;
    }

    public String getMessage() {
        return message;
    }



}
