package com.oml.docker_learn.controllers.services.impls;

import com.oml.docker_learn.controllers.entities.Hello;
import com.oml.docker_learn.controllers.repositories.HelloRepository;
import com.oml.docker_learn.controllers.services.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloImpl implements HelloService {
    private final HelloRepository repo;

    @Override
    public String sayHello() {
        try {
            return repo.save(new Hello(null, "Salamou aleykoum")).getMessage();
        } catch (Exception e) {
            return "Erreur de salutation";
        }
    }
}
