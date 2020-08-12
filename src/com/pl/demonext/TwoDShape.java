package com.pl.demonext;

class TwoDShape {
    private double height;
    private double width;

    TwoDShape(){
        width = height = 0.0;
    }

    TwoDShape(double height, double width){
        this.height = height;
        this.width = width;
    }

    TwoDShape(double x){
        width = height = x;
    }

    double getHeight(){
        return height;
    }

    void setHeight(double height){
        this.height = height;
    }

    double getWidth(){
        return width;
    }

    void setWidth(double width){
        this.width = width;
    }

    void showDim(){
        System.out.println("Height + width: " + height + " and " + width);
    }
}

class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "indefinite";
    }

    Triangle(String s, double w, double h) {
        super(w, h);
        this.style = s;
    }

    Triangle(double x) {
        super(x);

        style = "full";
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is: " + style);
    }
}
class ColorTriangle extends Triangle{
        private String color;

        ColorTriangle(String c, String s, double h, double w){
            super(s, h, w);
            this.color = c;
        }

        String getColor(){
            return color;
        }
        void showColor(){
            System.out.println("Color: " + color);
        }
}

class Shapes6 {
    public static void main(String[] args) {
        ColorTriangle colorTriangle1 = new ColorTriangle("blue", "empty", 8.0, 12.0);
        ColorTriangle colorTriangle2 = new ColorTriangle("red", "full", 4.0, 2.0);

        System.out.println("Description colortrinagle1: ");
        colorTriangle1.showColor();
        //colorTriangle1.getColor();
        colorTriangle1.showStyle();
        colorTriangle1.showDim();
        System.out.println("Area equals: " + colorTriangle1.area());

        System.out.println();

        System.out.println("Descrption colortriangle2: ");
        colorTriangle2.showColor();
        //colorTriangle2.getColor();
        colorTriangle2.showStyle();
        colorTriangle2.showDim();
        System.out.println("Area equals: " + colorTriangle2.area());

    }

}