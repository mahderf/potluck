package com.groupwork.potluck.potluckrepo;

import com.groupwork.potluck.models.ChefandDish;
import org.springframework.data.repository.CrudRepository;

public interface PotluckRepo extends CrudRepository<ChefandDish, Long> {
Iterable<ChefandDish> findAllByFirstname(String firstname);
Iterable<ChefandDish> findAllByDish(String dish);
}
