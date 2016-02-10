package com.christopherlicata.giflib.controller;

import com.christopherlicata.giflib.model.Category;
import com.christopherlicata.giflib.model.Gif;
import com.christopherlicata.giflib.repository.CategoryRepository;
import com.christopherlicata.giflib.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Controller that handles HTTP requests related to Category.
 * <p/>
 * The methods in this class will handle any page of our application that displays a list of category or gifs of a
 * single category.
 * <p/>
 * Created by ChristopherLicata on 2/5/16.
 *
 * @author ChristopherLicata <cmlpolyglotdev@gmail.com>
 * @version 1.0
 */
@Controller
public class CategoryController
{
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;


    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap)
    {
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";
    }


    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap)
    {
        Category category = categoryRepository.findById(id);
        modelMap.put("category", category);

        List<Gif> gifs = gifRepository.findByCategoryId(id);
        modelMap.put("gifs", gifs);

        return "category";
    }

}
