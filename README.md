# ParaBank Quality Engineering Suite

> 🚧 **Project Status: Active Development (Work in Progress)**

A comprehensive software testing repository focused on building a scalable Quality Assurance framework for the ParaBank demo application. This project serves as a portfolio piece demonstrating end-to-end QA processes, starting from manual test design and defect tracking, and extending into API and automated UI testing.

## 🗺️ Project Roadmap & Phases

- [x] **Phase 1.1: Core Manual Testing** (Fund Transfer & Authentication modules completed. Detailed test cases and bug reports documented).
- [ ] **Phase 1.2: Extended Manual Testing** (Bill Pay, Loan Requests, and User Profile updates - *In Progress*).
- [ ] **Phase 2: API Testing** (Validating backend endpoints using Postman / REST Assured - *Planned*).
- [ ] **Phase 3: UI Test Automation** (Building a robust automation framework using Java, Selenium WebDriver, TestNG, and Maven - *Planned*).

## 🛠️ Tech Stack & Tools

- **Methodologies:** Manual Testing (Black-Box), Boundary Value Analysis (BVA), Error Guessing.
- **Documentation:** Markdown (Bug Reports), Google Sheets (Test Cases & Execution).
- **Automation (Upcoming):** Java 21, Selenium WebDriver, TestNG.
- **API Testing (Upcoming):** Postman.
- **Version Control:** Git & GitHub.

## 📁 Project Structure

```text
ParaBank-Quality-Engineering-Suite/
├── manual-testing/
│   ├── test-scenarios/       # Test cases mapped to specific modules
│   └── bug-reports/          # Detailed defect reports with reproducible steps and evidence
├── api-testing/              # Future scope: Postman collections and API test results
└── automation-testing/       # Future scope: TestNG/Selenium test scripts

```

## 📊 Current Test Coverage

Currently, the test suite covers the following core modules manually:

1. **Fund Transfer Module:**
* Verified valid and invalid fund transfers.
* Discovered and documented critical backend validation defects (e.g., negative amounts, zero-value transfers).


2. **Authentication (Login & Registration):**
* Executed positive/negative flows for user onboarding and session handling.
* Tested session destruction and access control mechanisms.
* Identified critical security flaws in session management and input validation.



## 🐛 Defect Tracking

All identified defects are logged in the `bug-reports` directory following standard QA industry formats.

**Notable Backend Vulnerabilities Found:**

* `BUG-AUTH-001`: Insecure session management allowing access to secure pages via the browser 'Back' button post-logout (Broken Access Control).
* `BUG-TRF-001`: Overdraft vulnerability allowing transfers exceeding the available account balance.
* `BUG-TRF-004`: Reverse transfer exploit using negative amounts.
* `BUG-REG-001`: Input validation bypass permitting account creation with special characters in name fields.

---

**Maintained by:** Bahaa Eldin Essam
