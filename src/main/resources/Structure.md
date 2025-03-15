## 🛠️ Пошаговое создание структуры проекта в IntelliJ IDEA с Maven

### Шаг 1: Создание Maven-проекта

1. Откройте IntelliJ IDEA.
2. Нажмите **File → New → Project**.
3. Выберите **Maven** в левом меню.
4. Убедитесь, что выбран шаблон **quickstart**.
5. Укажите:
   - **GroupId**: `ru.praktikum`
   - **ArtifactId**: `library`
   - **Version**: Оставьте по умолчанию (например, `1.0-SNAPSHOT`).
6. Нажмите **Finish**.

---

### Шаг 2: Создание пакетов и классов

1. **Создайте пакет `ru.praktikum`**: 
   - Внутри `ru.praktikum` создайте пакеты:
      - `model`
      - `model.constants`
      - `service`

2. **Создайте классы**:
   - В пакете `ru.praktikum.model` создайте классы:
      - `Book.java` (абстрактный класс).
      - `FictionBook.java`.
      - `TextBook.java`.
      - `Discountable.java` (интерфейс).
   - В пакете `ru.praktikum.model.constants` создайте классы:
      - `Discount.java`.
      - `Genre.java`.
      - `Subject.java`.
   - В пакете `ru.praktikum.service` создайте класс:
      - `Library.java`.
   - В корне `ru.praktikum` создайте класс:
      - `Main.java`.

---

### Шаг 3: Наполнение проекта кодом

1. Реализуйте созданные ранее классы 
---

### Шаг 4: Запуск проекта

1. Откройте класс `Main.java`.
2. Нажмите **Run** (зеленая стрелка) или используйте сочетание клавиш **Shift + F10**.
3. Убедитесь, что программа работает.