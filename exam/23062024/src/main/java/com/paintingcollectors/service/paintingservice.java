package com.paintingscollectors.service;

import com.paintingscollectors.model.dto.AddPaintingDTO;
import com.paintingscollectors.model.entity.Painting;

import java.util.List;

public interface PaintingService {

    void addPainting(AddPaintingDTO addPaintingDTO);

    List<Painting> getAllPaintings();

    Painting getPaintingById(Long id);

    void deletePaintingById(Long id);

    void addTestPainting();
}


