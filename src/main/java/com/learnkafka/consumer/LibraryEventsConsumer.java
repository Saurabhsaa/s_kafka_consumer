package com.learnkafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LibraryEventsConsumer {

	@KafkaListener(topics = {"library-events-1"})
	public void onMessage(ConsumerRecord<Integer, String> consumerRecord) {
		System.out.println(consumerRecord);
	}
	
}
