package com.christopherlicata.giflib.repository;

import com.christopherlicata.giflib.model.Category;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * The Gif Repository class which will be used to connect to a database and feed gif categories through the Category
 * Model and, eventually, to our dynamic web page.
 * <p/>
 * Created by ChristopherLicata on 2/8/16.
 * <p/>
 *
 * @author ChristopherLicata
 * @version 1.0
 */
@Repository
public class CategoryRepository
{
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Technology"),
            new Category(2, "People"),
            new Category(3, "Destruction")
    );


    public List<Category> getAllCategories()
    {
        return ALL_CATEGORIES;
    }


    public Category findById(int id)
    {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

}
