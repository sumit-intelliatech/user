package com.ms.user.repositroy;

import com.ms.user.enitity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespoistory extends JpaRepository<User ,Integer>{

}
