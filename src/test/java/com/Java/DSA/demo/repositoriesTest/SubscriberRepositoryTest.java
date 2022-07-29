package com.Java.DSA.demo.repositoriesTest;

import com.Java.DSA.demo.models.Subscriber;
import com.Java.DSA.demo.repositories.SubscriberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class SubscriberRepositoryTest {

    @Autowired
    private SubscriberRepository underTest;

    @Test
    public void createSubscriberTest(){
        //GIVEN
        String EXPECTED_EMAIL = "bob@bobmail.com";
        Subscriber sub = new Subscriber(EXPECTED_EMAIL);

        //WHEN
        underTest.save(sub);
        Subscriber foundSub = underTest.findById(1l).get();

        //THEN
        assertThat(foundSub.getEmail()).isEqualTo(EXPECTED_EMAIL);



    }
}
