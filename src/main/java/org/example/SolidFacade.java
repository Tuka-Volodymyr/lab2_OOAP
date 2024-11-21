package org.example;

class SolidFacade implements Facade {
  private double area;
  private double pricePerSquareMeter;

  public SolidFacade(double area, double pricePerSquareMeter) {
    this.area = area;
    this.pricePerSquareMeter = pricePerSquareMeter;
  }

  @Override
  public double calculatePrice() {
    return area * pricePerSquareMeter;
  }

  @Override
  public void printInfo() {
    System.out.println("Суцільний фасад. Розмір: " + area + " кв.м.");
  }
}
