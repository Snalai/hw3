package org.example.work2;

public interface s {
    String Square = "Площадь";
    String Perimeter = "Периметр";

    int add(int width, int height);

    default int calculateArea(int width, int height) {
        return width - height;
    }
    default int calculatePerimeter(int width, int height) {
        return width - height;
    }
}
