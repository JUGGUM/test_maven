package ggumi.maven.example.post.repository;


import ggumi.maven.example.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
/*    List<Post> findByUser(User user);

    @Query("SELECT count(c) from Post p join p.comments c where p.id = ?1")
    Long countComments(Long id);

    @Query("SELECT count(l) from Post p join p.likes l where p.id = ?1")
    Long countLikes(Long id);*/
}