#!/bin/bash

# Stage all changes
git add --all

# Capture the commit message from command line arguments
commit_message="$*"

# Commit with the captured message
git commit -m "$commit_message"

# Push the changes
git push
