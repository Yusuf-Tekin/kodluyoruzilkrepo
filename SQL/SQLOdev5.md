# patika.dev - SQL ÖDEVİ 5

1- film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi sıralayınız.

```SQL
SELECT * FROM film WHERE title LIKE '%n' ORDER BY length DESC LIMIT 5;
```

![SS18](../SS/SS18.png)

2- film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en kısa (length) ikinci(6,7,8,9,10) 5 filmi(6,7,8,9,10) sıralayınız.

```SQL
SELECT * FROM film WHERE title LIKE '%n' ORDER BY length ASC OFFSET 5 LIMIT 5;
```

![SS19](../SS/SS19.png)

3- customer tablosunda bulunan last_name sütununa göre azalan yapılan sıralamada store_id 1 olmak koşuluyla ilk 4 veriyi sıralayınız.

```SQL
SELECT * FROM customer WHERE store_id = 1 ORDER BY last_name DESC LIMIT 4;
```

![SS20](../SS/SS20.png)

---