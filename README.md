# Route-Planner

Route Planner — это консольное Java-приложение, которое позволяет находить маршрут между двумя адресами, используя API OpenRouteService (ORS) и геокодирование через OpenStreetMap (OSM). Программа рассчитывает расстояние, продолжительность маршрута и выводит пошаговые инструкции для передвижения.

## Особенности
- Геокодирование адресов с помощью OpenStreetMap (OSM).
- Построение маршрута на основе API OpenRouteService (ORS).
- Расчёт расстояния и времени маршрута.
- Вывод пошаговых инструкций для следования по маршруту.

## Требования
- Java версии 11 или выше.
- Подключение к интернету.
- Зарегистрированный API-ключ OpenRouteService.

## Установка
1. Склонируйте репозиторий:
   ```bash
   git clone https://github.com/ваш-аккаунт/route-planner.git
   cd route-planner

## Скомпилируйте проект:
 ```bash
mvn clean install
```

Убедитесь, что в файле Main.java указан ваш API-ключ ORS:
 ```bash
private static final String ORS_API_KEY = "ваш_ключ";
```
После запуска программа запросит у вас два адреса: начальный и конечный.

## Демонстрация
Убедитесь, что проект собран и готов к запуску.
Введите корректные адреса начальной и конечной точки.
Проверьте вывод программы с подробными шагами маршрута.
## Замечания
Для работы приложения требуется активный интернет.
Если адреса введены некорректно или не найдены, программа выдаст сообщение об ошибке.
Все расчёты производятся в метрах и секундах.


# Пример ввода:
Введите начальный адрес: Красная площадь, Москва
Введите конечный адрес: Эрмитаж, Санкт-Петербург
-------------------------------

Расстояние: 706386.0 м.
Продолжительность маршрута: 27193.2 сек.
-------------------------------
Дистанция: 834.9 м.
Продолжительность: 113.3 сек.
Инструкция: Head south on Красная площадь
-------------------------------
Дистанция: 219.3 м.
Продолжительность: 30.1 сек.
Инструкция: Turn right onto Болотная улица
-------------------------------
Дистанция: 481.8 м.
Продолжительность: 53.6 сек.
Инструкция: Keep left onto Болотная улица
-------------------------------
Дистанция: 1067.7 м.
Продолжительность: 131.6 сек.
Инструкция: Turn right onto улица Серафимовича
-------------------------------
Дистанция: 569.3 м.
Продолжительность: 94.8 сек.
Инструкция: Keep right onto Моховая улица
-------------------------------
Дистанция: 2918.1 м.
Продолжительность: 374.8 сек.
Инструкция: Continue straight onto Моховая улица
-------------------------------
Дистанция: 1118.9 м.
Продолжительность: 102.2 сек.
Инструкция: Turn right onto Лесная улица
-------------------------------
Дистанция: 5970.0 м.
Продолжительность: 657.9 сек.
Инструкция: Turn left onto Новослободская улица
-------------------------------
Дистанция: 675733.7 м.
Продолжительность: 24531.1 сек.
Инструкция: Keep right
-------------------------------
Дистанция: 4648.3 м.
Продолжительность: 185.5 сек.
Инструкция: Keep left onto «Нева», М-11
-------------------------------
Дистанция: 4825.8 м.
Продолжительность: 264.7 сек.
Инструкция: Keep right
-------------------------------
Дистанция: 4974.1 м.
Продолжительность: 295.1 сек.
Инструкция: Keep right
-------------------------------
Дистанция: 31.1 м.
Продолжительность: 7.5 сек.
Инструкция: Keep left onto Воздухоплавательная улица
-------------------------------
Дистанция: 281.3 м.
Продолжительность: 32.8 сек.
Инструкция: Continue straight onto Ново-Рыбинская улица
-------------------------------
Дистанция: 1093.5 м.
Продолжительность: 144.6 сек.
Инструкция: Continue straight onto Черниговская улица
-------------------------------
Дистанция: 536.0 м.
Продолжительность: 58.4 сек.
Инструкция: Turn right onto набережная Обводного канала
-------------------------------
Дистанция: 187.5 м.
Продолжительность: 29.0 сек.
Инструкция: Keep left
-------------------------------
Дистанция: 501.0 м.
Продолжительность: 50.6 сек.
Инструкция: Turn left onto Звенигородская улица
-------------------------------
Дистанция: 393.5 м.
Продолжительность: 35.4 сек.
Инструкция: Turn right onto улица Правды
-------------------------------
Дистанция: 0.0 м.
Продолжительность: 0.0 сек.
Инструкция: Arrive at улица Правды, on the right

Process finished with exit code 0
