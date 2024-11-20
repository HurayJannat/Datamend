# **Dashboard Page Runner**

## **Overview**
This project is a Selenium-based automated test suite designed to test the functionality of the **Dashboard Page** of the Datamend application. The `DashboardPageRunner` class automates various user workflows, including logging in, selecting subscription plans, entering payment details, and running SQL queries.

---

## **Features**
1. **Login Automation:**
   - Automates login to the application using predefined credentials.

2. **Plan Selection and Payment:**
   - Navigates to the "Manage Plans" section.
   - Selects a subscription plan.
   - Automates card payment input via iframe handling.

3. **SQL Query Execution:**
   - Executes a SQL query (`SELECT years, car_model FROM cars`) in a loop for 100 iterations.

4. **Dynamic Element Handling:**
   - Waits for elements dynamically using **explicit waits** to ensure stability.

5. **Scroll and Interaction:**
   - Scrolls through pages to simulate user navigation.
   - Interacts with buttons, input fields, and dropdown menus.

---

## **Technologies Used**
- **Java**: Programming language.
- **Selenium WebDriver**: For browser automation.
- **TestNG**: Test framework for managing test cases.
- **Maven/Gradle**: For build and dependency management.
- **Page Object Model (POM)**: Structured design pattern for maintaining page elements.

---

## **File Structure**
- **`DashboardPageRunner`**: Main test runner for automating dashboard workflows.
- **`LoginPage`**: Handles login-related actions.
- **`DashboardPage`**: Contains elements and actions for the dashboard.
- **`Setup`**: Initializes WebDriver and configurations.
- **`Utils`**: Helper class for scrolling and utility functions.

---

## **Setup Instructions**

### **Prerequisites**
1. Java JDK 8 or above.
2. Maven or Gradle installed.
3. Google Chrome browser and corresponding ChromeDriver.
4. TestNG library.

### **Installation**
1. Clone the repository:
   ```bash
   git clone https://github.com/HurayJannat/Datamend.git
   cd Datamend
