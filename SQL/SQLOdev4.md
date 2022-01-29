# patika.dev - SQL ÖDEVİ 4

1- film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.

```SQL
SELECT DISTINCT replacement_cost FROM film;
```

![ss13](../SS/ss13.png)

<br />

2- film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?

```SQL
SELECT COUNT(DISTINCT replacement_cost) FROM film;

Sonuç: 21
```

![ss14](../SS/SS14.png)

<br/>


3-film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?


```SQL
SELECT COUNT(*) FROM film 
WHERE title LIKE 'T%' AND rating = 'G';

Sonuç: 9
```

![ss15](../SS/SS15.png)

<br />

4- country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?

```SQL
SELECT COUNT(*) FROM country WHERE country LIKE '_____';

Sonuç: 5
```

![ss16](../SS/SS16.png)

<br />

5- city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?

```SQL
SELECT Count(*) FROM city WHERE city ILIKE '%R';
```

![SS17](../SS/SS17.png)

---

