package com.searchengine.app.model;

import java.net.URL;
import java.util.List;

/**
 *
 * @author guilherme
 */
public class MyDocument {
    private URL url;
    private String text;
    private String view;
    private List<String> urls;

    public MyDocument() {
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
    
    
}
