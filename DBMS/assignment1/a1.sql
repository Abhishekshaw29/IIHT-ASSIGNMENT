CREATE DATABASE Training_Basic;
USE Training_Basic;
CREATE TABLE Trainer_info( Trainer_id VARCHAR(20) PRIMARY KEY, Salutation VARCHAR(7) NOT NULL, Trainer_Name VARCHAR(30) NOT NULL, 
Trainer_Location VARCHAR(30) NOT NULL,
 Trainer_Track VARCHAR(15) NOT NULL, 
 Trainer_Qualification VARCHAR(100) NOT NULL, 
 Trainer_Experience INT(11) NOT NULL,
 Trainer_Email VARCHAR(100) NOT NULL,
 Trainer_Password VARCHAR(20) NOT NULL,
 CONSTRAINT UC_Email UNIQUE (Trainer_Email) );
CREATE TABLE Module_Info( Module_Id VARCHAR(20) PRIMARY KEY,
Module_Name VARCHAR(40), Module_Duration INT(11));
INSERT INTO Trainer_Info(Trainer_Id, Salutation, Trainer_Name, Trainer_Location, Trainer_Track, Trainer_Qualification, Trainer_Experience, Trainer_Email, Trainer_Password) VALUES ('F001', 'Mr.', 'PANKAJ GHOSH', 'Pune', 'Java', 'Bachelor of Technology', 12, 'Pankaj.Ghosh@alliance.com', 'fac1@123'), ('F002', 'Mr.', 'SANJAY RADHAKRISHNAN', 'Bangalore', 'DotNet', 'Bachelor of Technology', 12,'Sanjay.Radhakrishnan@alliance.com', 'fac2@123'), ('F003', 'Mr.', 'VIJAY MATHUR', 'Chennai', 'Mainframe', 'Bachelor of Technology', 10, 'Vijay.Mathur@alliance.com', 'fac3@123'),('F004', 'Mrs.', 'NANDINI NAIR', 'Kolkata', 'Java', 'Master of Computer Applications', 9, 'Nandini.Nair@alliance.com',

'fac4@123'), ('F005', 'Miss.', 'ANITHA PAREKH', 'Hyderabad', 'Testing', 'Master of Computer Applications', 6, 'Anitha.Parekh@alliance.com', 'fac5@123');
INSERT INTO Module_Info(Module_Id, Module_Name, Module_Duration) VALUES('O10SQL', 'Oracle 10g SQL', 16), ('O10PLSQL', 'Oracle 10g PL/ SQL', 16), ('J2SE', 'Core Java SE 1.6', 288), ('J2EE', 'Advanced Java EE 1.6', 80), ('JAVAFX', 'JavaFX 2.1', 80), ('DOTNT4', '.Net Framework 4.0', 50), ('SQL2008', 'MS SQl Server 2008', 120);