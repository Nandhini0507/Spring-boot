package com.example.Exception.Example.Controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Userrepository extends JpaRepository<Users, Long> {


}
