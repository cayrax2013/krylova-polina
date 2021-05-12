package ru.boger.project.spring_boot_blog.dao;

import ru.boger.project.spring_boot_blog.entity.Person;

public interface PersonDAO {
    public void savePerson(Person person);
}
