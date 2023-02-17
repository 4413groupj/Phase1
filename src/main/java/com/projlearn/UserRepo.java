package com.projlearn;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projlearn.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	List<User> findByuserFirstName(String userFirstName);// This is DSL and we can use Desc/Asc type of sql manipulations from here
	//Adding another way for query with Annotation using JPQL
	@Query("from User where userSecondName= :name")
	List<User> findByuserSecondName(@Param ("name")String userSecondName);//whatever received as userSecondName assigned to name
	


	

}
