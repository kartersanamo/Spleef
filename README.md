# Spleef (WIP)

A Minecraft Spleef plugin project built with Maven.

## Current State

This repository currently contains:

- Core plugin entry point: `src/main/java/com/kartersanamo/spleef/Spleef.java`
- Command framework and admin subcommands under:
  - `src/main/java/com/kartersanamo/spleef/commands`
  - `src/main/java/com/kartersanamo/spleef/commands/admin`
- API-style interfaces/events/enums under:
  - `src/main/java/com/kartersanamo/spleef/api`
- Plugin resources/config:
  - `src/main/resources/plugin.yml`
  - `src/main/resources/config.yml`
  - `src/main/resources/spleef_maps.yml`

The project appears to be in active development, with map/game management features being scaffolded.

## Project Structure

```text
src/
  main/
    java/com/kartersanamo/spleef/
      Spleef.java
      api/
      commands/
      spleefmap/
    resources/
      plugin.yml
      config.yml
      spleef_maps.yml
```

## Build

Use Maven from the project root:

```bash
mvn clean package
```

If successful, the plugin JAR will be generated in:

```text
target/
```

## Run (Spigot/Paper)

1. Build the plugin JAR.
2. Copy the generated JAR from `target/` into your server's `plugins/` folder.
3. Start/restart the server.

## Commands (as currently organized)

Base command:

- `/spleef`

Admin-related subcommands are represented by classes in:

- `CreateMapSubCommand`
- `SetBoundsSubCommand`
- `SetLayerSubCommand`
- `ForceStartSubCommand`
- `ForceEndSubCommand`
- `KickSubCommand`
- `SaveMapsSubCommand`
- `ReloadSubCommand`

> Note: Exact command syntax/permissions should match `plugin.yml` and command class implementations.

## Notes

- This README is intentionally brief and reflects the current repository layout.
- As gameplay logic is completed, you can expand this file with:
  - full command usage
  - permissions
  - game lifecycle/state flow
  - configuration reference
  - map setup guide
