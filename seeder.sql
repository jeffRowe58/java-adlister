USE adlister_db;

INSERT INTO users (username, email, password)
VALUES ('jimmyBob', 'jimbob@jimbob.com', '12345'),
       ('BilBo', 'baggins@lotr.com', 'precious');

INSERT INTO ads (user_id, title, description)
VALUES (1, 'Honda Civic for sale', 'Very clean garage kept low mileage'),
       (2, 'Ring for sale', 'Ordinary gold 24k ring in good condition'),
       (2, 'Robe for sale', 'Grey robe slightly used smells of magic');