# CS5004_Michael
repository for CS5004, instructor: Molly Domino
# Text-Based RPG Game

**March 2024 – May 2024**  
**Individual Course Project**  
**Technologies:** Java, MVC, OOP, Recursion, Lambda Expressions

## Overview

This project is a modular, top-down, text-based RPG game implemented in Java. It was developed as a solo academic project to demonstrate object-oriented design, MVC architecture, and fundamental software engineering principles. The game features a protagonist navigating a grid-based map filled with enemies, items, and interactive elements.

## Features

- Text-based movement using `W`, `A`, `S`, `D` input keys.
- Interactive entities:
  - Enemies with unique behaviors and stats
  - Consumables (e.g., health potions) that affect player state
  - Gear and collectibles that enhance abilities or score
- Simple combat and inventory systems
- Grid-based world map that updates dynamically
- Victory and defeat conditions based on game state

## Technical Highlights

### Object-Oriented Design

- Applied principles of encapsulation, inheritance, and polymorphism
- Used abstract classes and interfaces to define extensible game object hierarchies

### Model-View-Controller (MVC) Architecture

- **Model**: Contains the core game logic and state (e.g., Player, Map, Enemy)
- **View**: Renders game state in the console using text-based UI
- **Controller**: Manages user input, game updates, and control flow

### SOLID Principles

- Designed for scalability, reusability, and maintainability
- Separated responsibilities across distinct classes and modules

### Functional Programming

- Utilized lambda expressions and higher-order functions such as `map`, `filter`, and `reduce`
- Implemented a custom linked list ADT to manage dynamic collections (e.g., inventory, active entities)

### Recursion and Generics

- Used recursion in map rendering and entity interactions
- Designed reusable generic data structures to ensure type safety and code reuse

## How to Run

### Prerequisites

- Java 17 or later

### Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/text-rpg-game.git
   cd text-rpg-game
