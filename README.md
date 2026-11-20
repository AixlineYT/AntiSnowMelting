# AntiSnowMelting

A lightweight Paper plugin that prevents snow blocks and snow layers from melting naturally, even when exposed to high light levels.

## Features

- Prevents natural melting of snow blocks.
- Prevents natural melting of snow layers.
- Protects naturally generated and player-placed snow.
- Keeps existing snow-layer heights unchanged when melting is prevented.
- Can be enabled or disabled while the server is running.
- Only targets snow-related block fade events; it does not intentionally cancel unrelated block events.

## Compatibility

- **Platform:** Paper
- **Minecraft:** 1.21.x (intended compatibility; test on the exact server versions you support)
- **Java:** 21

The plugin uses Bukkit/Paper's block fade event rather than version-specific NMS code. Compatibility still depends on the API version used to compile the JAR.

## Installation

1. Download the latest `AntiSnowMelting` JAR from the project's Releases page.
2. Stop your Paper server.
3. Place the JAR in your server's `plugins` folder.
4. Start the server.
5. Use the commands below to enable or disable protection.

## Commands

| Command | Description |
|---|---|
| `/antisnowmelting toggle on` | Enable snow-melting protection. |
| `/antisnowmelting toggle off` | Disable snow-melting protection. |

The toggle command is restricted to server operators.

## Building from source

### Requirements

- Java Development Kit (JDK) 21
- Gradle (use the included Gradle Wrapper, if present)

### Build

On Windows:

```bat
gradlew.bat clean build
```

On Linux or macOS:

```bash
./gradlew clean build
```

The compiled plugin JAR is generated in:

```text
build/libs/
```

Copy the JAR into your Paper server's `plugins` folder to install it.

## How it works

Minecraft can naturally remove snow and snow layers through block-fade behavior when light conditions are high enough. AntiSnowMelting listens for `BlockFadeEvent` and cancels the event for snow-related block materials while protection is enabled. Other block-fade events are left alone.

## Contributing

Bug reports and suggestions are welcome. When reporting an issue, include:

- Your Minecraft version
- Your Paper build number
- Your Java version
- The plugin version
- Any relevant server log output

## License

Copyright (c) 2026 Aixline / Aixline Labs. All Rights Reserved.

You may not use, copy, modify, or redistribute this project without prior explicit permission from the copyright owner. Permission may be granted individually in writing.
