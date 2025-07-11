package com.chan7731.simple_board.repository;

import com.chan7731.simple_board.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}