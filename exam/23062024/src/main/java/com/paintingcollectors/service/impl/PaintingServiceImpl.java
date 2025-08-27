package com.paintingscollectors.service.impl;

import com.paintingscollectors.model.dto.AddPaintingDTO;
import com.paintingscollectors.model.entity.Painting;
import com.paintingscollectors.repository.PaintingRepository;
import com.paintingscollectors.service.PaintingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaintingServiceImpl implements PaintingService {

    private final PaintingRepository paintingRepository;

    @Autowired
    public PaintingServiceImpl(PaintingRepository paintingRepository) {
        this.paintingRepository = paintingRepository;
    }

    @Override
    public void addPainting(AddPaintingDTO addPaintingDTO) {
        Painting painting = new Painting();
        painting.setName(addPaintingDTO.getName());
        painting.setAuthor(addPaintingDTO.getAuthor());
        painting.setStyle(addPaintingDTO.getStyle());
        painting.setImageUrl(addPaintingDTO.getImageUrl());

        paintingRepository.save(painting);
    }

    @Override
    public List<Painting> getAllPaintings() {
        return paintingRepository.findAll();
    }

    @Override
    public Painting getPaintingById(Long id) {
        return paintingRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePaintingById(Long id) {
        paintingRepository.deleteById(id);
    }

    @Override
    public void addTestPainting() {

    }
}
