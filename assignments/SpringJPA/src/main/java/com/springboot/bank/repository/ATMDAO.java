package com.springboot.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.bank.model.ATM;


public interface ATMDAO extends JpaRepository<ATM, Long> {

}
