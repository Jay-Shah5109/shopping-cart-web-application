# Spring Boot Shopping Cart Web App

## About

This is a demo project for practicing Spring + Thymeleaf. The idea was to build some basic shopping cart web app.

It was made using **Spring Boot**, **Spring Security**, **Thymeleaf**, **Spring Data JPA**, **Spring Data REST and Docker**. 
Database is in memory **H2**.

There is a login and registration functionality included.

## TECH STACK: 
Backend: Java8, Spring Boot

FrontEnd: Thymeleaf, HTML, CSS

Database: In memory H2 DB

Cloud Service used for deployment: AWS (Deployed over EC2 instance using S3 as object store)

## DEPLOYMENT URLs: 
Web Application: 
Login: http://ec2-35-172-186-218.compute-1.amazonaws.com:8070/login

Registration: http://ec2-35-172-186-218.compute-1.amazonaws.com:8070/registration

To login, you can create a new user for yourself, as well as you can login with default user (Username: admin, Password: admin).

H2 DB: http://ec2-35-172-186-218.compute-1.amazonaws.com:8070/h2-console

## FUNCTIONALITIES IMPLEMENTED:
User is able to Signup and Login

Used the WEB API to fetch 1400 item details

Implemented the cart feature to add or remove items

Updation of inventory after each buy order

Implemented appropriate success and failure pages

Deployment of web application done over AWS (url provided above)
