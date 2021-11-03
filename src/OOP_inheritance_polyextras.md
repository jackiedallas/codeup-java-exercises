# Classes and Objects

1. Play the card game of “War”

    Make it two player. You can have Player vs. computer or computer1 vs.
    computer2

    Make a new package called `card-games`, inside of the package, make the
    following classes:

    - Make a player class called Player.java. It should have a `gamesWon` field
      for the number of games won and a `name` property that is set with the
      contructor

    - Make a card class inside Card.java that has suit and value

    - Make a file called CardsArray.java. (Like the MoviesArray.java) It should
      have 52 different lines creating playing card objects. The array of
      objects should be returned by calling a method called .getAllCards()

    - Make a class called GameOfWar.java. The game should play 26 rounds, sum up
      each won game for each player.  Then output the winning player.

1. Make a new package called bookstore. Inside it:

    - make a Person superclass w/ name property, set name w/ constructor
    - Make a Customer subclass that inherits from person
    - Make an Author subclass that inherits from person, add a counter for the
      number of books written
    - Create a Product class w/ title and price and constructor that sets those
      properties
    - Create a Book class that inherits from product and ads an author property
    - Book class’s author property should hold an Author typed object
    - Make a class called BookStore.java that has your main method and the code
      that runs.
    - Make 3 authors
    - Make 5 books
    - Create 8 customers, store them in an array, have each customer buy a book
      or two

1. Make a package called company.

    - In it, add a superclass called Product. Then make subclasses for Shoe,
      Subscription, Car, and a few others.
    - Each subclass's constructor should call super() w/ parameters and extend
      the constructor functionality.
    - Each subclass should overwrite the getName() method so they produce the
      specifics.
    - Specs should match [the code found here](https://github.com/CodeupClassroom/ulysses-java-exercises/tree/master/src/company)

---

## Short Assignment #1

Create a class called "RestaurantDish" (you should not include quotes)

Include an integer property called "costInCents"
Include a string property called "nameOfDish"
Include a boolean property called "wouldRecommend"
Include a method called "eat" this method will print out "Nom nom nom!"

Create another class called RestaurantTest Add a main method and inside the method...

1) instantiate a RestaurantDish object called "dish"
2) assign values creative to each of the properties
3) print out each of the property values
4) test the eat() method by calling it

## Short Assignment #2 (part 1)

Create a class of static properties and methods called BurgerTools

- Include a string property of `mostPopularTopping`
- Include an int property of `averageDaysBeforeExpiration`
- Include an int property of `temperatureWhenCooked`
- Include a void method called `grill()` that prints out "Grilling burger"

Create a class called `BurgerTester` to test assigning and printing property
values and testing methods.

If you have time, add additional properties and methods.

## Short Assignment #2 (part 2)

Refactor your `RestaurantDish` and `RestaurantTest` classes...

1. Change your public properties in your `RestaurantDish` class to private
1. Add getters and setters for these properties (use IntelliJ to do this quickly)
1. Refactor code used in `RestaurantTest` to use your getters and setters to set
   and print these values
1. Add a constructor method to `RestaurantDish` that will assign property values
   based on arguments passed into the constructor

Inheritance and Polymorphism Bonus

Create a class of Animal

    add the following fields:
        private int numberOfLegs
        private String prefferedClimate
        public String getAnimalInfo(): a method that returns a message with number of legs and preferrered climate info
    add getters and setters
    add a constructor that sets all properties

Create a class of Dog, Fish, Cat that extends Animal

    add additional private properties that are unique to each specific animal type and getters and setters for these properties
    overload the getAnimalInfo() to invoke the parent getAnimalInfo() method and return extra info on all the additional properties for the specific animal type
    add a constructor that invokes the parent constructor and sets new properties

Create a class AnimalTester with a method public static void displayAnimalDetails(Animal a) that prints what is returned from calling the getAnimalInfo() method for a given animal object

    this method should take in any Animal object but test it in the main method with instantiated Dog, Fish, Cat objects of type Animal.

