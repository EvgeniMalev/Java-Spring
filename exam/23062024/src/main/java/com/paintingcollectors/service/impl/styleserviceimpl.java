package com.paintingscollectors.service.impl;

import com.paintingscollectors.model.entity.Style;
import com.paintingscollectors.repository.StyleRepository;
import com.paintingscollectors.service.StyleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class StyleServiceImpl implements StyleService {

    private final StyleRepository styleRepository;

    public StyleServiceImpl(StyleRepository styleRepository) {
        this.styleRepository = styleRepository;
    }

    @Override
    public void initStyles() {
        List<String> styleNames = Arrays.asList("IMPRESSIONISM", "ABSTRACT", "EXPRESSIONISM", "SURREALISM", "REALISM");
        styleNames.forEach(styleName -> {
            if (styleRepository.findByStyleName(styleName).isEmpty()) {
                Style style = new Style();
                style.setStyleName(styleName);
                // Set description based on styleName if needed
                style.setDescription("Description for " + styleName);
                styleRepository.save(style);
            }
        });
    }

    @Override
    public List<Style> getAllStyles() {
        return styleRepository.findAll();
    }

    @Override
    public Style saveStyle(Style style) {
        return styleRepository.save(style);
    }

    @Override
    public Style findByStyleName(String styleName) {
        return styleRepository.findByStyleName(styleName).orElse(null);
    }
}
