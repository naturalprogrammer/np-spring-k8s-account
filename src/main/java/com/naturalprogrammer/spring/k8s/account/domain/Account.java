package com.naturalprogrammer.spring.k8s.account.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
public class Account {

    @Id
    private UUID id;

    private Long balanceCents = 0L;
}
