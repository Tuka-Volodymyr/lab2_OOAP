package org.example;

import java.util.ArrayList;
import java.util.List;

// Клас для замовлення
class Order {
  private List<Facade> facades = new ArrayList<>();  // Список фасадів у замовленні

  // Додаємо фасад до замовлення
  public void addFacade(Facade facade) {
    facades.add(facade);
  }

  // Обчислюємо загальну вартість замовлення
  public double calculateTotalPrice() {
    double total = 0;
    for (Facade facade : facades) {
      total += facade.calculatePrice();
    }
    return total;
  }

  // Виводимо інформацію про всі фасади в замовленні
  public void printOrderDetails() {
    for (Facade facade : facades) {
      facade.printInfo();
    }
  }
}
