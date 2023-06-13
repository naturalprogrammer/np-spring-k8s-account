package com.naturalprogrammer.spring.k8s.account.features.get_balance;

import com.naturalprogrammer.spring.k8s.account.domain.Account;

public record Balance(
        Long balanceCents
) {
    public static Balance of(Account account) {
        return new Balance(account.getBalanceCents());
    }
}
