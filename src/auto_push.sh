#!/bin/bash

# Directory to monitor (change this to the path of your directory)
WATCH_DIR="/Users/aidarozanski/IdeaProjects/Database"

# Git repository directory
REPO_DIR="/Users/aidarozanski/IdeaProjects/Database"


# Go to the Git repository directory
cd "$REPO_DIR" || exit

# Start the monitoring loop
while true; do
  # Find files modified within the last 1 minute
  changes=$(find "$WATCH_DIR" -type f -mmin -1)

  # If there are any changes, add, commit, and push them to GitHub
  if [ -n "$changes" ]; then
    # Add all modified files
    git add .

    # Commit with a timestamp
    git commit -m "My auto-commit for java projects: $(date)"

    # Push to GitHub
    git push origin main

    # Print a confirmation message
    echo "Changes have been pushed to GitHub at $(date)."
  fi

  # Wait for 1 minute before checking again
  sleep 60
done