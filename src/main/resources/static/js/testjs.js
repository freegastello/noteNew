//Запуск js состоится после загрузки всей страницы - START
document.addEventListener('DOMContentLoaded', function() {

// //001.Страбавтывает при щелчке мышью в любом месте страницы
// addEventListener("click", function() {
//   console.log("Щёлк!");
// });

///////////////////////////////////////////////////////////////////////////////////////////////////
// //002.Нажимай кнопку -v- для смены фона
// addEventListener("keydown", function(event) {
//   if (event.key === 'v' || event.key === 'V' || event.key === 'м' || event.key === 'М')
//     document.body.style.background = "violet";
// });
// addEventListener("keyup", function(event) {
//   if (event.key === 'v' || event.key === 'V' || event.key === 'м' || event.key === 'М')
//     document.body.style.background = "";
// });

///////////////////////////////////////////////////////////////////////////////////////////////////
// //003.Смотреть какая кнопка мыши нажата
// const button = document.querySelector("p");
// button.addEventListener("mousedown", function(event) {
//   const eventButton = event.button;
//   if (eventButton === 0)
//     console.log("Левая(0)");
//   else if (eventButton === 1)
//     console.log("Средняя(1)");
//   else if (eventButton === 2)
//     console.log("Правая(2)");
//   else if (eventButton === 3)
//     console.log("Кнопка назад(3)");
//   else if (eventButton === 4)
//     console.log("Кнопка вперёд(4)");
// });

///////////////////////////////////////////////////////////////////////////////////////////////////
// //004.Получаем доступ к первому -p-, срабатывает при наведениии(тип Hover)
// const p = document.querySelector('p');
// p.addEventListener('mouseenter', () => {
//   console.log('Hover The Cursor');
// });
// // Получаем доступ к первому -p-, срабатывает при убирании курсора
// const pLeave = document.querySelector('p');
// pLeave.addEventListener('mouseleave', () => {
//   console.log('Leave The Cursor');
// });

///////////////////////////////////////////////////////////////////////////////////////////////////
// //005.Получение значения Input при нажатии на кнопку
// var butt = document.querySelector("#btn");
// butt.addEventListener("click", function(event) {
//   var inpu = document.querySelector("#inp").value;
//   // var inpu = document.querySelector('input[type="text"]:valid').value;
//   console.log("Фигушки." + inpu);
//   event.preventDefault();

  // $.ajax({
  //   type:'get',//тип запроса: get,post либо head
  //   url:'/all/{id}',//url адрес файла обработчика
  //   contentType: 'application/json; charset=utf-8',
  //   data:{'id':'123'},//параметры запроса
  //   // data: JSON.stringify(param),
  // });

// });

///////////////////////////////////////////////////////////////////////////////////////////////////
// //006.Пишет текст с элемента на котором нажали кнопкой мыши
// addEventListener("mousedown", function(event) {
//   console.log("Щёлк!", event.target.textContent);
// });

///////////////////////////////////////////////////////////////////////////////////////////////////
//007.



///////////////////////////////////////////////////////////////////////////////////////////////////



///////////////////////////////////////////////////////////////////////////////////////////////////




//Запуск js состоится после загрузки всей страницы - END
}, false);