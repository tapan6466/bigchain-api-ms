/**
 * 
 */
package com.pwc.bigchain.app.repository;

/**
 * @author lokeshk025
 *
 */
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bigchain.api.model.Colleague;

import java.util.List;

public interface ColleagueRepository extends MongoRepository<Colleague, String> {

	/**
	 * @param name
	 * @return
	 */
	public List<Colleague> findByName(String name);

}