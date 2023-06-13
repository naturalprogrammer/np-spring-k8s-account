package com.naturalprogrammer.spring.k8s.account.features.init;

import com.naturalprogrammer.spring.k8s.account.domain.Account;
import com.naturalprogrammer.spring.k8s.account.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Slf4j
@Component
@RequiredArgsConstructor
public class DbInit implements CommandLineRunner {

    private final AccountRepository accountRepository;

    @Override
    public void run(String... args) {

        if (accountRepository.count() == 0) {
            var account = new Account();
            account.setId(UUID.fromString("d46c6449-22de-4a3f-9366-507ba4eb830d"));
            account.setBalanceCents(ThreadLocalRandom.current().nextLong(99999999L));
            accountRepository.save(account);
        }

        var account = accountRepository
                .findAll(Pageable.ofSize(1))
                .getContent()
                .get(0);

        log.info("A sample account: {}", account);
    }
}
