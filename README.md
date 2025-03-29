# 🚀 API Automation with Rest Assured

## 📌 Project Overview
This project focuses on automating API testing using **Rest Assured** with Java. It includes utilities for validating responses, managing payloads, logging, reporting, and integrating with CI/CD pipelines.

---

## 🛠️ Technologies Used

| Category                | Tools & Technologies |
|------------------------|----------------------|
| **Programming Language** | Java |
| **API Testing Framework** | Rest Assured |
| **JSON Schema Validation** | Rest Assured |
| **HTTP Methods Testing** | GET, POST, PUT, DELETE |
| **Response Verification** | Rest Assured, AssertJ, TestNG |
| **Payload Management** | Jackson API, Gson (POJO) |
| **Logging** | Log4J |
| **Build & Dependency Management** | Maven |
| **Data-Driven Testing** | Apache POI, Fillow (Excel) |
| **Reporting** | Allure Report, Extent Report |
| **Test Case Management** | TestNG |
| **CI/CD Integration** | Jenkins |
| **Version Control** | Git (GitHub, GitLab, Bitbucket) |
| **Database Connectivity** | MySQL Connector (Java), JDBC Connector |

---

## 📦 Dependencies
Ensure the following dependencies are included in your `pom.xml` file:

```xml
<dependencies>
    <!-- ✅ Rest Assured -->
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>5.x.x</version>
    </dependency>
    
    <!-- ✅ TestNG -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.x.x</version>
        <scope>test</scope>
    </dependency>
    
    <!-- ✅ Allure Report -->
    <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-testng</artifactId>
        <version>2.x.x</version>
    </dependency>
    
    <!-- ✅ Extent Report -->
    <dependency>
        <groupId>com.aventstack</groupId>
        <artifactId>extentreports</artifactId>
        <version>5.x.x</version>
    </dependency>
    
    <!-- ✅ Jackson API -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.x.x</version>
    </dependency>
    
    <!-- ✅ Gson -->
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.x.x</version>
    </dependency>
    
    <!-- ✅ Apache POI for Excel -->
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>5.x.x</version>
    </dependency>
    
    <!-- ✅ Log4J -->
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-core</artifactId>
        <version>2.x.x</version>
    </dependency>
</dependencies>
```

---

## 🏗️ Setup & Execution

1️⃣ Clone the repository:
   ```sh
   git clone <repository-url>
   ```

2️⃣ Navigate to the project directory:
   ```sh
   cd api-automation
   ```

3️⃣ Build the project using Maven:
   ```sh
   mvn clean install
   ```

4️⃣ Run tests:
   ```sh
   mvn test
   ```

---

## 🔗 CI/CD Integration
- ✅ **Jenkins** to trigger automated test execution.
- ✅ Store source code in **GitHub, GitLab, or Bitbucket**.
- ✅ Generate reports with **Allure Report** or **Extent Report**.

---

## 🤝 Contributions
Contributions are welcome! Feel free to **fork** the repository and submit a **pull request**. 🎉

---

🚀 Happy Testing! 🚀
