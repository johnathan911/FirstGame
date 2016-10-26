package com.example.joh.firstgame;

import android.graphics.Rect;

/**
 * Created by joh on 10/26/16.
 */

public abstract class GameObject {
    protected int x;
    protected int y;
    protected int dx;
    protected int dy;
    protected int width;
    protected int height;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public Rect getRectangle(){
        return new Rect(x, y, x+width, y+height);
    }


}
