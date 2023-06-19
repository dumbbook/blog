package me.suhwankang.blog.service;

import lombok.RequiredArgsConstructor;
import me.suhwankang.blog.dto.AddArticleRequest;
import me.suhwankang.blog.domain.Article;
import me.suhwankang.blog.respository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }
}
