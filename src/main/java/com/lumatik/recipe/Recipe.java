package com.lumatik.recipe;

import com.lumatik.core.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mgull on 6/17/2017.
 */
@Entity
public class Recipe extends BaseEntity {
//    private final int id;
    @NotNull
    @Size(min = 2, max = 140)
    private String name;
    private String description;
    private String genre;
//    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL) // Need to make these into classes
//    private List<String> ingredients;
//    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
//    private List<String> altIngredients;
//    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
//    private List<String> cookware;
//    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
//    private List<String> directions;
    private Rating rating;
    private Difficulty difficulty;
    private boolean isFavorite;
//    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
//    private List<String> pairWithOptions;
//    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
//    private List<String> notes;
    private String pictureUrl;
    private String videoUrl;
    private LocalDate createDate;
    private LocalDate lastMadeDate;
    private LocalDate updateDate;
//    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
//    private List<Review> reviews;

    protected Recipe() {
//        this.id = id;
        super();
//        this.name = "Recipe";
        this.difficulty = Difficulty.NONE;
        this.rating = Rating.NONE;
        this.createDate = LocalDate.now();
//        this.ingredients = new ArrayList<String>();
//        this.altIngredients = new ArrayList<>();
//        this.cookware = new ArrayList<>();
//        this.directions = new ArrayList<>();
//        this.pairWithOptions = new ArrayList<>();
//        this.notes = new ArrayList<>();
    }

    public Recipe(String name) {
        this();
        this.name = name;
    }

//    public Recipe(String name, List<String> ingredients, List<String> directions, LocalDate createDate) {
////        this.id = id;
//        this();
//        this.name = name;
//        this.ingredients = ingredients;
//        this.directions = directions;
//        this.createDate = createDate;
//    }

//    public int getId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

//    public List<String> getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(List<String> ingredients) {
//        this.ingredients = ingredients;
//    }
//
//    public List<String> getAltIngredients() {
//        return altIngredients;
//    }
//
//    public void setAltIngredients(List<String> altIngredients) {
//        this.altIngredients = altIngredients;
//    }
//
//    public List<String> getCookware() {
//        return cookware;
//    }
//
//    public void setCookware(List<String> cookware) {
//        this.cookware = cookware;
//    }
//
//    public List<String> getDirections() {
//        return directions;
//    }
//
//    public void setDirections(List<String> directions) {
//        this.directions = directions;
//    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

//    public List<String> getPairWithOptions() {
//        return pairWithOptions;
//    }
//
//    public void setPairWithOptions(List<String> pairWithOptions) {
//        this.pairWithOptions = pairWithOptions;
//    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getLastMadeDate() {
        return lastMadeDate;
    }

    public void setLastMadeDate(LocalDate lastMadeDate) {
        this.lastMadeDate = lastMadeDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

//    public void addIngredients(List<String> ingredients) {
////        recipe.setIngredients(this);
//        this.ingredients = ingredients;
//    }
//
//    public void addAltIngredients(List<String> altIngredients) {
//        this.altIngredients = altIngredients;
//    }
//
//    public void addCookware(List<String> cookware) {
//        this.cookware = cookware;
//    }
//
//    public void addDirections(List<String> directions) {
//        this.directions = directions;
//    }
//
//    public void addPairWithOptions(List<String> pairWithOptions) {
//        this.pairWithOptions = pairWithOptions;
//    }
//
//    public void addNotes(List<String> notes) {
//        this.notes = notes;
//    }

//    public void setUpdateDate(LocalDate updateDate) {
//        this.updateDate = updateDate;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Recipe recipe = (Recipe) o;
//
//        if (getId() != recipe.getId()) return false;
//        return getName().equals(recipe.getName());
//    }
//
//    @Override
//    public int hashCode() {
//        int result = getId();
//        result = 31 * result + getName().hashCode();
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "Recipe{" +
//                "name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", genre='" + genre + '\'' +
//                ", rating=" + String.valueOf(rating.getRating()) +
//                ", difficulty=" + String.valueOf(difficulty.getDifficulty()) +
//                ", createDate=" + createDate +
//                '}';
//    }
}
