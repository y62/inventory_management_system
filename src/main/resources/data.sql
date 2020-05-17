INSERT INTO user (user_id, name, password, role, username) VALUES (10, 'Jon', '1234', 'admin', 'jon62');

INSERT INTO category (category_id, category_name, user_id) VALUES (100, 'Frugt', 10);
INSERT INTO category (category_id, category_name, user_id) VALUES (101, 'Mejeri', 10);
INSERT INTO category (category_id, category_name, user_id) VALUES (102, 'Snacks', 10);
INSERT INTO category (category_id, category_name, user_id) VALUES (103, 'Grønt', 10);

INSERT INTO item (item_id, item_name, producer, category_id, user_id) VALUES (1, 'Banana', 'Rema 1000', 100, 10);
INSERT INTO item (item_id, item_name, producer, category_id, user_id) VALUES (2, 'Chips', 'Rema 1000', 102, 10);
INSERT INTO item (item_id, item_name, producer, category_id, user_id) VALUES (3, 'Potato', 'Rema 1000', 103, 10);
INSERT INTO item (item_id, item_name, producer, category_id, user_id) VALUES (4, 'Apple', 'Rema 1000', 100, 10);
INSERT INTO item (item_id, item_name, producer, category_id, user_id) VALUES (5, 'Cheese', 'Rema 1000', 101, 10);
INSERT INTO item (item_id, item_name, producer, category_id, user_id) VALUES (6, 'Milk', 'Rema 1000', 101, 10);
INSERT INTO item (item_id, item_name, producer, category_id, user_id) VALUES (7, 'Watermelon', 'Rema 1000', 100, 10);
INSERT INTO item (item_id, item_name, producer, category_id, user_id) VALUES (8, 'Onion', 'Rema 1000', 103, 10);
INSERT INTO item (item_id, item_name, producer, category_id, user_id) VALUES (9, 'Candy', 'Rema 1000', 102, 10);
INSERT INTO item (item_id, item_name, producer, category_id, user_id) VALUES (10, 'Garlic', 'Rema 1000', 103, 10);