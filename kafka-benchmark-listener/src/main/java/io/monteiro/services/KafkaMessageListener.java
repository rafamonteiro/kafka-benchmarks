package io.monteiro.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by redki on 22/03/2017.
 */

@Component
public class KafkaMessageListener {
    Logger logger = LogManager.getLogger(this.getClass());

    @KafkaListener(topics = "bazinga")
    public void listen(String data) {
        logger.info(data);

    }
}
