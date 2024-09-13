package com.singidunum.isa_be.repositories;

import com.singidunum.isa_be.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SizeRepository extends JpaRepository<Size, Integer> {
Optional<Size> findByName(String name);
}
