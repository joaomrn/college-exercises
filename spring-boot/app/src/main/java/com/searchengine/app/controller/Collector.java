package com.searchengine.app.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.jsoup.Jsoup;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @GetMapping (value = "/start", produces = MediaType.TEXT_PLAIN_VALUE)
    public String start() {
        // Instance the String builder
        StringBuilder page = new StringBuilder ();
        
        // Verify errors
        try {
            // Get the URL
            URL url = new URL("http://journals.ecs.soton.ac.uk/java/tutorial/networking/urls/readingWriting.html");
            
            // Make the connection
            URLConnection url_connection = url.openConnection();
            
            // Get the input stream
            InputStream is = url_connection.getInputStream();
            
            // Get the input stream render
            InputStreamReader reader = new InputStreamReader(is);
            
            // Get the buffered reader
            BufferedReader buffer = new BufferedReader(reader);
            
            // Creat a line string
            String line;

            // While repetition
            while ((line = buffer.readLine()) != null) {
                
                // Use the jsoup making a parse
                line = Jsoup.parse(line).text();
                
                // Printing the line
                System.out.println(line);
                
                // Make the line append
                page.append(line);
            }            

        } catch (IOException e) {
            // Error message
            page.append ("Erro: não foi possível coletar a página.");
        }

        // Returning data
        return page.toString ();
    }    
}