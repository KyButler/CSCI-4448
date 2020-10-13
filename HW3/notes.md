At present there is only one location, but eventually there will be several others.  
✅ - allows for multiple locations

The store has a catalog of five different specialty foods it sells: spring rolls, egg rolls, pastry rolls, sausage rolls, and jelly rolls.  
✅ - rolls accounted for

The store begins the first day with the inventory to make 30 of each type of roll.  
✅ - inventory initialized with 30 of each

Whenever a store makes the last of a given type of roll, that roll may no longer be sold that day.  

If all roll inventory runs out, the store will close for that day, and a notice of closure for no inventory should be raised.  

When the store sells the last of a given type of roll, an inventory out notice will be raised, and the next day, 30 more rolls of that type will be added to the production capacity.  

Note that inventory is only set back to 30 the next day if the inventory ran completely out the prior day.  
✅ - restocks to the original count at the end of thday

You should decide the cost of each roll (each should be different).  
✅ - done

Whenever a customer buys a roll, they may optionally ask for extra sauce, extra filling, or extra topping.

Each of these options has a different cost for each different roll type (you can decide the cost of each). 

You do not need to maintain a capacity or inventory of these extras.

Customers will arrive randomly every day in random order.

There are three types of customers: casual, business, and catering.

Casual customers will buy 1 to 3 rolls (type determined randomly).

Business customers will buy 10 rolls, two of each type. 

Catering customers will buy 5 rolls of 3 different types (15 total, type determined randomly).

A total of 1 to 12 casual customers, 1 to 3 business customers, and 1 to 3 catering customers will arrive each day.

If the store closes at any point during the day due to no roll inventory, any customers that would have arrived after that point will not go to the store.  
➖ handled but could be better

For every individual roll ordered by any customer type, there is a chance of adding 0 to 3 extra sauces, 0 to 1 extra fillings, and 0 to 2 extra toppings.

The cost of these extras should be added to the roll order total cost.

Responses to roll outages by customers will be different.  

A casual customer will try to select a different roll type to make up their 1 to 3 roll order if the initial one they select is out for the day.  

A casual customer will take any number of available rolls (if they wanted 3, but only 2 were available, they will take them).  

A business customer will only take their order if it is filled exactly as requested, otherwise, they will not make a purchase.  

A catering customer will take any number of available rolls of any available types up to a total of 15, if their original order cannot be placed.  

If the store is open, and the original order is not filled in any way, this should be counted for the day by customer type (e.g. 2 casual customers and 1 business customer did not fill their original orders on day 4 due to roll outages).

The store will maintain sales data, inventory levels, costs of orders, and special events for daily display and summary statistics.