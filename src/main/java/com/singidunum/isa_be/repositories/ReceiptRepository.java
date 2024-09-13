package com.singidunum.isa_be.repositories;

import com.singidunum.isa_be.entities.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {
}
