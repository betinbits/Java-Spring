package com.alberto.worker.resources;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alberto.worker.entities.Worker;
import com.alberto.worker.repository.WorkerRepository;

@RestController  						//para funcionar como webservices
@RequestMapping(value = "/workers")     //caminho padão do recurso
public class WorkerResource {
	
	private final WorkerRepository repository;

	WorkerResource(WorkerRepository repository) {  //substitue com construtor @Autowired
		this.repository = repository;
	}

	@GetMapping
	public ResponseEntity<List<Worker>> finsAll(){
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id){
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
 }
