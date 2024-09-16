package com.example.SportyApi.repository.elementtypesrepo;

import com.example.SportyApi.model.elementtypes.ElementTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementTypesRepository extends JpaRepository<ElementTypes,Integer> {
}
