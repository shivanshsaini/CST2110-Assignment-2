# CST2110 Individual Programming Assignment #2

**Course**: BSc Computer Science  
**Module**: CST2110 – Programming  
**University**: Middlesex University  
**Assignment Title**: Programming Assignment #2  
**Deadline**: 16:00, Friday 3rd April 2020  
**Language**: Java 8  
**IDE**: NetBeans 8  
**Platform**: Windows OS

---

## 📁 Project Structure

This repository contains a ZIP archive of three separate NetBeans 8 projects, each representing a distinct task as outlined in the assignment brief. Upon extracting the ZIP, the folder structure should appear as:


Each folder represents a **cleaned** NetBeans project (i.e., `.class` files removed via `Clean` command).

---

## 🧠 Task Overview

### ✅ Task 1: Trader Data Explorer 

- **Objective**: Read a delimited data file (`traders.txt`) representing 25 trading companies in North London.
- **Core Features**:
  - Load data into `Trader` objects and store in a collection.
  - Console menu with options:
    - List all traders with ID, company name, location, services.
    - View details of a selected trader by ID.
    - Search companies by location.
    - Search companies by services offered.
- **Technologies**: File I/O, Collections, String Matching, Formatted Console Output.

---

### 🤸 Task 2: Gymnastics Competition Manager 
- **Objective**: Console-based system for managing events in a gymnastics competition.
- **Use Cases**:
  1. Display competitor and organizer info for an event.
  2. List all events and routines for a given competitor.
  3. Display all attempts and scores for a specified event.
- **Structure**:
  - Multiple interconnected Java classes (e.g., `Event`, `Competitor`, `Routine`, `CommitteeMember`, `Attempt`, etc.).
  - Hard-coded dummy data for testing.
- **Technologies**: OOP Design, Nested Collections, Console UI, Encapsulation.

---

### 🏠 Task 3: JavaFX Smart Home Controller 

- **Objective**: Create a JavaFX GUI replicating a smart home control panel.
- **GUI Elements**:
  - Lighting section: Circles respond to sliders (light/dark).
  - Heating section: Radio buttons and vertical slider update temperature in TextField.
  - CCTV section: Toggle buttons show/hide images.
- **Requirements**:
  - **Must use** hand-coded JavaFX (no drag-and-drop or FXML).
  - **Layout accuracy** is key; no CSS styling is required.
- **Technologies**: JavaFX (Scene, Stage, Nodes, Event Handling), ImageView, Sliders, Buttons.

---

## 🔧 How to Run

### General Instructions:
1. Open each `Task1`, `Task2`, and `Task3` folder in NetBeans as independent projects.
2. For **Task1**, ensure `traders.txt` is placed in the root of the project directory.
3. For **Task3**, ensure the `images` folder (with 4 image files) is located in the project root.
4. Build and run each project using NetBeans.

---

## ⚙️ Requirements

- Java JDK 8
- NetBeans 8
- Windows OS (for compatibility testing)

---

## 🛑 Notes

- All code is **read-only** — no updates, deletions, or file modifications occur during execution.
- All NetBeans projects are **cleaned** before submission (no `.class` files).
- File paths are **relative** to ensure portability.
- Followed best practices in OOP and user interaction.
- Console interfaces are formatted for clarity and usability.

---

## 👨‍🎓 Author

**Name**: Shivansh Saini
**Student ID**: M00685429  
**Course**: BSc Computer Science, Middlesex University  

---

## 📄 License

This project is provided for academic assessment only. Do not redistribute or submit without authorization.

---

