package org.example;

class PlasticFacadeFactory implements FacadeFactory {
  private static final double SOLID_PRICE_PER_SQUARE_METER = 200.0;
  private static final double GLASS_PRICE_PER_SQUARE_METER = 220.0;

  @Override
  public Facade createSolidFacade(double area) {
    return new SolidFacade(area, SOLID_PRICE_PER_SQUARE_METER);
  }

  @Override
  public Facade createGlassFacade(double area) {
    return new GlassFacade(area, GLASS_PRICE_PER_SQUARE_METER);
  }
}