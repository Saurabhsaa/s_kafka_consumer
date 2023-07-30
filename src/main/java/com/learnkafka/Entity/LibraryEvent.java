package com.learnkafka.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class LibraryEvent {

	@Id
	@GeneratedValue
	private Integer libraryEventId;
	
	private LibraryEventType libraryEventType;
	
	@OneToOne(mappedBy = "event")
	private Book book;
}
