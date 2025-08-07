package com.paintingscollectors.model.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @NotNull
    @Column(unique = true, nullable = false)
    private String username;

    @NotNull
    @Column(nullable = false)
    private String password;

    @NotNull
    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Painting> paintings = new HashSet<>();

    @ManyToMany(mappedBy = "favoritedBy", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Painting> favoritePaintings = new HashSet<>();

    @ManyToMany(mappedBy = "ratedBy", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Painting> ratedPaintings = new HashSet<>();

    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Painting> getPaintings() {
        return paintings;
    }

    public void setPaintings(Set<Painting> paintings) {
        this.paintings = paintings;
    }

    public Set<Painting> getFavoritePaintings() {
        return favoritePaintings;
    }

    public void setFavoritePaintings(Set<Painting> favoritePaintings) {
        this.favoritePaintings = favoritePaintings;
    }

    public Set<Painting> getRatedPaintings() {
        return ratedPaintings;
    }

    public void setRatedPaintings(Set<Painting> ratedPaintings) {
        this.ratedPaintings = ratedPaintings;
    }
}


