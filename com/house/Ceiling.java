package com.house;

public class Ceiling {
    private int height;
    private String paintedColor;

    public Ceiling(int height, String string) {
        this.height = height;
        this.paintedColor = string;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPaintedColor() {
        return this.paintedColor;
    }

    public void setPaintedColor(String paintedColor) {
        this.paintedColor = paintedColor;
    }

}
