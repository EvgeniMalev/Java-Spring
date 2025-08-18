package com.paintingscollectors.service;

import com.paintingscollectors.model.entity.Style;

import java.util.List;

public interface StyleService {

    void initStyles();

    List<Style> getAllStyles();

    Style saveStyle(Style style);

    Style findByStyleName(String styleName);
}
