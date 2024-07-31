package com.jnarvaez.roshka.interfaces;

import org.springframework.http.ResponseEntity;

public interface NewsServiceInterface {

    ResponseEntity<Object> getNews(String query, Boolean includeImage);

}