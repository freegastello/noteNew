document.addEventListener('DOMContentLoaded', function () {

  document.querySelector('#color').addEventListener('mousedown', () => {
    printForEachElement();
  });

  document.querySelector('#but1').addEventListener('mousedown', () => {
    insertStyle();
  });

  document.querySelector('#but2').addEventListener('mousedown', () => {
    removeStyle();
  });

  document.querySelector('#but3').addEventListener('mousedown', () => {
    toggleStyle();
  });


}, false);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

function insertTable(list) {


// Внутри: 222 -> 444 -> 333 -> 222 -> 111

// before      – вставляет узлы или строки до node;          - Перед элементом
// prepend     – вставляет узлы или строки в начало node;    - Внутри сразу после выбранного элемента(перед вторым внутренним)
// append      – вставляет узлы или строки после node;       - Внутри самый последний у конца выбранного элемента(перед последним внутренним)
// after       – вставляет узлы или строки после node;       - После выбранного элемента
// replaceWith – заменяет node заданными узлами или строками.-


  // Вариант вставки:
  // const p = document.createElement('p');
  // p.id = 'this333';
  // p.innerHTML = '333';
  // insTable.append(p);


  // list.forEach(e => insTable.append(e));//
  // list.forEach(e => console.log(e));// В консоль выводит идеально


  // var newElem = document.createElement('table');
  // newElem.id = 'myTable';
  // // insTable.append(newElem);
  //
  // var newRow;
  // for (var i = 0; i < list.length; i++) {
  //   debugger;
  //   newRow = newElem.insertRow(i);
  //   for (var j = 0; j < 1; j++) {
  //     debugger;
  //     var newCell = newRow.insertCell(i);
  //     newCell.innerHTML = list[i].id;
  //     newCell.innerHTML = list[i].name;
  //   }
  // }
  // insTable.append(newElem);


  // var tbody = document.querySelector('myTable');

  // let html = '<table>';
  // for(var i = 0; i < list.length; i++)
  // {
  //   var tr = document.createElement('tr');
  //   tr.innerHTML =
  //     '<td>' + list[i].id + '</td>' +
  //     '<td>' + list[i].name + '</td>';
  //   html += tr;
  // }
  // html += '</table>';
  // // insTable.append(html);
  // document.getElementById('insertTable').innerHTML=html;


  // // Создание таблицы - работает:
  // var newElem = document.createElement('table');
  // var newRow = newElem.insertRow(0);
  // var newCell = newRow.insertCell(0);
  // newCell.innerHTML = list[0].name;
  // var newCell = newRow.insertCell(1);
  // newCell.innerHTML = list[1].name;
  // insTable.append(newElem);



  // // Варианты вставок:
  // const p7 = document.createElement('p');
  // p7.id = 'this777';
  // p7.innerHTML = '777';
  // insertTable.after(p7);// Снаружи внизу
  //
  //   //
  // const p3 = document.createElement('p');
  // p3.id = 'this333';
  // p3.innerHTML = '333';
  // // insertTable.parentNode.append(p3);// внутри аналог 222
  // insertTable.append(p3);// Внутри самый последний
  //
  // // Это аналогично 333
  // const p2 = document.createElement('p');
  // p2.id = 'this222';
  // p2.innerHTML = '222';
  // insertTable.appendChild(p2);// // Внутри самый последний аналог 333
  //
  // //
  // const p9 = document.createElement('p');
  // p9.id = 'thisAppendChild';
  // p9.innerHTML = 'appendChild';
  // insertTable.parentNode.appendChild(p9);// Самый конец документа
  //
  // //
  // const p4 = document.createElement('p');
  // p4.id = 'this444';
  // p4.innerHTML = '444';
  // insertTable.prepend(p4);// Внутри самый первый
  //
  // //
  // const p5 = document.createElement('p');
  // p5.id = 'this555';
  // p5.innerHTML = '555';
  // insertTable.before(p5);// Перед выбранным элементом
  //
  // //
  // const p = document.createElement('p');
  // p.id = 'this111';
  // p.innerHTML = 'insertBefore';
  // insertTable.parentNode.insertBefore(p, insertTable);// Вставка перед выбранным документом

}


// function createTable(tbody, list) {
function createTable(list) {
  const insertTable = document.querySelector('#insertTable');
  var table = document.createElement('table');
  table.id = 'tableCreate';

  // table.setAttribute('border', '5');//Можно и так добавлять атрибуты. Но лучше через CSS
  //table.border=5;                    //Можно и так добавлять атрибуты. Но лучше через CSS

  var thead = document.createElement('thead');
  thead.setAttribute('id','theadBook');

  var tbody = document.createElement('tbody');
  tbody.setAttribute('id','contayner');

  table.append(thead);
  table.append(tbody);
  insertTable.append(table);


  var thtr = document.createElement('tr');
  var thId = document.createElement('td');
  var thCreateDate = document.createElement('td');
  var thCreateTime = document.createElement('td');
  var thLastSaveDate = document.createElement('td');
  var thLastSaveTime = document.createElement('td');
  var thName = document.createElement('td');
  var thYear = document.createElement('td');

  thId.innerText = 'id';
  thCreateDate.innerText = 'Дата открытия';
  thCreateTime.innerText = 'Время открытия';
  thLastSaveDate.innerText = 'Дата посл. изм.';
  thLastSaveTime.innerText = 'Время  посл. изм.';
  thName.innerText = 'Наименование';
  thYear.innerText = 'Год';

  thtr.appendChild(thId);
  thtr.appendChild(thCreateDate);
  thtr.appendChild(thCreateTime);
  thtr.appendChild(thLastSaveDate);
  thtr.appendChild(thLastSaveTime);
  thtr.appendChild(thName);
  thtr.appendChild(thYear);

  thead.appendChild(thtr);

  list.forEach(function(items) {
    var tr = document.createElement('tr');
    var tdId = document.createElement('td');
    var tdCreateDate = document.createElement('td');
    var tdCreateTime = document.createElement('td');
    var tdLastSaveDate = document.createElement('td');
    var tdLastSaveTime = document.createElement('td');
    var tdName = document.createElement('td');
    var tdYear = document.createElement('td');

    tdId.innerText = items.id;
    tdCreateDate.innerText = items.createDate;
    tdCreateTime.innerText = items.createTime;
    tdLastSaveDate.innerText = items.lastSaveDate;
    tdLastSaveTime.innerText = items.lastSaveTime;
    tdName.innerText = items.name;
    tdYear.innerText = items.year;

    tr.appendChild(tdId);
    tr.appendChild(tdCreateDate);
    tr.appendChild(tdCreateTime);
    tr.appendChild(tdLastSaveDate);
    tr.appendChild(tdLastSaveTime);
    tr.appendChild(tdName);
    tr.appendChild(tdYear);

    tbody.appendChild(tr);
  });
}


// Замена класса
// Вариант 1:
function insertStyle() {
  const insertElem = document.getElementById('ttt');
  insertElem.classList.add('wrap');
}

function removeStyle() {
  const removeElem = document.getElementById('ttt');
  removeElem.classList.remove('wrap');
}

function toggleStyle() {
  const toggleElem = document.getElementById('ttt');
  toggleElem.classList.toggle('toggle');
}


// Вариант 2:
function printForEachElement() {
  const arrayBoxes = document.querySelectorAll('.box');

  // Можно так:
  // arrayBoxes.forEach(function(el){
  //   console.log(el.tagName);//DIV
  //   console.log(el.className);//box
  //   console.log(el.textContent);//Рассветка текста 1, Рассветка текста 2, Рассветка текста 3
  // });

  // И так можно:
  arrayBoxes.forEach(function (item, i, arrayBoxes) {
    console.log(i + ": " + item.textContent);//0: Рассветка текста 1, 1: Рассветка текста 2, 2: Рассветка текста 3
    arrayBoxes[i].classList.toggle('toggle');
  });
}










