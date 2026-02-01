package mtech.demo.financialadv.dto;


/**
 *   {
 *     "accId": 1,
 *     "accountType": "SAVING",
 *     "accountNickname": "House Savings",
 *     "nationalId": "9910232",
 *     "bankName": "CAPITAL BANK",
 *     "iban": "JO000121232323",
 *     "balance": 2000
 *   },
 */
public record Account(
    Integer accId,
    String accountType,
    String accountNickname,
    String nationalId,
    String bankName,
    String iban,
    String balance
) {
}
