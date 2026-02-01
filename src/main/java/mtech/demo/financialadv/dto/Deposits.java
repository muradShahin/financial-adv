package mtech.demo.financialadv.dto;

public record Deposits(
        Integer depositId,
        String depositAmount,
        String rate,
        String endDate,
        String bankName,
        String depositAccountNumber
) {
}
