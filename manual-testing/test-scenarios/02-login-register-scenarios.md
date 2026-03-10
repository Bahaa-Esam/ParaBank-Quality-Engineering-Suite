# Test Scenarios: Authentication Module (Login & Registration)

**Module:** Security & User Authentication  
**Prepared By:** Bahaa Eldin Essam  
**Status:** In Progress

## 1. Registration Scenarios (Sign Up)

| Scenario ID | Test Scenario Description | Test Type |
| :--- | :--- | :--- |
| **TS_REG_001** | Verify successful user registration with all valid mandatory fields. | Positive / Functional |
| **TS_REG_002** | Verify registration fails when leaving mandatory fields blank. | Negative / Boundary |
| **TS_REG_003** | Verify registration fails when using an already existing username. | Negative / Functional |
| **TS_REG_004** | Verify password confirmation logic (passwords do not match). | Negative / Functional |
| **TS_REG_005** | Verify system response to special characters or excessive length in input fields. | Negative / Edge Case |

## 2. Login Scenarios (Sign In)

| Scenario ID | Test Scenario Description | Test Type |
| :--- | :--- | :--- |
| **TS_LOG_001** | Verify successful login with a valid username and correct password. | Positive / Functional |
| **TS_LOG_002** | Verify login fails with a valid username but incorrect password. | Negative / Functional |
| **TS_LOG_003** | Verify login fails with an unregistered or invalid username. | Negative / Functional |
| **TS_LOG_004** | Verify login fails when both username and password fields are blank. | Negative / Functional |
| **TS_LOG_005** | Verify successful logout functionality and termination of user session. | Security / Functional |
| **TS_LOG_006** | Verify inability to access secure pages using the browser's 'Back' button after logout. | Security / Edge Case |