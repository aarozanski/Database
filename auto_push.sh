#!/bin/bash

# Directory and Git repository paths
WATCH_DIR="/Users/aidarozanski/IdeaProjects/Database/src/main"
REPO_DIR="/Users/aidarozanski/IdeaProjects/Database"

# Log file path
LOG_FILE="/Users/aidarozanski/IdeaProjects/Database/auto_push.log"

# Function to log messages
log_message() {
  echo "$1" >> "$LOG_FILE"
}

# Navigate to the Git repository directory
cd "$REPO_DIR" || exit

# Start monitoring
while true; do
  changes=$(find "$WATCH_DIR" -type f -mmin -1)
  if [ -n "$changes" ]; then
    git add . && \
    git commit -m "Auto-commit $(date)" && \
    git push origin main && \
    log_message "Changes pushed to GitHub at $(date)." || \
    log_message "Error occurred at $(date)."
  fi
  sleep 60
done
