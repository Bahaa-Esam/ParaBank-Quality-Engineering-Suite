# Test Scenarios: Fund Transfer Module

**Module:** Account Services - Fund Transfer
**Objective:** Validate the end-to-end flow of transferring funds between valid internal accounts, ensuring strict adherence to business rules and data integrity.

| Scenario ID | Test Scenario Description | Test Design Technique | Priority |
| :--- | :--- | :--- | :--- |
| **TS_FT_001** | Verify successful fund transfer between two valid accounts with sufficient balance. | Use Case Testing | High |
| **TS_FT_002** | Verify successful transfer using the exact minimum allowed transfer amount. | Boundary Value Analysis (BVA) | High |
| **TS_FT_003** | Verify fund transfer fails when the source account has insufficient funds. | Equivalence Partitioning (EP) | Critical |
| **TS_FT_004** | Verify fund transfer is blocked when the transfer amount is exactly zero. | Boundary Value Analysis (BVA) | High |
| **TS_FT_005** | Verify fund transfer is blocked when the transfer amount is a negative value. | Boundary Value Analysis (BVA) | High |
| **TS_FT_006** | Verify system behavior when attempting to transfer funds to the exact same source account. | Error Guessing / Logic | Medium |
| **TS_FT_007** | Verify application response when the destination account ID is invalid or does not exist. | Equivalence Partitioning (EP) | High |

---
**Prepared By:** Bahaa Eldin Essam
**Status:** Approved for Test Case detailing