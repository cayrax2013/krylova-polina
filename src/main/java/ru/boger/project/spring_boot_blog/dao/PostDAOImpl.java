package ru.boger.project.spring_boot_blog.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.boger.project.spring_boot_blog.entity.Post;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PostDAOImpl implements PostDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Post> getAllPosts() {
        Session session = entityManager.unwrap(Session.class);
        List<Post> allPosts = session.createQuery("from Post", Post.class).getResultList();
        System.out.println(allPosts.get(0));
        return allPosts;
    }
}
