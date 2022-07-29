package com.Java.DSA.demo.repositories;

import com.Java.DSA.demo.models.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
}
