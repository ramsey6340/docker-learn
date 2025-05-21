package com.oml.docker_learn.controllers.repositories;

import com.oml.docker_learn.controllers.entities.Hello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Long> {
}
