package com.christopherlicata.giflib.model;

/**
 * The Category data model class that will be used to organize .gif files in GifLib.
 * <p/>
 * Created by ChristopherLicata on 2/8/16.
 * <p/>
 *
 * @author ChristopherLicata <cmlpolyglotdev@gmail.com>
 * @version 1.0
 */
public class Category
{
    private int id;

    private String name;


    public Category(int id, String name)
    {
        this.id = id;
        this.name = name;
    }


    public int getId()
    {
        return id;
    }


    public void setId(int id)
    {
        this.id = id;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }

}
