# Janitri Dashboard Login Page UI Automation

This project automates the UI testing of the Janitri Dashboard Login page using Selenium WebDriver with Java, TestNG, Maven, and the Page Object Model (POM) design pattern.

## 🔗 Test URL
[https://dev-dash.janitri.in/](https://dev-dash.janitri.in/)

---

## 📦 Tech Stack
- **Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Build Tool:** Maven
- **Test Framework:** TestNG
- **Design Pattern:** Page Object Model (POM)
- **Browser Driver Management:** WebDriverManager

---

## 📁 Project Structure

Janitri/
├── pom.xml
├── testng.xml
├── /src
│ ├── /main/java
│ │ ├── base/BaseTest.java
│ │ └── pages/LoginPage.java
│ └── /test/java
│ └── tests/LoginTest.java
---

## ✅ Test Scenarios Covered

1. **Login with Blank Fields**
   - Verify login button is disabled.
   - Validate UI behavior on empty field submission.

2. **Invalid Login Attempt**
   - Enter random invalid credentials and capture the error message shown.

3. **Password Masking Toggle**
   - Validate that the password is masked initially.
   - Toggle visibility using the eye icon and verify the password is shown.

4. **Page UI Elements Verification**
   - Check the visibility of the page title, email input, password field, login button, and eye icon.

---


