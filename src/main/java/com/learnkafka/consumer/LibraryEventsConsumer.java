package com.learnkafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.learnkafka.repository.LibraryEventRepository;
import com.learnkafka.service.LibraryEventService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LibraryEventsConsumer {
	
	@Autowired
	LibraryEventService eventService;

	@KafkaListener(topics = {"library-events-1"})
	public void onMessage(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		eventService.processLibraryEvent(consumerRecord);
	}
	
}
