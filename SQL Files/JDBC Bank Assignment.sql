CREATE USER bankdb IDENTIFIED BY b4nklif3;
GRANT CONNECT, RESOURCE TO bankdb;
GRANT DBA TO bankdb WITH ADMIN OPTION;

CREATE TABLE admin(
admin_id number(7)
,admin_user varchar2(500)
,admin_passwd varchar2 (500)
,PRIMARY KEY (admin_id)
);

CREATE TABLE bank_employee(
employee_id number(7)
,employee_user varchar2(500)
,employee_passwd varchar2 (500)
,PRIMARY KEY (employee_id)
);

CREATE TABLE bank_customer(
cust_id number(7)
,cust_user varchar2(500)
,cust_passwd varchar2 (500)
,PRIMARY KEY (cust_id)
);

CREATE TABLE account(
balance number(7)
,accountnumber number(12)
,PRIMARY KEY (accountnumber)
);

SELECT * FROM admin;
INSERT INTO admin values(1,'kdickerson', 'kdickerson90');
INSERT INTO admin values(2, 'Montez1', 'Tez1990');

SELECT * FROM BANK_EMPLOYEE; 
INSERT INTO bank_employee values(01,'Johnny', 'Appleseed');
INSERT INTO bank_employee VALUES(02, 'John Jacob', 'Jingleheimershcmidt');
INSERT INTO bank_employee VALUES(03,'Number','One');

SELECT * FROM BANK_CUSTOMER;
INSERT INTO bank_customer VALUES(001, 'Cloud', 'Strife');
INSERT INTO bank_customer values(002, 'Squall', 'Leonheart');
INSERT INTO bank_customer values(003, 'Ramza', 'Beoulve');

SELECT *FROM account;
INSERT INTO account VALUES (200, 123456);

CREATE SEQUENCE cust_seq
    START WITH 10
    INCREMENT BY 2;
   
CREATE OR REPLACE TRIGGER insert_cust_id
BEFORE INSERT on bank_customer
FOR EACH ROW
BEGIN
    IF :new.cust_id IS NULL THEN
        SELECT cust_seq.NEXTVAL INTO :new.cust_id FROM dual;
    END IF;
END;
/

SELECT * FROM BANK_CUSTOMER;

DELETE FROM BANK_CUSTOMER WHERE cust_id=10;
COMMIT;