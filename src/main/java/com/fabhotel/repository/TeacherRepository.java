package com.fabhotel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fabhotel.model.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {

	Teacher findByTeacherId(Long teacherId);
}
