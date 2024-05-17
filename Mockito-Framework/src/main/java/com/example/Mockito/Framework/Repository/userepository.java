package com.example.Mockito.Framework.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Mockito.Framework.Entity.Users;

public interface userepository extends JpaRepository<Users, Long>
{

	//Users save(Users u);
}
