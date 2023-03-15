package me.liuyi.springtest.repositories;


import me.liuyi.springtest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}