package com.pseudonymize.system.repository;

import com.pseudonymize.system.entity.Greet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetRepository extends JpaRepository<Greet, Long> {

}