package com.christopherlicata.giflib.repository;

import com.christopherlicata.giflib.model.Gif;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * The Gif Repository class which will be used to connect to a database and feed gifs through the Gif Model and,
 * eventually, to our dynamic web page.
 * <p>
 * Created by ChristopherLicata on 2/8/16.
 * <p>
 * @author ChristopherLicata
 * @version 1.0
 */
@Repository
public class GifRepository
{
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2015, 2, 13), "Chris Ramacciotti", false),
            new Gif("ben-and-mike", LocalDate.of(2015, 10, 30), "Ben Jakuben", true),
            new Gif("book-dominos", LocalDate.of(2015, 9, 15), "Craig Dennis", false),
            new Gif("compiler-bot", LocalDate.of(2015, 2, 13), "Ada Lovelace", true),
            new Gif("cowboy-coder", LocalDate.of(2015, 2, 13), "Grace Hopper", false),
            new Gif("infinite-andrew", LocalDate.of(2015, 8, 23), "Marissa Mayer", true)
    );


    public Gif findByName(String name)
    {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }


    public List<Gif> getAllGifs()
    {
        return ALL_GIFS;
    }
}
