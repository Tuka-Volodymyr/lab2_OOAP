package org.example;

class FilmFacadeFactory implements FacadeFactory {
  private static final double SOLID_PRICE_PER_SQUARE_METER = 100.0;
  private static final double GLASS_PRICE_PER_SQUARE_METER = 120.0;

  @Override
  public Facade createSolidFacade(double area) {
    return new SolidFacade(area, SOLID_PRICE_PER_SQUARE_METER);
  }

  @Override
  public Facade createGlassFacade(double area) {
    return new GlassFacade(area, GLASS_PRICE_PER_SQUARE_METER);
  }
}