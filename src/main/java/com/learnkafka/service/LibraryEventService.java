package com.learnkafka.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learnkafka.Entity.LibraryEvent;
import com.learnkafka.repository.LibraryEventRepository;

@Service
public class LibraryEventService {

	@Autowired
	LibraryEventRepository eventRepository;
	
	@Autowired
	ObjectMapper mapper;
	
	public LibraryEvent processLibraryEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException{
		
		LibraryEvent libraryEvent = mapper.readValue(consumerRecord.value() , LibraryEvent.class);
		
		libraryEvent = eventRepository.save(libraryEvent);
		return libraryEvent;
	}
}
