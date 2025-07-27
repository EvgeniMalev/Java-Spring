package com.paintingscollectors.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "paintings")
public class Painting extends BaseEntity {

    @NotNull
    @Size(min = 5, max = 40)
    @Column(nullable = false, length = 40)
    private String name;

    @NotNull
    @Size(min = 5, max = 30)
    @Column(nullable = false, length = 30)
    private String author;

    @NotNull
    @Column(nullable = false)
    private String imageUrl;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "style_id", nullable = false)
    private Style style;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @Column(nullable = false)
    private boolean isFavorite;

    @Column(nullable = false)
    private int votes;

    public Painting() {
    }

    public Painting(String name, String author, String imageUrl, Style style, User owner, boolean isFavorite, int votes) {
        this.name = name;
        this.author = author;
        this.imageUrl = imageUrl;
        this.style = style;
        this.owner = owner;
        this.isFavorite = isFavorite;
        this.votes = votes;
    }

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

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}



