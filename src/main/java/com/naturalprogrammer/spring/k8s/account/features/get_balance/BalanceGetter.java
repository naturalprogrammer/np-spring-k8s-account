package com.naturalprogrammer.spring.k8s.account.features.get_balance;

import com.naturalprogrammer.spring.k8s.account.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
class BalanceGetter {

    private final AccountRepository accountRepository;

    public Balance getBalance(UUID accountId) {
        return accountRepository
                .findById(accountId)
                .map(Balance::of)
                .orElseThrow();
    }
}
