package org.example;

interface FacadeFactory {
  Facade createSolidFacade(double area);  // Створює суцільний фасад
  Facade createGlassFacade(double area);  // Створює вітрину
}
