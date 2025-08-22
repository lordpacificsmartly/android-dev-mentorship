# Lecture Notes: Git & GitHub

## Table of Contents

* [Section 1: Introduction to Git](#section-1-introduction-to-git)

    * [1. What is Git?](#1-what-is-git)
    * [2. Git Concepts](#2-git-concepts)
    * [3. How Git Works](#3-how-git-works)
    * [4. Git vs GitHub](#4-git-vs-github)
    * [5. Installing Git](#5-installing-git)
    * [6. Setting Up Git](#6-setting-up-git)
* [Section 2: Working with Git & GitHub](#section-2-working-with-git--github)

    * [1. Staging Files](#1-staging-files)
    * [2. Commits](#2-commits)
    * [3. Seeing Changes](#3-seeing-changes)
    * [4. Amending Commits](#4-amending-commits)
    * [5. Getting Started with GitHub](#5-getting-started-with-github)
    * [6. Pushing Code to GitHub](#6-pushing-code-to-github)
    * [7. Exploring GitHub](#7-exploring-github)
    * [8. Push & Pull](#8-push--pull)
    * [9. Branches](#9-branches)
* [Section 3: Working with Branches](#section-3-working-with-branches)
* [Section 4: Stash & Rebase](#section-4-stash--rebase)
* [Section 5: Undoing & Reset](#section-5-undoing--reset)
* [Section 6: GitHub Collaboration](#section-6-github-collaboration)
* [Section 7: Advanced Git](#section-7-advanced-git)
* [Section 8: GitHub Actions](#section-8-github-actions)
* [Section 9: Final Project](#section-9-final-project)

---

## Section 1: Introduction to Git

### 1. What is Git?

Git is a **Distributed Version Control System (DVCS).**
Every developer has a full copy of the project’s history on their machine.

**Why it matters:**

* Without Git: multiple confusing file versions (e.g., `final_v3_really_final.docx`).
* With Git: every change is tracked with author, timestamp, and unique ID.

**Key Benefits**

* Revert safely to older versions
* Collaborate without overwriting
* See who changed what and why

---

### 2. Git Concepts

* **Repository (Repo):** A folder tracked by Git
* **Commit:** A snapshot of your changes
* **Branch:** A parallel timeline for development
* **Merge:** Combining branches

**Analogy**

* Repo = library
* Commit = edition of a book
* Branch = spin-off storyline
* Merge = bringing storylines together

---

### 3. How Git Works

Git has three core areas:

1. **Working Directory** → real files you edit
2. **Staging Area (Index)** → waiting room for commits
3. **Repository (.git folder)** → permanent history

**Demo**

```bash
git status
git add file.txt
git commit -m "Initial commit"
```

**Learner Task**

* Create `notes.txt`
* Stage & commit it
* Run `git log`

---

### 4. Git vs GitHub

* **Git** = local tool
* **GitHub** = online platform for sharing & collaborating

**Analogy**

* Git = Microsoft Word
* GitHub = Google Docs

---

### 5. Installing Git

* Download: [git-scm.com](https://git-scm.com)
* Verify:

```bash
git --version
```

---

### 6. Setting Up Git

**Config identity**

```bash
git config --global user.name "Your Name"
git config --global user.email "you@email.com"
```

**Initialize repo**

```bash
mkdir demo-project && cd demo-project
git init
```

**Learner Task**

* Create folder `demo-project`
* Add `README.md`
* Stage & commit

---

## Section 2: Working with Git & GitHub

### 1. Staging Files

Staging = shopping cart for changes.

```bash
git add file.txt
git add .
git reset file.txt
```

**Learner Task:** Create 2 files, stage one, check `git status`.

---

### 2. Commits

Each commit = snapshot with unique SHA ID.
Write clear commit messages.

```bash
git commit -m "Add homepage HTML"
git log
```

**Learner Task:** Make 3 commits with descriptive messages.

---

### 3. Seeing Changes

```bash
git diff          # unstaged
git diff --staged # staged
```

---

### 4. Amending Commits

```bash
git commit --amend -m "Corrected message"
```

---

### 5. Getting Started with GitHub

* Sign up at [github.com](https://github.com)
* Set profile
* Generate SSH keys (optional)

---

### 6. Pushing Code to GitHub

```bash
git remote add origin https://github.com/yourname/repo.git
git branch -M main
git push -u origin main
```

**Learner Task:** Create repo on GitHub, connect, push.

---

### 7. Exploring GitHub

* **Code** = files
* **Commits** = history
* **Branches** = list
* **Pull Requests** = collaboration
* **Issues** = bug tracking

---

### 8. Push & Pull

```bash
git push origin main
git pull origin main
git fetch origin
```

---

### 9. Branches

```bash
git branch feature-login
git checkout feature-login
```

**Quiz:** Which command shows all branches? → `git branch`

---

## Section 3: Working with Branches

**Deleting**

```bash
git branch -d feature
git branch -D old-feature
```

**Merging**

```bash
git checkout main
git merge feature
```

**Conflicts:** Resolve manually → commit fix.

**Force Pull**

```bash
git fetch --all
git reset --hard origin/main
```

**Pull Requests (GitHub):** open PR → review → merge

**Cloning a Repo**

```bash
git clone https://github.com/user/repo.git
```

---

## Section 4: Stash & Rebase

**Stash basics**

```bash
git stash
git stash list
git stash apply
git stash drop
git stash branch bugfix
```

**Rebase**

```bash
git checkout feature
git rebase main
```

---

## Section 5: Undoing & Reset

**Undo file changes**

```bash
git checkout -- file.txt
```

**Reset vs Revert**

* Reset = move HEAD, rewrite history
* Revert = new commit that undoes change

**Reset Modes**

```bash
git reset --soft HEAD~1
git reset --mixed HEAD~1
git reset --hard HEAD~1
```

---

## Section 6: GitHub Collaboration

* **Forking** = copy repo under your account
* **Issues** = bug/feature tracking
* **Discussions** = open-ended community talk

---

## Section 7: Advanced Git

**Log**

```bash
git log --oneline --graph --decorate
```

**Blame**

```bash
git blame file.txt
```

---

## Section 8: GitHub Actions

Automate builds & tests (CI/CD).

**Example workflow** (`.github/workflows/ci.yml`)

```yaml
name: CI
on: [push]
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - run: echo "Hello Actions"
```

---

## Section 9: Final Project

**End-to-End Git/GitHub Workflow**

1. Init repo
2. Commit changes
3. Push to GitHub
4. Create feature branch
5. Open + merge PR
6. Resolve a conflict
7. Use stash + rebase
8. Show clean history with `git log --oneline`

**Deliverable:** GitHub repo link