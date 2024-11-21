package org.example;

public class Main {
  public static void main(String[] args) {
    // Вибір фабрики для плівкових фасадів
    FacadeFactory facadeFactory = new FilmFacadeFactory();

    // Створюємо нове замовлення
    Order order = new Order();

    // Додаємо фасади до замовлення
    order.addFacade(facadeFactory.createSolidFacade(2.5));  // Суцільний фасад площею 2.5 кв.м.
    order.addFacade(facadeFactory.createGlassFacade(1.5));  // Фасад-вітрина площею 1.5 кв.м.

    // Виводимо деталі замовлення
    order.printOrderDetails();

    // Виводимо загальну вартість замовлення
    System.out.println("Загальна вартість замовлення: " + order.calculateTotalPrice() + " грн.");
  }
}
