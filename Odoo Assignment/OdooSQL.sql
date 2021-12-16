-- Create a new table called 'TableName' in schema 'SchemaName'
-- Drop the table if it already exists
IF OBJECT_ID('SchemaName.TableName', 'U') IS NOT NULL
DROP TABLE SchemaName.TableName
GO
-- Create the table in the specified schema

-- Write SQL statements to create database tables to store the details of users  of a basic ecommerce website.
-- 10.1) Each user has a first name, last name, address and city id to store parent reference . City table has id and name column.
CREATE TABLE SchemaName.TableName
(
    TableNameId INT NOT NULL PRIMARY KEY, -- primary key column
    firstName [NVARCHAR](50) NOT NULL,
    lastName [NVARCHAR](50) NOT NULL,
    address [NVARCHAR](50) NOT NULL,
    cityId [NVARCHAR](50) NOT NULL
    -- specify more columns here
);
GO


-- With the Fact that these tables are populated with 10000 users and 30 cities.
-- 10.2) Write a SQL query to find cities with highest number of users and reutrn city id,name and number users in descending order.
-- 10.3) How would you populate the tables with ramdon test datas for a tables created at problem 1.
-- SELECT cityId FROM tableName WHERE "highest number of users" 

