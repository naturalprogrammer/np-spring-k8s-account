package com.naturalprogrammer.spring.k8s.account.features.get_balance;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
class GetBalanceController {

    private final BalanceGetter balanceGetter;

    @GetMapping(value = "/{accountId}/balance")
    public Balance getBalance(@PathVariable UUID accountId) {
        return balanceGetter.getBalance(accountId);
    }

}
