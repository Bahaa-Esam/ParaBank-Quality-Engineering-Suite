# ParaBank E2E Quality Engineering Suite

A comprehensive QA portfolio demonstrating a full Software Testing Life Cycle (STLC) approach on the ParaBank demo application. This project combines structured manual test design with a scalable UI automation framework.

🔗 **[View Manual Test Scenarios & Bug Reports (Google Sheets)](https://docs.google.com/spreadsheets/d/1aTSa80rnWiVAjZPAfjTSVRvDyRbEeXXUoFMU4Us4ryU/edit?usp=sharing)**

## 🛠️ Tech Stack & Architecture
* **Core:** Java 21, Maven
* **UI Automation:** Selenium WebDriver, TestNG
* **Design Pattern:** Page Object Model (POM) for maintainability and code reusability.
* **Reporting:** Allure Reports for detailed execution insights and failure tracing.

## 🎯 Project Highlights

### 1. Manual Testing Phase (Business Logic Focus)
Before automating, I analyzed the core business flows to uncover critical backend logic flaws that automated happy-paths might miss. Notable findings include:
* **`BUG-TRF-001`:** Overdraft Exploit - Bypassing account balance checks during fund transfers.
* **`BUG-TRF-004`:** Logic Flaw - The system accepts negative transfer amounts.
* **`BUG-AUTH-001`:** Broken Access Control - Secure pages remain accessible via the browser's 'Back' button post-logout.

### 2. UI Automation Phase
Translated the core manual test cases into robust, maintainable automated scripts:
* Built a modular structure separating test logic from page actions (POM).
* Utilized **TestNG** annotations for efficient test lifecycle management (`@BeforeMethod`, `@Test`, etc.).
* Integrated **Allure** to generate interactive dashboards showing pass/fail ratios and execution metrics.

## 🚀 Roadmap & Upcoming Phases
This framework is continuously evolving to cover all layers of the Testing Pyramid:
* **API Testing:** Automating backend endpoints (e.g., Accounts, Transactions) using **RestAssured** to validate business logic independently of the UI.
* **Database Testing:** Integrating **JDBC** to verify data integrity and ensure database states match application actions.
* **Performance Testing:** Simulating concurrent user loads and stressing transaction endpoints using **JMeter**.
* **CI/CD Integration:** Setting up **GitHub Actions** to automatically trigger test suites on every push/pull request.

## 📁 Repository Structure
* `/manual-testing/` - Contains bug reports, scenarios, and execution matrices.
* `/automation-testing/` - The Java/Selenium Maven project containing the POM architecture and test suites.

---
*Developed by Bahaa Eldin Essam - Software Quality Engineer*
