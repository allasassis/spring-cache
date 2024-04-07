package com.allasassis.springcache.controller;

import com.allasassis.springcache.entity.Company;
import com.allasassis.springcache.service.CacheService;
import com.allasassis.springcache.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cache")
public class CacheController {

    private final CacheService cacheService;

    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping
    public ResponseEntity removeCache(@RequestParam("cacheKey") String cacheKey) {
        cacheService.exitAllCacheValues(cacheKey);
        return ResponseEntity.noContent().build();
    }
}
