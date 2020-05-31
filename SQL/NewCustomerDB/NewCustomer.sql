create database NewCustomer;

use newcustomer;

create table customer (
	cust_id char(10),
	cust_first_name char(20),
	cust_last_name char(20),
	address char(20),
	city char(15),
	state char(2),
	zip char(5),
	email_address char(25),
	phone_number varchar(10)
	);

