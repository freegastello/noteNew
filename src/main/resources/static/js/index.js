document.addEventListener('DOMContentLoaded', function () {

// Щёлкни по любой части экрана
  addEventListener("click", function () {
    console.log("Щёлк!");
  });


//01.Тестирование отправки GET AJAX запроса
// Данные для передачи на сервер допустим id товаров и его количество
  const button = document.querySelector('#gettest');
  button.addEventListener('mousedown', () => {
    let id_product  = 111;
    let qty_product = 222;
// Создаём объект класса XMLHttpRequest
    const request = new XMLHttpRequest();
    /*  Составляем строку запроса и кладем данные, строка состоит из:
    пути до файла обработчика ? имя в GET запросе где будет лежать значение запроса id_product и
    через & мы передаем количество qty_product. */
    const url = "/gettest?id_product=" + id_product + "&qty_product=" + qty_product;
    /* Здесь мы указываем параметры соединения с сервером, т.е. мы указываем метод соединения GET,
    а после запятой мы указываем путь к файлу на сервере который будет обрабатывать наш запрос. */
    request.open('GET', url);
// Указываем заголовки для сервера, говорим что тип данных, - контент который мы хотим получить должен быть не закодирован.
    request.setRequestHeader('Content-Type', 'application/x-www-form-url');
// Здесь мы получаем ответ от сервера на запрос, лучше сказать ждем ответ от сервера
    request.addEventListener("readystatechange", () => {
      /*   request.readyState - возвращает текущее состояние объекта XHR(XMLHttpRequest) объекта,
      бывает 4 состояния 4-е состояние запроса - операция полностью завершена, пришел ответ от сервера,
      вот то что нам нужно request.status это статус ответа,
      нам нужен код 200 это нормальный ответ сервера, 401 файл не найден, 500 сервер дал ошибку и прочее...   */
      if (request.readyState === 4 && request.status === 200) {
        // выводим в консоль то что ответил сервер
        console.log(request.responseText);
      }
    });
// Выполняем запрос
    request.send();
  });


  //02.Тестирование отправки POST AJAX запроса
  const button2 = document.querySelector('#posttest');
  button2.addEventListener('mousedown', () => {
    let id_post_1 = "321";
    let id_post_2 = "456";
    // Создаем экземпляр класса XMLHttpRequest
    const request = new XMLHttpRequest();
    // Указываем путь до файла на сервере, который будет обрабатывать наш запрос
    const url = "/posttest";
    // Так же как и в GET составляем строку с данными, но уже без пути к файлу
    // const params = "text=" + id_post_1 + "&twoparametr=" + id_post_2;
    /* Указываем что соединение	у нас будет POST, говорим что путь к файлу в переменной url, и что запрос у нас
    асинхронный, по умолчанию так и есть не стоит его указывать, еще есть 4-й параметр пароль авторизации, но этот
      параметр тоже необязателен.*/
    request.open("POST", url, true);
    // В заголовке говорим что тип передаваемых данных закодирован.
    request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    request.addEventListener("readystatechange", () => {
      if (request.readyState === 4 && request.status === 200) {
        console.log(request.responseText);
      }
    });
    // Вот здесь мы и передаем строку с данными, которую формировали выше. И собственно выполняем запрос.
    // request.send(params);
    request.send();
  });


  //03.Тестирование отправки Json AJAX запроса - шляпа, лучше просто POST зпрос отправлять
  // Данные для передачи на сервер например	id товаров и его количество
  const button3 = document.querySelector('#jsontest');
  button3.addEventListener('mousedown', () => {
    let id_product  = 999;
    let qty_product = 777;
    // принцип	тот же самый что и у обычного POST	запроса
    const request = new XMLHttpRequest();
    const url = "/jsontest";
    const params = "id_product=" + id_product + "&qty_product=" + qty_product;
    // Здесь нужно указать в каком формате мы будем принимать данные вот и все	отличие
    // request.responseType = "json";
    request.open("POST", url, true);
    request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    request.addEventListener("readystatechange", () => {
      if (request.readyState === 4 && request.status === 200) {
        // let obj = request.response;// так всё выводит сплошным текстом
        const list = eval("(" + request.responseText + ")");// Обязательно обрабатывать!!!
        // insertTable(obj);
        // createTable(document.getElementById('contayner'), list);

        createTable(list);

        // console.log(list);

        // // Здесь мы можем обращаться к свойству объекта и получать	его значение
        // console.log(list.id_product);
        // console.log(list.qty_product);
      }
    });
    request.send(params);
  });


  // Нажимай кнопку -v- для смены фона
  addEventListener("keydown", function (event) {
    if (event.key === 'v' || event.key === 'V' || event.key === 'м' || event.key === 'М')
      document.body.style.background = "violet";
  });
  addEventListener("keyup", function (event) {
    if (event.key === 'v' || event.key === 'V' || event.key === 'м' || event.key === 'М')
      document.body.style.background = "";
  });


}, false);