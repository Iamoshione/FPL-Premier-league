package com.example.SportyApi.persistence.elements.impl;

import com.example.SportyApi.model.elements.Elements;
import com.example.SportyApi.persistence.elements.IElementsDAO;
import com.example.SportyApi.repository.elementsrepo.ElementsRepository;
import org.springframework.stereotype.Component;

@Component
public class ElementsDAOImpl implements IElementsDAO {

    private final ElementsRepository elementsRepository;

    public ElementsDAOImpl(ElementsRepository elementsRepository){
        this.elementsRepository = elementsRepository;
    }
    @Override
    public void saveElements(Elements elements) {
        elementsRepository.save(elements);
    }
}
