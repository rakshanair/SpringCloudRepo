package com.zensar.pay.repo;

import org.springframework.data.jpa.repository.JpaRepository;



import com.zensar.pay.entity.PayEntity;



public interface PayRepo extends JpaRepository<PayEntity, Integer> {



}