package com.example.SportyApi.service.elements.impl;

import com.example.SportyApi.model.elements.Elements;
import com.example.SportyApi.persistence.elements.IElementsDAO;
import com.example.SportyApi.service.elements.IElementsService;
import org.springframework.stereotype.Service;

@Service
public class IElementsServiceImpl implements IElementsService {


    private final IElementsDAO iElementsDAO;


    public IElementsServiceImpl(IElementsDAO iElementsDAO){
        this.iElementsDAO = iElementsDAO;
    }

    @Override
    public void saveElements(Elements elements) {
        iElementsDAO.saveElements(elements);
    }
}
