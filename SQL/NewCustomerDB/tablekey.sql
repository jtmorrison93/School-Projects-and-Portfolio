alter table customer
add PRIMARY KEY (cust_id);

ALTER table customer 
drop COLUMN agent;

ALTER TABLE customer
add agent_id VARCHAR(10);