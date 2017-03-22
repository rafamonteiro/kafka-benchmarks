package io.monteiro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import rx.Observable;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by redki on 21/03/2017.
 */

@Component
public class KafkaPublisherService {

    @Autowired
    KafkaTemplate<Integer, String> template;



    @PostConstruct
    public void sendKafkaMessage() {
        for (int i = 0; i < 1000000; i++) {
            template.send("bazinga",String.valueOf(i));
        }

    }
}
