# Основи програмування-1. Структура проєкту.

[УКР][project_structure_readme_ua] | [ENG][project_structure_readme]

[ГОЛОВНА][this_repo] | [СТРУКТУРА ПРОЄКТУ][project_structure_readme]

З метою підвищення організації вашої роботи запроваджується наступний формат, якого слід строго дотримуватися.

## 1. Створіть робочу папку команди

Після клонування вашого форку репозиторію предмету створіть директорію для вашого проєкту:

```cmd
git clone https://github.com/<your nickname>/PF1_2022.git
cd PF1_2022
cd IA-XX
mkdir "Team Y"
cd "Team Y"
```
<br/>

## 2. Дотримуйтесь вказаної структури папок

Вміст директорії вашого репозиторію **ПОВИНЕН** відповідати наступній структурі:

```
Team Y
|- LAB X
   |- src
      |- some_task.java
      |- code_file.java
    |- LAB X (Surname 1, Surname 2, ..., Surname N).pdf   
   
```

- `src`. Містить лише файли, які безпосередньо пов'язані з виконаним завданням. У більшості випадків це файли з кодом.
- `LAB X (Surname 1..N)`. Власне сам звіт. **ПОВИНЕН** бути у форматі **PDF**.

Приклад типової структури:
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