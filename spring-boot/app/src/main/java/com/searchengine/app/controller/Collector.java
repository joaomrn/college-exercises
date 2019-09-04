package com.searchengine.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.searchengine.app.model.MyDocument;
import com.searchengine.app.model.service.CollectorService;

/**
 * @api /collector
 * 
 * Collector controller
 */
@RestController
@RequestMapping ("/collector")
public class Collector {
    /**
     * @api /collector/start
     * 
     * Starts the collector
     */
    @GetMapping (value = "/start", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public MyDocument start() {
        CollectorService collector = new CollectorService();
        return collector.start();
    }
}