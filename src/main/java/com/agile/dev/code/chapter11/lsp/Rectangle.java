package com.agile.dev.code.chapter11.lsp;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-24 11:59
 * @author: 十一
 */
public class Rectangle {

    private Point itsTopLeft;

    private double itsWidth;

    private double itsHeight;

    public void setWidth(double w) {
        itsWidth = w;
    }

    public void setHeight(double h) {
        itsHeight = h;
    }

    public double getWidth() {
        return itsWidth;
    }

    public double getHeight() {
        return itsHeight;
    }
}
