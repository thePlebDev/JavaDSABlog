package com.Java.DSA.demo.services;

import com.Java.DSA.demo.models.Subscriber;
import com.Java.DSA.demo.repositories.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {

    private SubscriberRepository subscriberRepository;

    @Autowired
    public SubscriberService(SubscriberRepository subscriberRepository){
        this.subscriberRepository = subscriberRepository;
    }

    public void saveSubscriber(Subscriber sub){
        this.subscriberRepository.save(sub);
    }
}
