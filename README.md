# twinkle-cli
CLI for configuring the Twinkle shiny server

## Development

Can be run locally with `./gradlew :run --args="[ARGS]"`

A future branch will add running the compiled CLI in docker.

Args should specify a command first then the args for the command. 

Use `./gradlew :run --args="-h"` to see available commands or `./gradlew :run --args="[COMMAND] -h"`
to see usage for a command.

## Linting=

Run detekt linting with `./gradlew :detekt`