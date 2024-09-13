package com.singidunum.isa_be.controllers;

import com.singidunum.isa_be.entities.Receipt;
import com.singidunum.isa_be.services.IReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receipt")
@RequiredArgsConstructor
public class ReceiptController {
    private final IReceiptService receiptService;

    @PostMapping("create")
    public String createReceipt(@RequestBody Receipt receipt) {
        receiptService.createReceipt(receipt);

        return "ok";
    }
}
