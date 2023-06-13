package com.naturalprogrammer.spring.k8s.account.repositories;

import com.naturalprogrammer.spring.k8s.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}
