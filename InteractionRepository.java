package com.example.touchbasetele.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.touchbasetele.model.Interaction;

public interface InteractionRepository extends JpaRepository<Interaction, Long> {
}
