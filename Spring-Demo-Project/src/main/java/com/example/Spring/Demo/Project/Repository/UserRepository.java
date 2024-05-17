package com.example.Spring.Demo.Project.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Spring.Demo.Project.Entity.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
Optional<Users> findByName(String name);

@Query("select u from Users u where u.name like %:name%")
List<Users> findbyuser(String name);

@Query("select u from Users u where u.id IN :ids ")
List<Users> findByAllIds(List<Long> ids);


}
