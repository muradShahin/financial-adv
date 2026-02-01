package mtech.demo.financialadv.dto;

public record Card(
        String cardNumber,
        String issuerBank,
        String cardType,
        String balance,
        String limit,
        String cvv,
        String expiryDate
) {
}
