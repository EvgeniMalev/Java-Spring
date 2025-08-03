package com.paintingscollectors.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "styles")
public class Style extends BaseEntity {

    @NotNull
    @Column(unique = true, nullable = false)
    private String styleName;

    @NotNull
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    public Style() {
    }

    public Style(String styleName, String description) {
        this.styleName = styleName;
        this.description = description;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

