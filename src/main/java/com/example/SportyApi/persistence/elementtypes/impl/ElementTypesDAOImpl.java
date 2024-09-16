package com.example.SportyApi.persistence.elementtypes.impl;

import com.example.SportyApi.model.elementtypes.ElementTypes;
import com.example.SportyApi.persistence.elementtypes.IElementTypesDAO;
import com.example.SportyApi.repository.elementtypesrepo.ElementTypesRepository;
import org.springframework.stereotype.Component;

@Component
public class ElementTypesDAOImpl implements IElementTypesDAO {

    private final ElementTypesRepository elementTypesRepository;


    @Override
    public void saveElementTypes(ElementTypes elementTypes) {
        elementTypesRepository.save(elementTypes);

    }

    public ElementTypesDAOImpl(ElementTypesRepository elementTypesRepository) {
        this.elementTypesRepository = elementTypesRepository;
    }
}
