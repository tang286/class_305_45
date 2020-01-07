package com.ii.shooldemo.student;

public class student {
    private String name;
    private int imageId;
    private String uuid;
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public student(String name, int imageId, String uuid,String type) {
        this.name = name;
        this.imageId = imageId;
        this.uuid = uuid;
        this.type = type;
    }
    public student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }




    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
