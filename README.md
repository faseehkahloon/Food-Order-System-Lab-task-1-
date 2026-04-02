# 🍔 Food Order System (OOP - Java)

## 📌 Project Overview

This project is a **Food Ordering System** developed in Java using **Object-Oriented Programming (OOP)** concepts.
It simulates different types of restaurant orders including:

* Dine-In Orders
* Takeaway Orders
* Delivery Orders

Each order type calculates its bill differently and follows a unique processing mechanism.

---

## 🎯 Objectives

The main goal of this project is to demonstrate core OOP concepts such as:

* Abstraction
* Inheritance
* Polymorphism
* Encapsulation
* Constructor Chaining
* Method Overriding
* Upcasting & Downcasting

---

## 🧱 Class Structure

### 🔷 Abstract Class: `FoodOrder`

* Represents a general food order
* Contains common attributes:

  * `orderId`
  * `amount`
* Includes:

  * **Abstract Methods**

    * `calculateBill()`
    * `processOrder()`
  * **Concrete Methods**

    * `applyDiscount()`
    * `showInfo()`
  * **Final Method**

    * `displayType()`

---

### 🍽️ Child Class: `DineInOrder`

* Adds:

  * `tableNumber`
* Features:

  * Service charges added to bill
  * Table-specific processing

---

### 🥡 Child Class: `TakeAwayOrder`

* Adds:

  * `packagingType`
* Features:

  * Packaging fee included in bill

---

### 🚚 Child Class: `DeliveryOrder`

* Adds:

  * `address`
* Features:

  * Delivery charges applied
  * Discount logic implemented

---

## 🔁 Key OOP Features Implemented

### ✅ Inheritance

All child classes extend the abstract class `FoodOrder`.

### ✅ Method Overriding

Each child class provides its own implementation of:

* `calculateBill()`
* `processOrder()`

### ✅ Constructor Chaining

Child constructors use:

```java
super(orderId, amount);
```

### ✅ Encapsulation

* Private variables in child classes
* Getter and Setter methods implemented

### ✅ Polymorphism

```java
FoodOrder obj = new DineInOrder(...);
```

### ✅ Upcasting & Downcasting

```java
if(obj instanceof DineInOrder){
    ((DineInOrder)obj).setTableNumber(10);
}
```

### ✅ Array of Parent References

```java
FoodOrder[] orders = {o1, o2, o3};
```

---

## 🔄 Program Flow

1. Create objects of different order types
2. Store them in an array of `FoodOrder`
3. Display initial details
4. Modify properties using loops and `instanceof`
5. Apply discount conditionally
6. Display updated details and final bill

---

## 📊 Sample Output

```
DineInOrder [ID:1, Amount:3000.0, Table:5]
TakeAwayOrder [ID:2, Amount:800.0, Packaging Type:Box]
DeliveryOrder [ID:3, Amount:2500.0, Address:Johar Town]

After Modification :

DineInOrder [ID:1, Amount:3000.0, Table:10]
Final Bill : 3300.0

TakeAwayOrder [ID:2, Amount:800.0, Packaging Type:Box]
Final Bill : 850.0

DeliveryOrder [ID:3, Amount:2250.0, Address:Johar Town]
Final Bill : 2350.0
```

---

## 🛠️ Technologies Used

* Java
* IntelliJ IDEA

---

## 📌 UML Class Diagram

The UML diagram for this project was generated using **IntelliJ IDEA** and shows:

* Abstract class
* Inheritance relationships
* Attributes and methods

---

## 🚀 How to Run

1. Open project in IntelliJ IDEA
2. Compile all `.java` files
3. Run `Main.java`

---

## 📚 Conclusion

This project successfully demonstrates real-world implementation of OOP principles in Java by modeling a food ordering system with multiple order types and dynamic behavior.

---

**F Kah**
