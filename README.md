# Omkar Kadam Portfolio (Spring Boot)

Rebuilt from your original portfolio while retaining its CSS, JavaScript, page content, profile information, skills and project descriptions. Built with Java 17, Spring Boot, Thymeleaf, Spring Data JPA and H2. Skills/projects are served from a simple Java content class; H2/JPA stores contact form submissions.

## Run on Windows
1. Install **JDK 17 or 21** (verify with `java -version`).
2. Extract this ZIP and open the `Omkar-Spring-Portfolio` folder in VS Code.
3. Double-click `run-portfolio.bat`, or run in PowerShell: `./mvnw.cmd spring-boot:run`.
4. On first run, the launcher downloads Maven and Maven downloads dependencies; keep internet access enabled.
5. Open http://localhost:8080.

Routes: `/`, `/about`, `/skills`, `/experience`, `/projects`, `/education`, `/contact`. CSS and JS are in `src/main/resources/static/css` and `static/js`.

Contact messages are saved in the local H2 database at `./data/portfolio`. H2 console: http://localhost:8080/h2-console (JDBC URL `jdbc:h2:file:./data/portfolio`, user `sa`, blank password).

This project does not use Spring Security, so the public portfolio and `/admin/messages` are not protected. Do not deploy the inbox publicly without adding authentication.
