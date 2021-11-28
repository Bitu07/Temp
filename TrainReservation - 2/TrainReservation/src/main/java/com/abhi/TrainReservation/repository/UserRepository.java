package com.abhi.TrainReservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.abhi.TrainReservation.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public User findById(int id);
}
