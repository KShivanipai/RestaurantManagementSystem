# Restaurant Billing System

## Overview

The Restaurant Billing System is a comprehensive software solution developed using JavaFX, Scene Builder, and MySQL. This system allows administrators and cashiers to efficiently manage meals and drinks, track customer data, calculate total profit, and visualize customer trends. It aims to streamline restaurant operations and provide valuable insights for effective management.

## Features

- **CRUD Operations:** Seamless creation, reading, updating, and deletion of meal and drink items.
- **Customer Data Tracking:** Keeps records of customer interactions over time.
- **Profit Calculation:** Automatically calculates total profits earned.
- **Data Visualization:** Displays a bar chart showing days against the number of customers.

## Technologies Used

- **JavaFX:** For building the graphical user interface.
- **Scene Builder:** For designing the user interface.
- **MySQL:** For database management and storage.
- **JDBC:** For connecting Java applications to the MySQL database.

## Setup and Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/restaurant-billing-system.git
    cd restaurant-billing-system
    ```

2. **Set up the MySQL database:**
    - Install MySQL if it's not already installed.
    - Create a database for the project.
    - Execute the SQL script (`schema.sql`) provided in the repository to set up the necessary tables.

3. **Configure the database connection:**
    - Update the database connection details in the `DatabaseConnection.java` file.
    - Ensure that the JDBC driver is included in your project's classpath.

4. **Run the application:**
    - Compile the project using your preferred IDE or build tool.
    - Execute the main class to launch the application.

## Usage

1. **Admin Access:**
    - Log in as an admin to manage meals and drinks.
    - Add, edit, or delete menu items.
    - View customer data and profits.

2. **Cashier Access:**
    - Log in as a cashier to handle customer orders.
    - Generate bills for customers.
    - Track the number of customers and daily profits.
