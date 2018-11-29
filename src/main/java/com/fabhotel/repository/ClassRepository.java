package com.fabhotel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fabhotel.model.ClassSchool;

@Repository
public interface ClassRepository extends CrudRepository<ClassSchool, Integer>{

	ClassSchool findByClassName(String className);
	ClassSchool findByclassID(int id);

}
