package com.omkar.portfolio.controller;

import com.omkar.portfolio.model.ContactMessage;
import com.omkar.portfolio.model.Profile;
import com.omkar.portfolio.repository.ContactMessageRepository;
import com.omkar.portfolio.service.PortfolioContent;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PageController {
 private final PortfolioContent content; private final ContactMessageRepository messages;
 public PageController(PortfolioContent content,ContactMessageRepository messages){this.content=content;this.messages=messages;}
 @ModelAttribute
 public void common(Model model){model.addAttribute("profile",new Profile());model.addAttribute("skills",content.skills());model.addAttribute("projects",content.projects());}
 private String page(Model model,String active,String view){model.addAttribute("active",active);return view;}
 @GetMapping({"/","/home"}) public String home(Model m){return page(m,"home","index");}
 @GetMapping({"/about","/about/"}) public String about(Model m){return page(m,"about","about");}
 @GetMapping({"/skills","/skills/"}) public String skills(Model m){return page(m,"skills","skills");}
 @GetMapping({"/experience","/experience/"}) public String experience(Model m){return page(m,"experience","experience");}
 @GetMapping({"/projects","/projects/"}) public String projects(Model m){return page(m,"projects","projects");}
 @GetMapping({"/education","/education/"}) public String education(Model m){return page(m,"education","education");}
 @GetMapping({"/contact","/contact/"}) public String contact(Model m){m.addAttribute("contactMessage",new ContactMessage());return page(m,"contact","contact");}
 @PostMapping({"/contact","/contact/"}) public String submit(@Valid @ModelAttribute("contactMessage") ContactMessage msg,BindingResult result,Model m,RedirectAttributes ra){
  if(result.hasErrors()){m.addAttribute("active","contact");return "contact";}
  messages.save(msg);ra.addFlashAttribute("success","Thank you! Your message has been sent. I'll get back to you soon.");return "redirect:/contact";
 }
 @GetMapping("/admin/messages") public String inbox(Model m){m.addAttribute("messages",messages.findAllByOrderByCreatedAtDesc());return page(m,"admin","admin-messages");}
 @PostMapping("/admin/messages/{id}/delete") public String delete(@PathVariable Long id){messages.deleteById(id);return "redirect:/admin/messages";}
}
