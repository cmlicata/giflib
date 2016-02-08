package com.christopherlicata.giflib.controller;

import com.christopherlicata.giflib.model.Gif;
import com.christopherlicata.giflib.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Controller that handles HTTP requests related to Gifs.
 * <p/>
 * The methods in this class will handle any page of our application that displays a list of gifs or a single gif.
 * <p/>
 * Created by ChristopherLicata on 2/5/16.
 *
 * @author ChristopherLicata <cmlpolyglotdev@gmail.com>
 * @version 1.0
 */
@Controller
public class GifController
{
    @Autowired
    private GifRepository gifRepository;


    /**
     * This method will handle requests to our application root or homepage.
     */
    @RequestMapping("/")
    public String listGifs(ModelMap modelMap)
    {
      /*
        The Thymeleaf view resolver only needs the name of the file (without extension)
        that is located in the templates subdirectory of resources in order to return this
        html page.
        */
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }


    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap)
    {
        Gif gif = gifRepository.findByName(name);
        // No need to return this because Spring will make this available to the templating engine
        modelMap.put("gif", gif);
        return "gif-details";
    }

}
