package com.nqvinh.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nqvinh.accountservice.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
