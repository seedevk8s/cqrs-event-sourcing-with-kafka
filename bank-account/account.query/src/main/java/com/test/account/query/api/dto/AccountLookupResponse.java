package com.test.account.query.api.dto;

import com.test.account.common.dto.BaseResponse;
import com.test.account.query.domain.BankAccount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AccountLookupResponse extends BaseResponse {
    private List<BankAccount> bankAccounts;

    public AccountLookupResponse(String message) {
        super(message);
    }
}
