package com.allasassis.springcache.repository;

import com.allasassis.springcache.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
