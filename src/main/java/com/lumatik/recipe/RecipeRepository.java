package com.lumatik.recipe;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by mgull on 6/17/2017.
 */
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Long> {

    @RestResource(rel = "name-contains", path = "containsName") // alters URL
    Page<Recipe> findByNameContaining(@Param("name") String name, Pageable page);
    // example: http://localhost:8080/courses/search/findByNameContaining?name=Pizza&size=5
    // http://localhost:8080/courses/search/findByNameContaining?name=Pizza&page=4&size=5

}
