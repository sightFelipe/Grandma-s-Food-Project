INSERT INTO grandmas_project_db.client(address, cellphone, document, email, full_name) VALUES ("El dorado", "3222379887", "1014478353", "example@mail.com", "Andres Yate");
INSERT INTO grandmas_project_db.product(category, description, name, price, uuid) VALUES ("FISH", "Descripcion no se", "Pescado", 1500.0, "0ced264a-12fb-43d3-ac31-5d77e88f5e8b");
INSERT INTO grandmas_project_db.order_entity(quantity, date_order, date_ordered, info_additional, tax, sub_total, total, client_document, product_uuid) VALUES (2,"2024-02-25 16:00:00", "2024-03-01 01:00:00", "N/A", 19.0, 5000.0, 2000.0, "1014478353", "0ced264a-12fb-43d3-ac31-5d77e88f5e8b");

