package de.felixschick.restapibackend.repositories;

import de.felixschick.restapibackend.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
}