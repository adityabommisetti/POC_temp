DROP TABLE IF EXISTS ORDER_ITEM;  
CREATE TABLE ORDER_ITEM (
ORDER_ID INT(50),
PRODUCT_CODE VARCHAR(50),
PRODUCT_NAME VARCHAR(10) NOT NULL,  
QUANTITY INT(50) NOT NULL,
PRIMARY KEY (ORDER_ID,PRODUCT_CODE)
); 