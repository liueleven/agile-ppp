package com.agile.dev.code.chapter11.lsp;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-24 12:20
 * @author: 十一
 */
public class Square extends Rectangle{

    @Override
    public void setWidth(double w) {
        super.setWidth(w);
    }

    @Override
    public void setHeight(double h) {
        super.setHeight(h);
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.setHeight(1);
        s.setWidth(1);
        System.out.println(s.getHeight());
        System.out.println(s.getWidth());
    }
}
