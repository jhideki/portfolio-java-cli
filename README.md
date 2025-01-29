# Picocli CLI Project

This is a simple command-line interface (CLI) built using [Picocli](https://picocli.info/).

## Features

- A basic CLI with three commands: `projects`, `about-me`, and `music`.
- Supports subcommands for `projects` with more options.

## Requirements

- Java 8 or later
- Gradle 6.0 or later

## Getting Started

### Clone the repository

```bash
git clone https://github.com/jhideki/portfolio-java-cli.git
cd portfolio-java-cli
```
### Build
```bash
gradle build
```

### Run
```bash
gradle run --args='<command> [options]'
```
Example
```bash
gradle run --args='projects discard'
```

