package com.example.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.SubscriptionPlanDTO;
import com.example.entity.SubscriptionPlan;
import com.example.repository.SubscriptionPlanRepository;
import com.netflix.discovery.converters.Auto;

@Service
public class SubscriptionPlanService {

	@Autowired
	private SubscriptionPlanRepository planRepository;
	
	public List<SubscriptionPlanDTO> getAllSubscriptionPlans(){

		return planRepository.findAll().stream().map(sub -> new SubscriptionPlanDTO(sub.getId(), sub.getName(),
				sub.getDescription(), sub.getPrice(),sub.getDurationInDays())).collect(Collectors.toList());
	}
	
	public SubscriptionPlanDTO createSubscription(SubscriptionPlanDTO dto) {
		SubscriptionPlan plan = new SubscriptionPlan();
		plan.setId(dto.id);
		plan.setName(dto.name);
		plan.setPrice(dto.price);
		plan.setDescription(dto.description);
		plan.setDurationInDays(dto.durationInDays);
		
		SubscriptionPlan save = planRepository.save(plan);
		return new SubscriptionPlanDTO(save.getId(), save.getName(), save.getDescription(),save.getPrice(), save.getDurationInDays()); 
	}
	
	
}
