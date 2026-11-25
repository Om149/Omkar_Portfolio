package com.omkar.portfolio.service;

import com.omkar.portfolio.model.Project;
import com.omkar.portfolio.model.Skill;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PortfolioContent {
 public List<Skill> skills(){return List.of(
  new Skill("Data Analytics","Python, Pandas, NumPy, Data Cleaning, EDA","📊"),
  new Skill("SQL & Databases","MySQL, SQLite, Joins, Aggregations, JDBC","🗄️"),
  new Skill("BI & Visualization","Power BI, DAX, Power Query, Excel, Matplotlib, Seaborn","📈"),
  new Skill("Programming","Java, Python, JavaScript, SQL, C/C++","💻"),
  new Skill("Java Technologies","OOP, Collections, JDBC, Servlets, JSP, Maven, Spring Boot Fundamentals, Spring Data JPA","☕"),
  new Skill("Tools","Git, GitHub, Jupyter Notebook, Google Colab, VS Code, Android Studio","🛠️"));}
 public List<Project> projects(){return List.of(
  new Project("Retail Sales & Business Performance Analytics","Data Analytics","End-to-end analysis of retail sales data, from cleaning to an interactive Power BI dashboard.","Analyzed 8,500+ retail records to identify sales trends, customer purchasing patterns and product performance; performed data cleaning, EDA and statistical analysis.|Used SQL joins, subqueries and window functions to assess revenue, profitability and regional performance.|Built a Power BI dashboard with DAX measures, KPI cards and interactive filters.","Python, SQL, Excel, Power BI"),
  new Project("Government Resolutions (GRs) Repository","Web Development","A responsive web portal to digitize, organize and publish government documents.","Developed a responsive web portal with dynamic search and filtering functionality.|Designed a relational SQL database for user profiles, departments and document links, enabling structured data management and efficient document retrieval.","SQL, HTML, CSS, JavaScript"),
  new Project("Smart Alert System for Wild Animal Detection","Computer Vision / IoT","Real-time animal detection system that sends automated SMS alerts.","Developed a real-time animal detection system using YOLO and OpenCV with modular, object-oriented design for continuous camera-based monitoring.|Integrated automated SMS alerts through a third-party API.","JavaScript, OpenCV, YOLO, IoT, SMS API"));}
}
