package com.singidunum.isa_be.services;

import com.singidunum.isa_be.entities.Receipt;
import com.singidunum.isa_be.repositories.ReceiptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReceiptService implements IReceiptService {
    private final ReceiptRepository receiptRepository;

    @Override
    public void createReceipt(Receipt receipt) {
        receiptRepository.save(receipt);
    }
}
