package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.DTO.PaymentDTO;
import com.example.service.PaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired // <-- FIX: Added the missing annotation
    private PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseEntity<PaymentDTO> pay(@RequestBody PaymentDTO dto){
        return ResponseEntity.ok(paymentService.makePayment(dto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PaymentDTO>> getAll(){
        return ResponseEntity.ok(paymentService.getAllPayments());
    }
}