/**
 * 
 */
package com.pwc.bigchain.app.repository;

/**
 * @author lokeshk025
 *
 */
import org.springframework.data.mongodb.repository.MongoRepository;

import com.pwc.bigchain.app.entity.Colleague;

import java.util.List;


public interface ColleagueRepository extends MongoRepository<Colleague, String> {

    public List<Colleague> findByName(String name);

}