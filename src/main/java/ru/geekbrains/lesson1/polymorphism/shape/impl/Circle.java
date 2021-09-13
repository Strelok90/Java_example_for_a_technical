package ru.geekbrains.lesson1.polymorphism.shape.impl;

import ru.geekbrains.lesson1.polymorphism.shape.Drawable;
import ru.geekbrains.lesson1.polymorphism.shape.Shape;

// Круг
public class Circle extends Shape implements Drawable {

  private int radius;

  @Override
  public void draw() {
    System.out.println("Рисуем круг");
  }

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius,2);
  }
}
