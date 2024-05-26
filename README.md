<h1> Втора лабораториска вежба по Софтверско инженерство </h1>
<h2> Никола Јорданоски 223157</h2>
<h3> Control flow graph (CFG)</h3>
![SI_Lab2_CFG drawio](https://github.com/nikolakoko/SI_2024_lab2_223157/assets/137109502/817d68b3-596a-4bc5-8005-9eb339755a74)
<h3> Цикломатска комплексност</h3>
10
Има 3 начини: <br>
1. број на региони <br>
2. број на ребра - број на јазли + 2 <br>
3. број на предикатни јазли + 2 <br>
<h3> Тест случаи за Every branch</h3>
![Every Branch](https://github.com/nikolakoko/SI_2024_lab2_223157/assets/137109502/7e61e46f-210c-4787-8549-6056f18186fa)
<h3> Тест случаи за Multiple condition за if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0)
== '0')</h3>
![Multiple condition](https://github.com/nikolakoko/SI_2024_lab2_223157/assets/137109502/4b9da748-b930-439f-a191-4238c5b81c85)
<h3>Објаснување на напишани unit test cases</h3>
Ги напишав со користење на @Test нотација и користење на assertions, според тест случаите од претходните 2 барања.
Користам assertThrows за да ги проверам дали се случуваат exceptions за потребните 3 тест случаеви, кои потоа ги споредувам пораките со assertTrue, за дали е исправно фрлен и фатен исклучокот со соодветна порака.
Исто така користам assertTrue и assertFalse за да ги споредам резултатите директно, според посакуваните тест случаеви.


