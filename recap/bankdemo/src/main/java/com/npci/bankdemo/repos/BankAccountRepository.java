package com.npci.bankdemo.repos;

import com.npci.bankdemo.dao.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {

    Optional<BankAccount> findByAccountNumber(Long accountNumber);
}
