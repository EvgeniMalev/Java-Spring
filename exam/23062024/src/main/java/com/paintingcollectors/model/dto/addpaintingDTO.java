package com.paintingscollectors.model.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddPaintingDTO {

    @NotNull
    @Size(min = 5, max = 40, message = "Name length must be between 2 and 40 characters!")
    private String name;

    @NotNull
    @Size(min = 5, max = 30, message = "author length must be between 2 and 30 characters!")
    private String author;

    @NotNull
    private String imageUrl;

    @NotNull
    private String style;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
