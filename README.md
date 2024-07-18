# Restaurant Billing System

## Overview

The Restaurant Billing System is a comprehensive software solution developed using JavaFX, Scene Builder, and MySQL. This system allows administrators and cashiers to efficiently manage meals and drinks, track customer data, calculate total income, and visualize customer trends. It aims to streamline restaurant operations and provide valuable insights for effective management.

## Features

- **CRUD Operations:** Seamless creation, reading, updating, and deletion of meal and drink items.
- **Customer Data Tracking:** Keeps records of customer interactions over time.
- **Profit Calculation:** Automatically calculates total income earned.
- **Data Visualization:** Displays a bar chart showing days against the number of customers.

## Technologies Used

- **JavaFX:** For building the graphical user interface.
- **Scene Builder:** For designing the user interface.
- **MySQL:** For database management and storage.
- **JDBC:** For connecting Java applications to the MySQL database.

## Setup and Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/RestaurantBillingSystem.git
    cd RestaurantBillingSystem
    ```

2. **Set up the MySQL database:**
    - Install MySQL if it's not already installed.
    - Create a database for the project.
    - Execute the SQL script provided in the repository to set up the necessary tables.

3. **Configure the database connection:**
    - Update the database connection details in the `Database.java` file.
    - Ensure that the JDBC driver is included in your project's classpath.

4. **Run the application:**
    - Compile the project using your preferred IDE or build tool.
    - Execute the main class to launch the application.

## Usage

1. **Admin Access:**
    - Log in as an admin to manage meals and drinks.
    - Add, edit, or delete menu items.
    - View customer data and income.

2. **Cashier Access:**
    - Log in as a cashier to handle customer orders.
    - Generate bills for customers.
    - Track the number of customers and daily income.

## Screenshots
![Screenshot 1](https://github.com/user-attachments/assets/d78c1640-4abe-49e4-b53f-b39ec9f94260)
* Login Page*


![Screenshot 2](https://github.com/user-attachments/assets/d3cb7fe8-0f1d-460c-b5bc-c2ff55ca9bdb)
*Dashboard showing income and customer chart*



![Screenshot 3](https://github.com/user-attachments/assets/24c21900-ce8e-457b-bb0e-c2544640f354)
*Inventory*

![Screenshot 4](https://github.com/user-attachments/assets/d26c5c58-fe52-4cc0-b855-1089296e647d)
*Menu management interface*

![Screenshot 5](https://github.com/user-attachments/assets/b4c5ce2b-2451-4780-8fa9-4d44893f4e71)
*Customer Details*
