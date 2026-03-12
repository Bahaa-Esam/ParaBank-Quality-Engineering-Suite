# ParaBank QA Engineering Portfolio

> 🚧 **Status: Work in Progress**

QA testing portfolio for the ParaBank demo app. Currently focused on manual test design and bug reporting, with API and UI automation phases coming next.

🔗 **[View Manual Test Scenarios & Execution (Google Sheets)](https://docs.google.com/spreadsheets/d/1aTSa80rnWiVAjZPAfjTSVRvDyRbEeXXUoFMU4Us4ryU/edit?usp=sharing)**

## 🗺️ Roadmap

- [x] **Phase 1: Manual Testing** (Fund Transfer & Auth modules completed. Bugs logged).
- [ ] **Phase 2: API Testing** (Postman).
- [ ] **Phase 3: UI Automation** (Java, Selenium WebDriver, TestNG).

## 🛠️ Tech Stack & Tools

- **Testing Types:** Black-Box, Boundary Value Analysis, Error Guessing.
- **Documentation:** Google Sheets, Markdown.
- **Automation (Planned):** Java 21, Selenium, TestNG, Maven.

## 📁 Repository Structure

```text
ParaBank-Quality-Engineering-Suite/
├── api-documentation/        # Planned: API test collections
├── automation-testing/       # Planned: Java/Selenium UI scripts
└── manual-testing/
    ├── bug-reports/          # Markdown files & screenshots for defects
    ├── test-scenarios/       # Markdown files mapping module scenarios
    └── ParaBank_Test_Scenarios_v1.0.xlsx # Master execution sheet

```

## 📊 Test Coverage (Manual)

Tested core features with a focus on logic validation and edge cases:

**1. Fund Transfer Module:**

* Checked positive flows and boundaries.
* Found backend logic flaws (e.g., negative transfers, bypassing balance checks).

**2. Authentication (Login & Registration):**

* Tested onboarding, login, and secure logout.
* Logged session management issues.

## 🐛 Defect Highlights

See the `bug-reports` folder for reproducible steps. Notable finds include:

* **`BUG-AUTH-001`**: Broken Access Control - Secure dashboard remains accessible via browser 'Back' button after logout.
* **`BUG-TRF-001`**: Overdraft Exploit - System processes transfers exceeding the available account balance.
* **`BUG-TRF-004`**: Logic Flaw - Transfer field accepts negative amounts, effectively reversing the transaction.
* **`BUG-REG-001`**: Validation Bypass - First/Last Name fields accept special characters and numbers during account creation.

---

**Maintained by:** Bahaa Eldin Essam
