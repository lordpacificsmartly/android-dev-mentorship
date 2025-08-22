# Android Dev Mentorship

Welcome. This repo is the home base for our mentorship. 
We keep it simple: short lessons, exercises, and branches for each topic. 
We’re kicking off with Kotlin and Git, but more tracks (like coroutines, Android, etc.) will land here soon.

Everything lives on **branches**. Pick a branch for the track you want.

---

## What’s where

- **main**  
  You’re here. Short overview and pointers.

- **kotlin-basics**
  Hands-on Kotlin lessons. Each module is small enough to run quickly, but still teaches you something useful.

- **git-lecture-notes**  
  Notes and short Git exercises. Just enough to make Git click without drowning you in theory.

> More branches will show up later (e.g. `kotlin-coroutines`). Same idea, same structure.

---

## How to look around

### Quickest way (on GitHub)
1) Click the branch dropdown (top left of the repo).
2) Switch to the track you want (`kotlin-basics` or `git-lecture-notes`).
3) Open that branch’s `README.md` first. It tells you what to run or read.

### If you want to work locally
```bash
git fetch --all
git checkout kotlin-basics        # Kotlin lessons
# or
git checkout git-lecture-notes    # Git notes & exercises
```

## How we work here

Rule #1: keep main clean.
Do your work on the branch for that track — or spin off a feature branch from it.

### Example flow for a Kotlin assignment:
git checkout kotlin-basics
git pull
git checkout -b feat/module2-assignment
# ...make changes...
git add .
git commit -m "feat: complete module 2 assignments"
git push -u origin feat/module2-assignment
Then open a pull request back to kotlin-basics.

- **Commit messages can be simple:** 
  feat: → new lesson or solution
  fix: → patch or bug fix
  docs: → updates to notes, readmes, or docs

That’s all you need.