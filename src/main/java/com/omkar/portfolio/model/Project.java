package com.omkar.portfolio.model;

import java.util.Arrays;
import java.util.List;

public class Project {
 private final String title,category,summary,highlights,techStack;
 public Project(String title,String category,String summary,String highlights,String techStack){this.title=title;this.category=category;this.summary=summary;this.highlights=highlights;this.techStack=techStack;}
 public String getTitle(){return title;} public String getCategory(){return category;} public String getSummary(){return summary;} public String getHighlights(){return highlights;} public String getTechStack(){return techStack;}
 public List<String> getHighlightList(){return highlights==null||highlights.isBlank()?List.of():Arrays.asList(highlights.split("\\|"));}
 public List<String> getTechList(){return techStack==null||techStack.isBlank()?List.of():Arrays.stream(techStack.split(",")).map(String::trim).toList();}
}
