1 -- Consulta eslovaco
SELECT countries.name, languages.`language`, languages.percentage
FROM countries
JOIN languages ON countries.id = languages.country_id
WHERE languages.`language` = "Slovene"

2 -- consulta numero total ciudades pais
SELECT countries.name, COUNT(cities.id)
FROM countries
JOIN cities ON countries.id = cities.country_id
GROUP BY countries.id 
ORDER BY COUNT(cities.id) DESC

3 -- ciudades mexico poblacion mayor a 500000, orden descen
SELECT countries.name, cities.name, cities.population
FROM countries
JOIN cities ON countries.id = cities.country_id
WHERE countries.name = "Mexico"
AND cities.population > 500000;

4 -- Todos los idiomas en un pais con % superior a 89 orden DESC
SELECT countries.name, languages.`language`, languages.percentage
FROM countries
JOIN languages ON countries.id = languages.country_id
WHERE languages.percentage > 89
ORDER BY languages.percentage DESC;

5 -- Todos los paises con un area inferior a 501 y poblacion superior a 100.000
SELECT countries.name, countries.surface_area, countries.population
FROM countries
WHERE countries.surface_area < 501
AND countries.population > 100000
ORDER BY countries.population DESC;

6 -- paises con solo monarquia constitucional, capital superior a 200 y esperanza de vida superior a 75
SELECT countries.name, countries.government_form, countries.capital, countries.life_expectancy
FROM countries
WHERE countries.government_form = "Constitutional Monarchy"
AND countries.capital > 200
AND countries.life_expectancy > 75;

7 -- Ciudades arg dentro del dist BS. poblacion sobre 500000
SELECT countries.name, cities.name, cities.district, cities.population
FROM countries
JOIN cities ON countries.id = cities.country_id
WHERE countries.id = 9
AND cities.district = "Buenos Aires"
AND cities.population > 500000;

8 -- numero de paises en cada region
SELECT countries.region AS Regiones, Count(countries.id) AS "Número de países"
FROM countries
GROUP BY countries.region
ORDER BY COUNT(countries.id) DESC