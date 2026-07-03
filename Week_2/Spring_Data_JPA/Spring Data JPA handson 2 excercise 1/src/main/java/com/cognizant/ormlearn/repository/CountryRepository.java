package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByNameContainingOrderByCodeAsc(String text);

    List<Country> findByNameContainingOrderByNameAsc(String text);

    List<Country> findByNameStartingWithOrderByCodeAsc(String alphabet);
}
