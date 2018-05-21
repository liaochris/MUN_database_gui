# MUN_database_gui

MUNDB is a java application that combines user interaction and databases to help facilitate the access of information.
The purpose of this is to allow Model United Nations teams and clubs to store and access crucial information about their club members and conference/travel team members. 

For this program to work, it is necessary that you have already installed JDBC and MySQL. 
In addition, you must create the necessary tables on the command prompt or terminal. First, set the directory to "C:\Program Files\MySQL\MySQL Server 5.7\bin" (or whatever the location of the folder containing mysqld.exe is) and then open mysqld.exe on the command line/terminal. Then, type in mysql -u root. By default, no password will exist.
In order to setup your password, you must type this. Replace 'newpd' with your new password.

**Below are specific instructions for if you just want to use the jar, without changing any of the code.
For using the jar, I set my password as rootpass.** 

Enter all of these into the command line, in order. 

SET PASSWORD FOR 'root'@'localhost' = PASSWORD('rootpass');

SET PASSWORD FOR 'root'@'server_host_name' = PASSWORD('rootpass');

create Database EMP;

use EMP;

create Table MUN_DATA_CONFERENCE (NAME varchar(255), EMAIL varchar(255),PHONE_NUMBER int(11), GRADE int(11), CONFERENCE_AND_YEAR varchar(255), SOI tinyint(1), PAUSD_FORM tinyint(1), CONFERENCE_EMERGENCY tinyint(1), CONFERENCE_WAIVER tinyint(1), PARENT_NAME varchar(255), PARENT_EMAIL varchar(255), PARENT_PHONE_NUMBER int(11), PARENT_CHAPERONE tinyint(1));

*I have also included the entire project folder as well as external Jar's that I used.*
