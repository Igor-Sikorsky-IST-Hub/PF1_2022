# Programming Fundamentals-1 (2022). Project Structure.

[УКР][project_structure_readme_ua] | [ENG][project_structure_readme]

[HOME][this_repo] | [PROJECT STRUCTURE][project_structure_readme]

In order to make your work more organized next format is suggested and strongly asked to follow.

## 1. Create your working directory

After cloning your fork of the discipline repository create a directory for your project:

```cmd
git clone https://github.com/<your nickname>/PF1_2022.git
cd PF1_2022
cd IA-XX
mkdir "Team Y"
cd "Team Y"
```
<br/>

## 2. Follow required structure of your repository
    
Your project's directory content **MUST** follow next structure:

```
Team Y
|- LAB X
   |- src
      |- some_task.java
      |- code_file.java
    |- LAB X (Surname 1, Surname 2, ..., Surname N).pdf   
   
```

- `src`. Contains only files directly connected to the completed assignment. In most cases those are only your code files.
- `LAB X (Surname 1..N)`. The report itself. **MUST** be a **PDF** file.

For example:
```
Team 1
|- LAB 1
   |- src
      |- hello_world.java
   |- LAB 1 (Musk, Jobs, Zuckerberg).pdf
```

[this_repo]: <https://github.com/Igor-Sikorsky-IST-Hub/PF1_2022>
[project_structure_readme]: <project_structure.md>
[project_structure_readme_ua]: <project_structure.ua.md>