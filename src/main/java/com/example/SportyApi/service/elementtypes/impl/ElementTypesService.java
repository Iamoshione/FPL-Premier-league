package com.example.SportyApi.service.elementtypes.impl;


import com.example.SportyApi.model.elementtypes.ElementTypes;
import com.example.SportyApi.persistence.elementtypes.IElementTypesDAO;
import com.example.SportyApi.service.elementtypes.IElementTypesService;
import org.springframework.stereotype.Service;

@Service
public class ElementTypesService implements IElementTypesService {

    private final IElementTypesDAO iElementTypesDAO;

    public ElementTypesService(IElementTypesDAO iElementTypesDAO) {
        this.iElementTypesDAO = iElementTypesDAO;
    }

    @Override
    public void saveElementTypes(ElementTypes elementTypes) {
        iElementTypesDAO.saveElementTypes(elementTypes);
    }
}
