# patika.dev - SQL Ödevi 12

>1-film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
>``` SQL
> SELECT COUNT(*) FROM film
> WHERE length > 
> (
> SELECT AVG(length) FROM film
> );
>```
> ![image](https://user-images.githubusercontent.com/57245919/131914059-007ca922-778c-44f9-81e6-5802c180d4ee.png)
>
>2- film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

>``` SQL
>
> SELECT COUNT(*) FROM film
> WHERE rental_rate = ANY -- it can be ALL
> (
> SELECT MAX(rental_rate) from film
> );
>```
> ![image](https://user-images.githubusercontent.com/57245919/131914715-f80fff1f-8824-46f0-a6de-0ff93356c359.png)
>
>3- film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.

> ``` SQL
>
> SELECT title, replacement_cost, rental_rate  FROM film
> WHERE replacement_cost = ANY -- it can be empty or ALL			
>(
>     SELECT MIN(replacement_cost) FROM film
>)
> AND rental_rate = ANY -- it can be empty or ALL
>(
>	  SELECT MIN(rental_rate) FROM film
>);
>```
> ![image](https://user-images.githubusercontent.com/57245919/131963889-d3f98b4e-efb4-428a-ae3e-a57f496e2dec.png)
>
>4-payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

> ``` SQL
> SELECT first_name, last_name, customer.customer_id, amount FROM customer INNER JOIN payment
> ON customer.customer_id = payment.customer_id
> WHERE amount = ALL
> (
>	 SELECT MAX(amount) FROM payment
> );
>
>```
> ![image](https://user-images.githubusercontent.com/57245919/131966355-8c74c63d-08db-4a34-8692-44591e29b810.png)
