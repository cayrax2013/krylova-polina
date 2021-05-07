package ru.boger.project.spring_boot_blog.dao;


import ru.boger.project.spring_boot_blog.entity.Post;

import java.util.List;

public interface PostDAO {
    List<Post> getAllPosts();
}
