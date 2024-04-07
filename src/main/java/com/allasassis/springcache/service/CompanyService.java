package com.allasassis.springcache.service;

import com.allasassis.springcache.entity.Company;
import com.allasassis.springcache.repository.CompanyRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private CompanyRepository repository;

    public CompanyService(CompanyRepository repository) {
        this.repository = repository;
    }

    @Cacheable("companies")
    public List<Company> findAll() {
        return repository.findAll();
    }
}
