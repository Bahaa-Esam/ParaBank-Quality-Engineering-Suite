# ParaBank E2E Quality Engineering Suite

A comprehensive Software Testing Life Cycle (STLC) portfolio demonstrating End-to-End testing on the ParaBank demo application. This project integrates Manual Testing, UI Automation, and API Testing into a unified CI/CD pipeline.

🔗 **[View Manual Test Scenarios & Bug Reports (Google Sheets)](https://docs.google.com/spreadsheets/d/1aTSa80rnWiVAjZPAfjTSVRvDyRbEeXXUoFMU4Us4ryU/edit?usp=sharing)**

## 🛠️ Tech Stack & Architecture

| Category | Tools & Technologies |
| :--- | :--- |
| **Core** | Java 21, Maven |
| **UI Automation** | Selenium WebDriver, TestNG |
| **API Testing** | Postman (Collections, Environments, Dynamic Data) |
| **CI/CD** | GitHub Actions |
| **Design Pattern** | Page Object Model (POM) |
| **Reporting** | Allure Reports |

## 🚀 Key Highlights & Achievements

### 1. Robust UI Automation Framework
* Built a modular structure strictly adhering to the **Page Object Model (POM)**, separating test logic from page actions for maximum maintainability.
* Utilized **TestNG** annotations for efficient test lifecycle management.
* Integrated **Allure Reports** to generate interactive dashboards detailing execution metrics and failure tracing.

### 2. API Session Management & Automation
* Automated `JSESSIONID` extraction and dynamic data generation (`{{$randomUserName}}`) in Postman to effectively test stateful registration and login flows.
* Configured environmental variables for seamless execution across different server environments.

### 3. Continuous Integration (CI/CD)
* Configured **GitHub Actions** to automatically trigger Maven builds and execute headless test suites on every repository push, ensuring continuous code quality.

### 4. Critical Bug Discovery (Manual Phase)
Applied formal **ISTQB Test Design Techniques** to analyze core business flows prior to automation. This structured approach uncovered critical backend logic flaws that automated happy-paths typically miss:

* **Boundary Value Analysis (BVA):** Evaluated transaction limits and account boundaries, leading to the discovery of **`BUG-TRF-001`** (Overdraft Exploit), where the system failed to block transfers exceeding the maximum available balance.
* **Equivalence Partitioning (EP):** Tested invalid input classes, uncovering **`BUG-TRF-004`** (Logic Flaw), where the backend incorrectly accepted negative transfer amounts (Invalid Partition).
* **State Transition Testing:** Analyzed application behavior during session changes, identifying **`BUG-AUTH-001`** (Broken Access Control), where secure pages remained accessible via the browser's 'Back' button post-logout.
## ⚙️ How to Run Locally

### UI Automation
1. Clone the repository and navigate to `/automation-testing/`
2. Run the test suite: `mvn clean test`
3. Generate and serve the execution report: `allure serve allure-results`

### API Testing
1. Import the Collection and Environment `.json` files from `/api-documentation/` into Postman.
2. Select the `ParaBank_Env` environment.
3. Run the collection using the Postman Runner.

## 📂 Repository Structure
* `/automation-testing/` - The Java/Selenium Maven project containing the POM architecture and test suites.
* `/api-documentation/` - Postman collections and environments for backend validation.
* `/manual-testing/` - Core manual test scenarios, execution matrices, and detailed bug reports.

---
*Developed by [Bahaa-Eldin Essam](https://linkedin.com/in/bahaa-swdalx)*
*Software Quality Engineer | [ISTQB® Foundation Level Certified]((https://scr.istqb.org/?name=Bahaa+Eldin+Essam&number=251117088&orderBy=relevancy&orderDirection=&dateStart=&dateEnd=&expiryStart=&expiryEnd=&certificationBody=&examProvider=&certificationLevel=&country=)) | DEPI [Software Testing Diploma](https://drive.google.com/file/d/1LAHyfrBXC_lN_OyvLWjzr-VFGUv7ZXQ4/view?usp=sharing)*
