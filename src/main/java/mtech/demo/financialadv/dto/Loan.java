package mtech.demo.financialadv.dto;

public record Loan(
        Integer loanId,
        String totalAmount,
        String monthlyAmount,
        String rate,
        String dueDate,
        String monthlyInstallements,
        String loanType,
        String bankName,
        String loanAccountNumber
) {
}
