package com.imaginea.jhipster.fitapp.repository;

import com.imaginea.jhipster.fitapp.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
