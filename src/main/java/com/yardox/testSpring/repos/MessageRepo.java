package com.yardox.testSpring.repos;

import com.yardox.testSpring.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag);
}
