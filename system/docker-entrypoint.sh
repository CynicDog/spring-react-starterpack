#!/bin/sh

# Background watcher: looks for .java or .properties changes
while inotifywait -r -e modify /app/src/main/;
do
  echo "🚀 Source change detected! Recompiling..."
  ./gradlew classes -x test --offline
done &

# Start Spring Boot
echo "☕ Starting Spring Boot with Hot Reload..."
./gradlew bootRun