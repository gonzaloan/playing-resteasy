# RestEasy test project




## Pre-commit

1- Install pre commit with Pip:

```$ pip install pre-commit```

2- The hooks used in this projects are located in .pre-commit-config.yaml file in the root of the project.

```
repos:
  - repo: https://github.com/pre-commit/pre-commit-hooks
    rev: v2.7.0
    hooks:
      - id: check-added-large-files
      - id: end-of-file-fixer
      - id: trailing-whitespace
  - repo: https://github.com/tokuhirom/pre-commit-findbugs
    rev: v1.1.0
    hooks:
      - id: findbugs
  - repo: https://github.com/tokuhirom/pre-commit-pmd
    rev: v1.1.0
    hooks:
      - id: pmd
```

In this particular example we have 2 hooks:

**check-added-large-files**: Check for larger files in the repo
**trailing-whitespace**: Check and fix empty spaces at the end of files.


3- First time using the commit, you need to run
```$ pre-commit install```

4- You're ready to go :)
Use https://pre-commit.com/ to check available hooks or revisions :)
