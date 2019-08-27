package com.chat.app.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chat.app.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
