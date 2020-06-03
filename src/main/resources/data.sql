INSERT INTO user (user_id, name, password, role, username) VALUES (10, 'Jon', '1234', 'ROLE_ADMIN', 'jon62');

INSERT INTO category (category_id, category_name, user_id) VALUES (100, 'Frugt', 10);
INSERT INTO category (category_id, category_name, user_id) VALUES (101, 'Mejeri', 10);
INSERT INTO category (category_id, category_name, user_id) VALUES (102, 'Snacks', 10);
INSERT INTO category (category_id, category_name, user_id) VALUES (103, 'Grønt', 10);

INSERT INTO vendor (vendor_id, cvr) VALUES  (50, '1234567');
INSERT INTO vendor (vendor_id, cvr) VALUES  (51, '1234567');
INSERT INTO vendor (vendor_id, cvr) VALUES  (52, '1234567');
INSERT INTO vendor (vendor_id, cvr) VALUES  (53, '1234567');
INSERT INTO vendor (vendor_id, cvr) VALUES  (54, '1234567');
INSERT INTO vendor (vendor_id, cvr) VALUES  (55, '1234567');
INSERT INTO vendor (vendor_id, cvr) VALUES  (56, '1234567');
INSERT INTO vendor (vendor_id, cvr) VALUES  (57, '1234567');
INSERT INTO vendor (vendor_id, cvr) VALUES  (58, '1234567');
INSERT INTO vendor (vendor_id, cvr) VALUES  (59, '1234567');

INSERT INTO product (product_id, product_name, vendor_id, category_id, user_id) VALUES (1, 'Banana', 50, 100, 10);
INSERT INTO product (product_id, product_name, vendor_id, category_id, user_id) VALUES (2, 'Chips', 51, 102, 10);
INSERT INTO product (product_id, product_name, vendor_id, category_id, user_id) VALUES (3, 'Potato', 52, 103, 10);
INSERT INTO product (product_id, product_name, vendor_id, category_id, user_id) VALUES (4, 'Apple', 53, 100, 10);
INSERT INTO product (product_id, product_name, vendor_id, category_id, user_id) VALUES (5, 'Cheese', 54, 101, 10);
INSERT INTO product (product_id, product_name, vendor_id, category_id, user_id) VALUES (6, 'Milk', 55, 101, 10);
INSERT INTO product (product_id, product_name, vendor_id, category_id, user_id) VALUES (7, 'Watermelon', 56, 100, 10);
INSERT INTO product (product_id, product_name, vendor_id, category_id, user_id) VALUES (8, 'Onion', 57, 103, 10);
INSERT INTO product (product_id, product_name, vendor_id, category_id, user_id) VALUES (9, 'Candy', 58, 102, 10);
INSERT INTO product (product_id, product_name, vendor_id, category_id, user_id) VALUES (10, 'Garlic', 59, 103, 10);

INSERT INTO batch (batch_id, start_quantity, end_quantity, expiration_date, product_id, user_id) VALUES (1, 300, 20, '2020-12-01', 3, 10)
