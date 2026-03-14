
# E‑Commerce System Documentation

## Concepts Used
- Inheritance
- Polymorphism
- Abstract Classes
- Package Organization

## Packages
com.ecommerce.products  
com.ecommerce.cart  
com.ecommerce.orders  

## Class Diagram

Product (Abstract)
 ├── ElectronicsProduct
 ├── ClothingProduct
 └── BookProduct

ShoppingCart
 └── CartItem

Order

Main → controls program flow

## Workflow
1. User views products
2. Adds items to cart
3. Cart calculates total
4. Order generates invoice with GST
