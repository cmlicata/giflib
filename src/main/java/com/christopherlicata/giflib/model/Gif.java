package com.christopherlicata.giflib.model;

import java.time.LocalDate;

/**
 * The Gif data model class that will be used to store, update, remove, and display .gif files in GifLib.
 * <p/>
 * Created by ChristopherLicata on 2/8/16.
 * <p/>
 *
 * @author ChristopherLicata <cmlpolyglotdev@gmail.com></cmlpolyglotdev@gmail.com>
 * @version 1.0
 */
public class Gif
{
    private String name;

    private LocalDate dateUploaded;

    private String username;

    private boolean favorite;


    public Gif(String name, LocalDate dateUploaded, String username, boolean favorite)
    {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public LocalDate getDateUploaded()
    {
        return dateUploaded;
    }


    public void setDateUploaded(LocalDate dateUploaded)
    {
        this.dateUploaded = dateUploaded;
    }


    public String getUsername()
    {
        return username;
    }


    public void setUsername(String username)
    {
        this.username = username;
    }


    public boolean isFavorite()
    {
        return favorite;
    }


    public void setFavorite(boolean favorite)
    {
        this.favorite = favorite;
    }
}
