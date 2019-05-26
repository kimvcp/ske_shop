# SKE Shop

SKE shop is a ordering system for a product shop which user can order the product and checkout to see the receipt.
Moreover, it provide a tax calculator which calculate differently depending on the location of shop.

## Design Pattern

#### Singleton design pattern
The application can only contain one product catalog for ordering.
   
#### Strategy design pattern
Tax calculator can have many strategies for calculating tax.

#### Iterator design pattern
The application requires to maintain different type of collections.

## Model-View-Controller
An architectural pattern commonly used for developing user interfaces that divides an application into three interconnected parts

#### Model
Responsible for managing the data of the application

Product Catalog stores product object.
OrderItem is a product with quantity.
Order store a OrderItem.

#### View
Presentation of the model in a particular format.



#### Controller
Responds to the user input and performs interactions on the data model objects.

## UML Diagram




