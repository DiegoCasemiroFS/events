package com.DiegoCasemiroFS.events.repositories;

import com.DiegoCasemiroFS.events.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
