package org.example.work2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4) {
            @Override
            public int add(int width, int height) {
                return 0;
            }
        };
        System.out.println(s.Square + " = "+ rectangle.calculateArea(rectangle.getWidth(), rectangle.getHeight()));
        System.out.println(s.Perimeter + " = "+ rectangle.calculatePerimeter(rectangle.getWidth(), rectangle.getHeight()));

    }
}
