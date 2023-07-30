package com.learnkafka.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {

	@Id
	@GeneratedValue
	private Integer bookId;
	
	private String bookName;
	
	private String bookAuthor;
	
	@OneToOne
	@JoinColumn(name="libraryEventId")
	private LibraryEvent event;
}
