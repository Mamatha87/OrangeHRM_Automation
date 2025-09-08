# OrangeHRM Automation Suite

This project is a TestNG + Selenium automation framework created to test the **OrangeHRM Demo Application**.  
It covers end-to-end scenarios like login, navigation (PIM, Leave, My Info), and logout.

## 📂 Project Structure

OrangeHRM_Automation/
├── pom.xml
├── testng.xml
├── src/
│ ├── main/java/pages/ # Page Objects
│ └── test/java/tests/ # Test Cases


## ⚙️ Tech Stack

- **Java 17**
- **Selenium WebDriver 4.14.0**
- **TestNG 7.8.0**
- **Maven** (for build & dependency management)
- **ChromeDriver** (tested on Chrome v131)
- 

## 🚀 How to Run the Tests

### Using IDE (Eclipse/IntelliJ)
1. Clone this repository into your IDE.
2. Right-click on `testng.xml`.
3. Select **Run As → TestNG Suite**.

### Using Command Line
```bash
mvn test -Dtest=tests.OrangeHRMTest


✅Test Flow
The automation suite performs the following steps:

Launch browser
Login with Admin / admin123
Navigate through: PIM → Leave → My Info
Logout
Close browser

📊 Test Results

After execution, TestNG will generate a report inside:

test-output/index.html

Open it in your browser to view detailed results.


📌 Notes

Make sure you have ChromeDriver compatible with your browser version.

Update the path in OrangeHRMTest.java if needed.

This framework can be extended easily with more test cases.


