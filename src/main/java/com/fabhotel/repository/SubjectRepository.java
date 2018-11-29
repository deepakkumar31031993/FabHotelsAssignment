package com.fabhotel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fabhotel.model.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long>{

	Subject findBySubjectName(String subjectName);
	Subject findBySubjectId(Long subjectId);
}
