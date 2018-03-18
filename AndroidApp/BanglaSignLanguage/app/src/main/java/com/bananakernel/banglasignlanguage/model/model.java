package com.bananakernel.banglasignlanguage.model;

/**
 * Created by nbh on 3/17/2018.
 */

public class model {

    private int itemImage;

    private String itemTitle;

    public model(int itemImage, String itemTitle) {
        this.itemImage = itemImage;
        this.itemTitle = itemTitle;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }
}
