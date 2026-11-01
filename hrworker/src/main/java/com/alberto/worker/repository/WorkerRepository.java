package com.alberto.worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alberto.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
