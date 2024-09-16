package com.example.SportyApi.repository.elementsrepo;

import com.example.SportyApi.model.elements.Elements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementsRepository extends JpaRepository<Elements,Integer> {
}
