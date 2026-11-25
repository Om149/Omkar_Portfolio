package com.omkar.portfolio.model;

import java.util.Arrays;
import java.util.List;

public class Skill {
 private final String category, items, icon;
 public Skill(String category,String items,String icon){this.category=category;this.items=items;this.icon=icon;}
 public String getCategory(){return category;} public String getItems(){return items;} public String getIcon(){return icon;}
 public List<String> getItemList(){return items==null||items.isBlank()?List.of():Arrays.stream(items.split(",")).map(String::trim).toList();}
}
