#   <center>**Итоговая контрольная работа по блоку специализация**</center> <br> <br> 


## **Информация о проекте**
 - Необходимо организовать систему учета для питомника в котором живут домашние и Pack animals. 

## **Как сдавать проект?** 
- Для сдачи проекта необходимо создать отдельный общедоступный репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом репозитории, использовать пул реквесты на изменения. Программа должна запускаться и работать, ошибок при выполнении программы быть не должно. Программа, может использоваться в различных системах, поэтому необходимо разработать класс в виде конструктора 
<br>
<br>

<hr>

# <center>**Описание задания**<center>


 > ## **1.Операционные системы и виртуализация (Linux)**
 >> ### **1.1. Использование команды cat в Linux**
>>  - Создать два текстовых файла: "Pets"(Домашние животные) и "Pack animals"(вьючные животные), используя команду `cat` в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором — лошадей, верблюдов и ослов.
>>  - Объединить содержимое этих двух файлов в один и просмотреть его содержимое.
>>  - Переименовать получившийся файл в "Human Friends"(.
Пример конечного вывода после команды “ls” :
Desktop Documents Downloads  HumanFriends.txt  Music  PackAnimals.txt  Pets.txt  Pictures  Videos.
>>* * ### **Решение**
>> * * ![Task_1.1](https://github.com/Allacrit/FinalCertificationSpecialist/blob/master/src/Images/Task_1.1.PNG)

>> ### **1.2. Работа с директориями в Linux**
>>   - Создать новую директорию и переместить туда файл "Human Friends".
>>* * ### **Решение**
>> * * ![Task_1.2](https://github.com/Allacrit/FinalCertificationSpecialist/blob/master/src/Images/Task_1.2.PNG)

>> ### **1.3. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину”**
>>   - Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.
>>* * ### **Решение**
>> * * ![Task_1.3](https://github.com/Allacrit/FinalCertificationSpecialist/blob/master/src/Images/Task_1.3.PNG)

>> ### **1.4. Управление deb-пакетами**
>>  - Установить и затем удалить deb-пакет, используя команду `dpkg`.
>> * * ![Task_1.4](https://github.com/Allacrit/FinalCertificationSpecialist/blob/master/src/Images/Task_1.4.PNG)
>> ### **1.5. История команд в терминале Ubuntu**
>>   - Сохранить и выложить историю ваших терминальных команд в Ubuntu.
>> * * ### **Файлы с командами к заданиям**
>> * * * [1.1. Использование команды cat в Linux](https://github.com/Allacrit/FinalCertificationSpecialist/blob/master/src/txt/Task_1.1.txt)
>> * * * [1.2. Работа с директориями в Linux](https://github.com/Allacrit/FinalCertificationSpecialist/blob/master/src/txt/Task_1.2.txt)
>> * * * [1.3. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину”](https://github.com/Allacrit/FinalCertificationSpecialist/blob/master/src/txt/Task_1.3.txt)
>> * * * [1.4. Управление deb-пакетами](https://github.com/Allacrit/FinalCertificationSpecialist/blob/master/src/txt/Task_1.4.txt)

<br> <br>

> ## **2.Объектно-ориентированное программирование**
>> ### 2.1 Диаграмма классов
>>   - Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".
В составы классов которых в случае Pets войдут классы: собаки, кошки, хомяки, а в класс Pack animals войдут: Лошади, верблюды и ослы).
Каждый тип животных будет характеризоваться (например, имена, даты рождения, выполняемые команды и т.д)
Диаграмму можно нарисовать в любом редакторе, такими как Lucidchart, Draw.io, Microsoft Visio и других.
>>* * ### **Решение**
>> * * ![Task_2.1](https://github.com/Allacrit/FinalCertificationSpecialist/blob/master/src/Images/Task_2.1.png)

>> ### 2.2. Работа с MySQL.
>>> #### 2.2.1. После создания диаграммы классов в 2.1 пункте, в 2.2 пункте база данных "Human Friends" должна быть структурирована в соответствии с этой диаграммой. Например, можно создать таблицы, которые будут соответствовать классам "Pets" и "Pack animals", и в этих таблицах будут поля, которые характеризуют каждый тип животных (например, имена, даты рождения, выполняемые команды и т.д.). 
>>>
>>>   ### **Решение**
>>> 
>>>
>>> ```
>>> CREATE DATABASE HumanFriends; 
>>>
>>> USE HumanFriends;
>>>
>>>CREATE TABLE animals
>>>(
>>>	Id INT AUTO_INCREMENT PRIMARY KEY,  
>>>	Animal_class VARCHAR(50)
>>> );
>>>
>>> INSERT INTO animals (Animal_class)
>>> VALUES ('pets'),
>>> ('pack animals');  
>>> 
>>> CREATE TABLE pets
>>> (
>>> 	Id INT AUTO_INCREMENT PRIMARY KEY,
>>>     Pet_class VARCHAR (50),
>>>     Animal_id INT,
>>>    FOREIGN KEY (Animal_id) REFERENCES animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
>>> );
>>> 
>>> INSERT INTO pets (Pet_class, Animal_id)
>>> VALUES ('Dog', 1),
>>> ('Cat', 1),  
>>> ('Hamster', 1); 
>>> 
>>> CREATE TABLE pack_animals
>>> (
>>> 	Id INT AUTO_INCREMENT PRIMARY KEY,
>>>     Pack_animal_class VARCHAR (50),
>>>    Animal_id INT,
>>>    FOREIGN KEY (Animal_id) REFERENCES animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
>>> );
>>>
>>> INSERT INTO pack_animals (Pack_animal_class, Animal_id)
>>> VALUES ('Horse', 2),
>>> ('Camel', 2),  
>>> ('Donkey', 2); 
>>>     
>>> 
>>> CREATE TABLE dogs
>>> (       
>>>    Id INT AUTO_INCREMENT PRIMARY KEY, 
>>>    Name VARCHAR(50), 
>>>    Birthday DATE,
>>>    Commands VARCHAR(50),
>>>    Pet_id int,
>>>    Foreign KEY (Pet_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
>>> );
>>>
>>> CREATE TABLE cats
>>> (       
>>>    Id INT AUTO_INCREMENT PRIMARY KEY, 
>>>    Name VARCHAR(50), 
>>>    Birthday DATE,
>>>    Commands VARCHAR(50),
>>>    Pet_id int,
>>>    Foreign KEY (Pet_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
>>> );
>>>
>>> CREATE TABLE hamsters
>>> (       
>>>    Id INT AUTO_INCREMENT PRIMARY KEY, 
>>>    Name VARCHAR(50), 
>>>    Birthday DATE,
>>>    Commands VARCHAR(50),
>>>    Pet_id int,
>>>    Foreign KEY (Pet_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
>>>);
>>>
>>>CREATE TABLE horses
>>>(       
>>>    Id INT AUTO_INCREMENT PRIMARY KEY, 
>>>    Name VARCHAR(50), 
>>>    Birthday DATE,
>>>    Commands VARCHAR(50),
>>>    Pack_animal_id int,
>>>    Foreign KEY (Pack_animal_id) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
>>> );
>>>
>>>CREATE TABLE camels
>>> (       
>>>    Id INT AUTO_INCREMENT PRIMARY KEY, 
>>>    Name VARCHAR(50), 
>>>    Birthday DATE,
>>>    Commands VARCHAR(50),
>>>    Pack_animal_id int,
>>>    Foreign KEY (Pack_animal_id) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
>>> );
>>>
>>> CREATE TABLE donkeys
>>> (       
>>>    Id INT AUTO_INCREMENT PRIMARY KEY, 
>>>    Name VARCHAR(50), 
>>>    Birthday DATE,
>>>    Commands VARCHAR(50),
>>>    Pack_animal_id int,
>>>    Foreign KEY (Pack_animal_id) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
>>>);
>>> ```
>>
>>> #### 2.2.2   - В ранее подключенном MySQL создать базу данных с названием "Human Friends".
>>>   - Создать таблицы, соответствующие иерархии из вашей диаграммы классов.
>>>   - Заполнить таблицы данными о животных, их командах и датами рождения.
>>>   ### **Решение**
>>> ```
>>> INSERT INTO dogs (Name, Birthday, Commands, Pet_id)
>>> VALUES ('Рэкс', '2022-11-21', 'фас, дай лапу, cидеть, голос', 1),
>>> ('Барбос', '2018-03-05', 'лежать, ко мне', 1),  
>>> ('Альма', '2019-06-19', 'сидеть, лежать, лапу, след', 1);
>>> 
>>> INSERT INTO cats (Name, Birthday, Commands, Pet_id)
>>> VALUES ('Муся', '2015-09-04', 'Муся', 2),
>>> ('Лея', '2020-10-22', "Лея, брысь", 2),  
>>> ('Кисель', '2020-03-03', NULL, 2); 
>>> 
>>> INSERT INTO hamsters (Name, Birthday, Commands, Pet_id)
>>> VALUES ('Буся', '2020-03-15', NULL, 3),
>>> ('Люся', '2022-08-12', "Люся", 3),  
>>> ('Зина', '2023-01-11', NULL, 3);
>>> 
>>> INSERT INTO horses (Name, Birthday, Commands, Pack_animal_id)
>>> VALUES ('Зорька', '2018-11-01', 'рысь, хоп, шагом, тихо', 1),
>>> ('Гром', '2019-06-19', 'хоп, тише', 1),  
>>> ('Ветер', '2023-02-22', 'шагом, тише', 1); 
>>> 
>>> INSERT INTO camels (Name, Birthday, Commands, Pack_animal_id)
>>> VALUES ('Вася', '2021-12-16', NULL, 2),
>>> ('Рокки', '2017-06-02', 'Рокки', 2),  
>>> ('Патрик', '2013-02-22', 'Патрик ко мне', 2);
>>> 
>>> INSERT INTO donkeys (Name, Birthday, Commands, Pack_animal_id)
>>> VALUES ('Иа', '2016-04-30', NULL, 3),
>>> ('Смелый', '2021-09-22', 'Cмелый ко мне', 3),  
>>> ('Семен', '2019-01-18', 'шагом, Семен', 3);
>>> ```
>>>   - Удалить записи о верблюдах и объединить таблицы лошадей и ослов.
>>>   ### **Решение**
>>> ```
>>> SET SQL_SAFE_UPDATES = 0;
>>> DELETE FROM camels;
>>> 
>>> SELECT Name, Birthday, Commands FROM horses
>>> UNION ALL SELECT  Name, Birthday, Commands FROM donkeys;
>>> ```
>>>   - Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.
>>>   ### **Решение**
>>> ```
>>> CREATE TEMPORARY TABLE all_animals AS
>>>    SELECT *, 'Собаки' as class FROM dogs
>>>    UNION SELECT *, 'Кошки' AS class FROM cats
>>>    UNION SELECT *, 'Хомяки' AS class FROM hamsters
>>>    UNION SELECT *, 'Лошади' AS class FROM horses
>>>    UNION SELECT *, 'Ослы' AS class FROM donkeys;
>>> 
>>> CREATE TABLE young_animals AS
>>> SELECT Name, Birthday, Commands, class, TIMESTAMPDIFF(MONTH, Birthday, CURDATE()) AS Age_in_month
>>> FROM all_animals WHERE Birthday BETWEEN ADDDATE(curdate(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(),INTERVAL -1 YEAR);
>>> ```
>>>
>>>   - Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.
>>>   ### **Решение**
>>> ```
>>> SELECT h.Name, h.Birthday, h.Commands, pa.Pack_animal_class, ya.Age_in_month 
>>> FROM horses h
>>> LEFT JOIN young_animals ya ON ya.Name = h.Name
>>> LEFT JOIN pack_animals pa ON pa.Id = h.Pack_animal_id
>>> UNION 
>>> SELECT d.Name, d.Birthday, d.Commands, pa.Pack_animal_class, ya.Age_in_month 
>>> FROM donkeys d 
>>> LEFT JOIN young_animals ya ON ya.Name = d.Name
>>> LEFT JOIN pack_animals pa ON pa.Id = d.Pack_animal_id
>>> UNION
>>> SELECT c.Name, c.Birthday, c.Commands, p.Pet_class, ya.Age_in_month 
>>> FROM cats c
>>> LEFT JOIN young_animals ya ON ya.Name = c.Name
>>> LEFT JOIN pets p ON p.Id = c.Pet_id
>>> UNION
>>> SELECT d.Name, d.Birthday, d.Commands, p.Pet_class, ya.Age_in_month 
>>> FROM dogs d
>>> LEFT JOIN young_animals ya ON ya.Name = d.Name
>>> LEFT JOIN pets p ON p.Id = d.Pet_id
>>> UNION
>>> SELECT hm.Name, hm.Birthday, hm.Commands, p.Pet_class, ya.Age_in_month 
>>> FROM hamsters hm
>>> LEFT JOIN young_animals ya ON ya.Name = hm.Name
>>> LEFT JOIN pets p ON p.Id = hm.Pet_id;
>>> ```
>> ### 2.3. Java
>>   - Создать иерархию классов в Java, который будет повторять диаграмму классов созданную в задаче 2.1 (Диаграмма классов).
>> ### 2.4. Программа-реестр домашних животных
>>> * Написать программу на Java, которая будет имитировать реестр домашних животных. 
Должен быть реализован следующий функционал:
>>> * * Добавление нового животного
>>> * * * Реализовать функциональность для добавления новых животных в реестр.       
Животное должно определяться в правильный класс (например, "собака", "кошка", "хомяк" и т.д.)        
>>>  * * Список команд животного
>>> * * * Вывести список команд, которые может выполнять добавленное животное (например, "сидеть", "лежать").
>>> * *  Обучение новым командам
>>> * * * Добавить возможность обучать животных новым командам.
>>> * *  Вывести список животных по дате рождения
>>> * *  Навигация по меню
>>> * * *  Реализовать консольный пользовательский интерфейс с меню для навигации между вышеуказанными функциями.
>>> * * Счетчик животных
>>> * * * Создать механизм, который позволяет вывести на экран общее количество созданных животных любого типа (Как домашних, так и вьючных), то есть при создании каждого нового животного счетчик увеличивается на “1”.
>>   ### **Решение**
>> ## [Программа работы с животными](https://github.com/Allacrit/FinalCertificationSpecialist/blob/master/src/txt/Task_1.4.txt)
<br>
<br>
<hr>

 # КОНЕЦ


