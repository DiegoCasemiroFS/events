package com.DiegoCasemiroFS.events.repositories;

import com.DiegoCasemiroFS.events.domain.event.Events;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Events, UUID> {
}
