# ParaBank Quality Engineering Suite

A comprehensive software testing repository focused on functional and API testing of the ParaBank demo application. This project serves as a portfolio piece demonstrating end-to-end quality assurance processes, from manual test case design and defect tracking to building a scalable automated UI/API testing framework.

## 🛠️ Tech Stack & Tools

- **Methodologies:** Manual Testing (Black-Box), Boundary Value Analysis (BVA), Error Guessing.
- **Documentation:** Markdown (Bug Reports), Google Sheets (Test Cases & Execution).
- **Automation (Upcoming):** Java 21, Selenium WebDriver, TestNG, Maven.
- **Version Control:** Git & GitHub.

## 📁 Project Structure

```text
ParaBank-Quality-Engineering-Suite/
├── manual-testing/
│   ├── test-scenarios/       # Test cases mapped to specific modules (Fund Transfer, Auth, etc.)
│   └── bug-reports/          # Detailed defect reports with reproducible steps and evidence
└── automation-testing/       # Future scope: TestNG/Selenium test scripts

```

## 📊 Test Coverage

Currently, the test suite covers the following core modules:

1. **Fund Transfer Module:**
* Verified valid and invalid fund transfers.
* Discovered and documented critical backend validation defects (e.g., negative amounts, zero-value transfers).


2. **Authentication (Login/Registration):**
* *(In Progress)*



## 🐛 Defect Tracking

All identified defects are logged in the `bug-reports` directory following standard QA industry formats. Each report includes environment details, severity/priority, steps to reproduce, expected vs. actual results, and visual evidence.

**Notable Backend Vulnerabilities Found:**

* `BUG-TRF-001`: Overdraft vulnerability allowing transfers exceeding the available account balance.
* `BUG-TRF-004`: Reverse transfer exploit using negative amounts.

---

**Maintained by:** Bahaa Eldin Essam
