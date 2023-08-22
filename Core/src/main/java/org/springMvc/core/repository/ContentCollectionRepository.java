package org.springMvc.core.repository;

import jakarta.annotation.PostConstruct;
import org.springMvc.core.model.Content;
import org.springMvc.core.model.Status;
import org.springMvc.core.model.Type;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content>  contentList = new ArrayList<>();
    public ContentCollectionRepository(){

    }
    public List<Content> findById(){
        return contentList;
    }
    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c -> c.equals(id)).findFirst();
    }
    public List<Content> findAll(){
        return contentList;
    }
    @PostConstruct
    private void init() {
        Content content = new Content(1,
                "My First Blog Post",
                "My first blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");

        contentList.add(content);

    }


}
