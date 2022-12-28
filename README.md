
**A Java application that collects and analyses data from log files of an e-commerce site.**

The program processes the following entries: 
  
1. StartEntry: records the sessionID and the customerID. This entry refers to the first interaction between the customer and the website.   
2. ViewEntry: records the sessionID, the productID. This entry refers to the first interaction between the customer (identified by the sessionID) and a specific product.  
3. BuyEntry: records the sessionID, the productID, the product price and the quantity purchased. This entry gives the transaction details of a purchase of a product made by the customer.  
4. EndEntry: records the sessionID. This entry signals the end of interaction between the customer and the website.

Various statistics were computed on the collected data such as:

1. SessionPriceDifference: This statistic allows the website admin to see the price difference between the first time a customer sees a product on a website and the first time the customer actually makes the purchase.   
2. AverageViewsWithoutPurchase: This statistic allows the website admin to see an average of how many times a product was seen by customers without purchasing it.  
3. CustomerItemViewsForPurchaseNumber: This statistic allows the website admin to see the number of views for a purchased product by a specific customer.
  
The application then populates a data structure and displays all the results in a table enabling the admin to read it easily. 
