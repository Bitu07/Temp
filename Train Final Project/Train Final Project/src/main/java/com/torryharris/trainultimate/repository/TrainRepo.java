package com.torryharris.trainultimate.repository;

import com.torryharris.trainultimate.model.Train;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TrainRepo extends CrudRepository<Train,Integer> {
}
