package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.UserPaymentStatus;
import com.example.service.UserpaymentStatusService;

@Repository
public interface UserpaymentStatusRepository extends JpaRepository<UserPaymentStatus, Long>{

	public Optional<UserPaymentStatus> findByUserId(long id);

}
