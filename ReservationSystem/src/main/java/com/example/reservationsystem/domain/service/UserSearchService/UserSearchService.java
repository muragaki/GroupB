package com.example.reservationsystem.domain.service.UserSearchService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservationsystem.domain.entity.User;
import com.example.reservationsystem.domain.repository.user.UserRepository;

@Service
public class UserSearchService {

@Autowired
UserRepository userrepository;

public ArrayList<User> readAll(){
	ArrayList<User>username=new ArrayList<User>();
	userrepository.findAll();
	username =(ArrayList<User>)userrepository.findAll();
	return username;
	
}
public void deleteUser(User userform) {
	userrepository.delete(userform);
}
}