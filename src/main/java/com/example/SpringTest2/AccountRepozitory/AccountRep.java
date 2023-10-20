package com.example.SpringTest2.AccountRepozitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringTest2.entity.Account;
@Repository
public interface AccountRep extends JpaRepository<Account, Long> {

}
