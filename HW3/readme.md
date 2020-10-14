## Program Title - Specialty Food Business Simulator

## Team Members
- Kyran Butler
- Connor Ely

## Special Instructions to Run Code
- Have Java installed and runnable
- If in VS Code, simply click "run" above main in Main.java
- else, run the program however you would run any other java program
- To run the tests, you must have JUnit installed. We use JUnit 5. Run like normal.

## Language and Environment used
- Java 1.8.0_261
- VS Code with Java Extensions

## Text Descriptions
### Assumptions
- If a user asks for an order that can't be fullfilled, log this event. However, any subsequent un-fullfillable orders from the same user, do not log the event. In scenarios where a Casual customer may ask for multiple types of rolls, this could get annyoing for the log, and isn't neccessary since the project guidelines do not say so.

### About the Program
- First off, the OO patterns used:
  - Factory pattern creates the customers that handle their orders.
  - Observer pattern is alerted when certain notifyable events occur, such as the store having to close due to no stock, or when a certain roll is out of stock.
  - Decorator pattern is used to 'add' extras, from sauce to filling to toppings.
- Next off, description of the program.

- Essentially, a day is handled by the DayRunner. All of the events that occur occur because of this DayRunner. It creates a list of customers that are to visit the business on a specific day, it puts things into action, etc.

- A customer asks for an order. If the order can be fullfilled based on the current inventory as requested, it fulfills it and returns the items that were successfully filled. The customer can then decide what to do with this information
  - If a casual customer recieves a 'fullfulled' array that isn't long enough, they'll accept however many items were in the list since they're supposed to
  - If a business customer recieves a fullfilled array that isn't the same as their original array, they will fail to order.
  - If a catering customer recieves a fullfulled array that isn't the same as their original array, they will ask the Store for help picking out up to 15 (preferring higher numbers) rolls, since trying to guess themselves would take a long time.

- The inventory is simple, it increments as needed. When an order is recieved, the inventory will see if it has enough by subtracting the items that are consumed. If it does have enough of each item, then the inventory will stay with the subtracted items, else it will add back the items (since it was just being used to see if it had enough in the first place)

- Decorators add extras that increase the base price of the roll. That's basically it.

- Logging is done to track every transaction, including every roll and topping. If you see [rollname, topping, sauce], that means a roll with the name of rollname happened to have a topping and a sauce. This was the cleanest way we could think of displaying this information.

- Tests are simple, we had a hard time setting up JUnit in the first place. However, they do test key parts, like making sure the factory and decorators work.

- Right now the program is set to run for 30 days, but can be changed easily (we commented out the alternate lines)