# Contributing to SnakeJava 🐍

Thank you for your interest in contributing to SnakeJava!

SnakeJava is an open-source educational project developed in Java. Its goal is to build a simple console-based Snake game while learning object-oriented programming, Git and GitHub collaboration.

Everyone is welcome to contribute.

## 1. How to contribute

You can contribute by:

- Reporting bugs.
- Suggesting new features.
- Improving existing code.
- Writing or improving tests.
- Improving documentation.

## 2. Getting started

1. Fork the repository.
2. Clone your fork:

   ```bash
   git clone https://github.com/YOUR_USERNAME/SnakeJava.git
   ```

3. Enter the project directory:

   ```bash
   cd SnakeJava
   ```

4. Create a feature branch:

   ```bash
   git checkout -b feature/your-feature
   ```

## 3. Development rules

- Use Java 17 or a compatible newer version.
- Follow object-oriented programming principles.
- Keep each class focused on one responsibility.
- Use meaningful class, method and variable names.
- Write tests for new features and bug fixes.
- Do not modify public method signatures without discussing the change with the team.
- Do not commit passwords, tokens or private information.

## 4. Commit conventions

Use clear commit messages:

- `feat:` for new features.
- `fix:` for bug fixes.
- `test:` for tests.
- `docs:` for documentation.
- `refactor:` for code improvements.
- `chore:` for project maintenance.

Examples:

```bash
git commit -m "feat: implement snake movement"
git commit -m "fix: correct wall collision"
git commit -m "test: add food generation tests"
```

## 5. Testing

Before submitting your contribution, run:

```bash
mvn clean test
```

Make sure the project compiles and all tests pass.

## 6. Pull requests

1. Push your feature branch to your fork.
2. Open a Pull Request against the `develop` branch.
3. Explain what you changed and why.
4. Link any related issue.
5. Wait for code review and feedback.

Your contribution may be revised before it is merged.

## 7. Code of conduct

Be respectful, constructive and collaborative.

We want everyone to learn, participate and feel welcome.

## 8. Questions

If you have questions, open a GitHub Issue or start a discussion in the repository.

Thank you for helping improve SnakeJava! 🐍