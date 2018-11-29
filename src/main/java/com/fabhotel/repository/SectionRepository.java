package com.fabhotel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fabhotel.model.Section;

@Repository
public interface SectionRepository extends CrudRepository<Section, Long> {

	Section findBySectionName(String sectionName);
	
	Section findBySectionID(Long id);
	
}
