# CRPT 
Task for CRTP Junior Java Developer position

## Task 1

### 1.Technologies

1. Maven
2. Java 14
3. Spring Boot 2.4.5 + Tomcat
4. MongoDB 4.4.3 Community
5. Mongock

### 2. Database
  
  1. purchase
  1.1 id
  1.2 seller
  1.3 customer
  1.5 products
  
  2. product
  2.1 id
  2.2 name
  
 ### 3.Functionality
 
 REST microservice using the Spring Framework, which will accept a single document of the form:
```{

"seller":"123534251",

"customer":"648563524",

"products":[{"name":"milk","code":"2364758363546"},{"name":"water","code":"3656352437590"}]

} 
```
All fields are required in this document. The seller/customer ID is a 9-character string, the product ID is a 13-character string.

### 4. Response
``` 200 {message: STRING} ``` 

---
## Task 2

Implement a thread-safe class containing the method `Future < V> compute(K k, Function<K, V> f)`, which returns the value of `Future<V>` by the key `K` in accordance with the given function `f` calculating the value of `V` for the key `K`.

If the value of `K` has already been encountered, then the value of `V` should not be calculated again, but should be taken from the cache.
