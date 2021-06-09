SELECT users.first_name, users.last_name, friendships.user_id, friendships.friend_id
FROM users 
LEFT JOIN friendships ON users.id = friendships.user_id 

