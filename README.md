# SchoolManagementSystem
#using java, servlet, jsp, html, css and postgres sql, eclipse ide and apache tomcat 8.5 server
student can login and view their result.
if student is not registered then she has to register herself first then after entering login credentials she can view her result.
admin can login to the website and add student marks to the database and admin can also view all of the students' marks in a tabular form.
all the jsp files are created inside the webapp folder of apache tomcat
inside the src/main/java folder of the project(Choose dynamic web project in jee perspective of eclipse ide) four packages are created
the packages are com.gcect.SMS.Bean, com.gcect.SMS.DAO, com.gcect.SMS.DBUtil, com.gcect.SMS.Service
in Bean package admin,student and student_result classes are created, in DBUtil package the connection with the database is established inside DBManager class, the DAO classes are created inside the DAO package and all the servlets are created inside service package.


