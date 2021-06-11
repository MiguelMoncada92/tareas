SELECT CONCAT(users.first_name," ", users.last_name)AS first, CONCAT (users2.first_name, " ", users2.last_name) AS friend_name
FROM users 
left JOIN friendships ON users.id = friendships.user_id 
JOIN users AS users2 ON friendships.friend_id = users2.id


SELECT CONCAT(users.first_name," ", users.last_name)AS first, CONCAT (users2.first_name, " ", users2.last_name) AS friend_name
FROM users 
left JOIN friendships ON users.id = friendships.user_id 
JOIN users AS users2 ON friendships.friend_id = users2.id
WHERE users.first_name = "Kermit" OR users2.first_name = "Kermit"

SELECT count(friendships.id) AS "Numer of friendships" FROM friendships 

SELECT COUNT(friendships.user_id),users.first_name,users.last_name, users2.first_name,users2.last_name
FROM users 
left JOIN friendships ON users.id = friendships.user_id 
JOIN users AS users2 ON friendships.friend_id = users2.id

-- INSERT INTO users (first_name, last_name, created_at, updated_at)
-- VALUES ("Juana", "De Arco", NOW(), NOW())

-- INSERT INTO friendships (user_id, friend_id, created_at, updated_at )
-- VALUES (6, 2, NOW(), NOW())
-- INSERT INTO friendships (user_id, friend_id, created_at, updated_at )-- VALUES (6, 4, NOW(), NOW())
-- INSERT INTO friendships (user_id, friend_id, created_at, updated_at )
-- VALUES (6, 5, NOW(), NOW())

-- DELETE FROM friendships WHERE friendships.id=5

SELECT users.first_name, users.last_name, users2.first_name AS "friend_first_name", users2.last_name AS "friend_last_name"
FROM users 
left JOIN friendships ON users.id = friendships.user_id 
JOIN users AS users2 ON friendships.friend_id = users2.id

