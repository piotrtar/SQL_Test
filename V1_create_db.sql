CREATE TABLE `customers` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`name`	TEXT,
	`surname`	TEXT,
	`birtchyear`	INTEGER,
	`gender`	TEXT
);

CREATE TABLE `sales` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`customer_id`	INTEGER,
	`product_name`	TEXT,
	`net_value`	INTEGER,
	`tax_rate`	INTEGER
);