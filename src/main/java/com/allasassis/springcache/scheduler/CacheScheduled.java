package com.allasassis.springcache.scheduler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class CacheScheduled {

    private static final Logger logger = LogManager.getLogger(CacheScheduled.class);

    @Scheduled(fixedDelay = 30, timeUnit = TimeUnit.SECONDS)
    @CacheEvict("companies")
    public void clearCacheCompanies() {
        logger.info("EXECUTED AT = " + LocalDateTime.now());
    }
}
