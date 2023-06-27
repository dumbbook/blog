package me.suhwankang.blog.respository;

import me.suhwankang.blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRepository extends JpaRepository<Article, Long> {
}

