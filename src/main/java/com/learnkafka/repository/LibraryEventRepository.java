package com.learnkafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnkafka.Entity.LibraryEvent;

public interface LibraryEventRepository extends JpaRepository<LibraryEvent, Integer> {

}
