/**
 * 
 */
package com.pwc.bigchain.app.controller;

/**
 * @author lokeshk025
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pwc.bigchain.app.entity.Colleague;
import com.pwc.bigchain.app.entity.Recognitions;
import com.pwc.bigchain.app.repository.ColleagueRepository;

import java.util.List;

@RestController
public class RecognitionController {

    @Autowired
    private ColleagueRepository repository;
    @RequestMapping("/")
    public String getMessage()
    {
    	return "Hello There";
    	
    }

    @RequestMapping("/colleagues/{name}")
    public List<Colleague> getRecognition(@PathVariable("name") String name){
        return repository.findByName(name);
    }

    @RequestMapping("/colleagues")
    public List<Colleague> getColleagues(){
        return repository.findAll();
    }

    @PostMapping("/colleagues")
    public ResponseEntity<String> addColleague(@RequestBody Colleague colleague){
    	repository.save(colleague);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //This is of course a very naive implementation! We are assuming unique names...
    @DeleteMapping("/colleagues/{name}")
    public ResponseEntity<String> deleteColleague(@PathVariable  String name){
        List<Colleague> colleagues = repository.findByName(name);
        if(colleagues.size() == 1) {
            Colleague colleague = colleagues.get(0);
            repository.delete(colleague);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}