1 -- clientes city id 312
SELECT city.city_id, address.address, customer.first_name, customer.last_name, customer.email 
FROM customer
JOIN address ON customer.address_id = address.address_id
JOIN city ON address.city_id = city.city_id
WHERE city.city_id = 312;

2 -- Todas las peliculas de comedia
SELECT film.title, film.description, film.release_year, film.rental_rate, film.special_features, category.name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.category_id = 5;

3 -- todas las peliculas del actor id=5 
SELECT actor.actor_id, actor.first_name, actor.last_name, film.title, film.description, film.release_year
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE actor.actor_id = 5;

4 -- todos los clientes con store_id = 1 y con city = 1, 42, 312, 459
SELECT customer.first_name, customer.last_name, customer.email, address.address, address.city_id, customer.store_id
FROM customer
JOIN address ON customer.address_id = address.address_id
WHERE customer.store_id = 1
AND (address.city_id = 1
OR address.city_id = 42
OR address.city_id = 312
OR address.city_id = 459);

5 -- Todas las peliculas calificadas con g y specialfeture = behind the scenes con actor_id=15
SELECT film.title, film.description, film.release_year, film.rating, film.special_features
FROM film
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE film.rating = "G"
AND actor.actor_id = 15
AND film.special_features LIKE "%Behind%"

6 -- todos los actores del film = 369
SELECT film.film_id, film.title, actor.actor_id, CONCAT_WS (" ", actor.first_name, actor.last_name) AS "name"
FROM film
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE film.film_id = 369;

7 -- peliculas dramaticas con tarifa 2.99 
SELECT film.title, film.description, film.release_year, film.rating, film.special_features, category.name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.category_id = 7
AND film.rental_rate = 2.99

8 -- todas las peliculas Accion actor SANDRA KILMER
SELECT film.title, film.description, film.release_year, film.rating, film.special_features, 
category.name, actor.first_name, actor.last_name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id  
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE category.category_id = 1
AND (actor.first_name = "SANDRA"
and actor.last_name = "KILMER");
