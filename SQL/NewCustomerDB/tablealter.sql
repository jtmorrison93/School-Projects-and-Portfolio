alter table customer
add agent char(25);
ALTER TABLE customer
add amt_owed varchar(10);

insert into customer (agent, amt_owed)
VALUES ('Brandon Stark', 256000),
('Baren Luthien', 35000),
('Huan Wolf', 47500),
('Samwise Gamgie', 1248),
('Galdalf Grey', 780000);