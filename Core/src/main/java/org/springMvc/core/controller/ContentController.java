package org.springMvc.core.controller;

import org.springMvc.core.model.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springMvc.core.repository.ContentCollectionRepository;
import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }
    //make a request and find all the pices of content

    @GetMapping("")
    public List<Content> findAll(){
        return repository.findAll();
    }
}
