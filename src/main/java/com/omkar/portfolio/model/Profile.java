package com.omkar.portfolio.model;

import java.util.List;

/**
 * Static profile data taken from the resume. Kept as plain records because it rarely changes.
 */
public class Profile {

    // Instance getters so Thymeleaf can read the values as ${profile.name}, ${profile.email}, ...
    public String getName() { return NAME; }
    public String getTitle() { return TITLE; }
    public String getLocation() { return LOCATION; }
    public String getPhone() { return PHONE; }
    public String getEmail() { return EMAIL; }
    public String getLinkedin() { return LINKEDIN; }
    public String getGithub() { return GITHUB; }
    public String getSummary() { return SUMMARY; }
    public List<Experience> getExperiences() { return EXPERIENCES; }
    public List<Education> getEducation() { return EDUCATION; }
    public List<Certification> getCertifications() { return CERTIFICATIONS; }
    public List<Language> getLanguages() { return LANGUAGES; }

    public static final String NAME = "Omkar Kadam";
    public static final String TITLE = "Data Analyst & Java Developer";
    public static final String LOCATION = "Navi Mumbai, Maharashtra";
    public static final String PHONE = "+91 9860381512";
    public static final String EMAIL = "omkardm2004@gmail.com";
    public static final String LINKEDIN = "https://linkedin.com/in/omkar-kadam-40a18a25b";
    public static final String GITHUB = "https://github.com/Om149";

    public static final String SUMMARY =
            "Recent B.E. Information Technology graduate (CGPA: 8.27/10) with internship experience in data analytics "
            + "and practical knowledge of Java development. Skilled in Python, SQL, Excel and Power BI for data "
            + "preparation, exploratory analysis, KPI reporting and dashboard development. Familiar with Core Java, "
            + "object-oriented programming, JDBC, Servlets, JSP and Spring framework concepts, including Spring Data JPA. "
            + "Strong problem-solving approach with an interest in using technology to solve business problems.";

    public record Experience(String role, String company, String period, List<String> points) {}

    public record Education(String degree, String institute, String score, String period) {}

    public record Certification(String title, String issuer, String date) {}

    public record Language(String name, String level) {}

    public static final List<Experience> EXPERIENCES = List.of(
            new Experience(
                    "Data Analyst and Data Science Intern",
                    "Technosignia Training Institute",
                    "Oct 2026 – Present",
                    List.of(
                            "Prepared and explored retail datasets using Python, Pandas and NumPy; inspected data structure and audited missing values, duplicates, invalid dates, returns and inconsistent records.",
                            "Cleaned and transformed data using documented rules, created quality flags and derived revenue and time-based features; defined KPIs such as revenue, distinct orders, units sold and average order value.",
                            "Loaded analysis-ready data into SQLite and wrote SQL queries for revenue summaries, monthly performance, category comparisons and product ranking using aggregations and window functions.",
                            "Analyzed sales trends, product and category performance, customer spending, repeat orders and country-level results; used correlation analysis to examine relationships between order volume and revenue.",
                            "Developed an interactive Power BI report with KPI cards, monthly trends, product/category and country comparisons, customer insights and date, category and product filters.")));

    public static final List<Education> EDUCATION = List.of(
            new Education("Bachelor of Engineering, Information Technology",
                    "Bharati Vidyapeeth College of Engineering, Navi Mumbai",
                    "CGPA: 8.27 / 10", "Sep 2023 – Jun 2026"),
            new Education("Diploma in Information Technology",
                    "Government Polytechnic College, Mumbai",
                    "82.92%", "Dec 2020 – Jul 2023"));

    public static final List<Certification> CERTIFICATIONS = List.of(
            new Certification("Data Science Essentials with Python", "Cisco Networking Academy", "Jul 2026"),
            new Certification("Introduction to Data Science", "Cisco Networking Academy", "Jun 2026"),
            new Certification("Deloitte Cyber Job Simulation", "Forage", "Jun 2025"));

    public static final List<Language> LANGUAGES = List.of(
            new Language("English", "Professional"),
            new Language("Hindi", "Fluent"),
            new Language("Marathi", "Native"));
}
