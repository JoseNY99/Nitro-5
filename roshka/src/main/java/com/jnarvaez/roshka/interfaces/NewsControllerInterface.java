package com.jnarvaez.roshka.interfaces;

import org.springframework.http.ResponseEntity;

public interface NewsControllerInterface {

    ResponseEntity<Object> getNews(String query, Boolean includeImage);

}