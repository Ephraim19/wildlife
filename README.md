# Wildlife Tracker

Wildlife Tracker is a web app that enables rangers to record sights of various animals.

## Author
- Ephraim Machayo
 
## Setup Requirements for Database
* Open PSQL in your terminal
* CREATE DATABASE wildlife_tracker;
* \c wildlife_tracker
* CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
* CREATE TABLE animals (id serial PRIMARY KEY, name varchar);
* CREATE TABLE endangered (id serial PRIMARY KEY,name varchar,age int,health varchar);
* CREATE TABLE endangered (id serial PRIMARY KEY,name varchar,age varchar,health varchar);
* CREATE TABLE sights (id serial PRIMARY KEY,animal_id varchar,location varchar,ranger varchar);



## Technologies Used
* Java
* hbs
* css
* git

## Contact details
Email: machayoephraim@gmail.com

### License
*MIT license


