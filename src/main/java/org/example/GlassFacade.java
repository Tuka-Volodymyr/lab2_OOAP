package org.example;

class GlassFacade implements Facade {
  private double area;
  private double pricePerSquareMeter;

  public GlassFacade(double area, double pricePerSquareMeter) {
    this.area = area;
    this.pricePerSquareMeter = pricePerSquareMeter;
  }

  @Override
  public double calculatePrice() {
    return area * pricePerSquareMeter;
  }

  @Override
  public void printInfo() {
    System.out.println("Фасад-вітрина. Розмір: " + area + " кв.м.");
  }
}