package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DTO.UserpaymentStatusDTO;
import com.example.entity.Payment;
import com.example.entity.UserPaymentStatus;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{


  }
