# Picocli CLI Project

This is a simple command-line interface (CLI) built using [Picocli](https://picocli.info/).

## Features

- A basic CLI with three commands: `projects`, `about-me`, and `music`.
- Subcommands for `projects` supports more options.

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

Or to build jar run

```bash
gradle shadowJar
```

### Run

Run through gradle

```bash
gradle run --args='<command> [options]'
```

Run jar

```bash
java -jar app/build/libs/impact-cli-1.0.all.jar <command> [options]
```

Example usage

```bash
gradle run --args='projects discard'
```

jar

```bash
java -jar app/build/libs/impact-cli-1.0-all.jar projects discard
```
