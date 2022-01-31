# patika.dev - SQL Ödevi 10


1- city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.

```SQL
SELECT city,country FROM city 
LEFT JOIN country 
ON city.country_id = country.country_id;
```

![SS36](../SS/SS36.png)

2-customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.

```SQL
SELECT payment_id,first_name,last_name 
FROM payment RIGHT JOIN customer ,
ON payment.customer_id = customer.customer_id;
```


![SS37](../SS/SS37.png)


3- customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.

```SQL
SELECT rental_id,first_name,last_name 
FROM rental FULL JOIN customer 
ON rental.customer_id = customer.customer_id;
```

![SS38](../SS/SS38.png)
