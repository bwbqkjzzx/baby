package com.example.a.listviewexample3_3;

/**
 * Created by A on 2019/11/5.
 */

public class Baby {
    private  String title;
    private String name;
    private int imageID;
    public Baby( String title,String name,int imageID){
        this.title = title;
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){
        return name;
    }
    public String getTitle(){
        return title;
    }
    public int getImageID(){

        return imageID;
    }
}
