function mostrarAlert(element) {
  console.log("Aqui va todo");
  console.log(element);
  window.alert("Click en el elemento con el id" + element.id);
}

function muestraIngreso() {
  var text = document.getElementById("inputPro").value;
  console.log(text);
  window.alert(text);
}

function showConsole() {
  var field1 = document.getElementById("name").value;
  var field2 = document.getElementById("lstName").value;
  var field3 = document.getElementById("addres").value;
  var field4 = document.getElementById("phone").value;

  console.log(field1);
  console.log(field2);
  console.log(field3);
  console.log(field4);
}

function add() {
  var a = Number(document.getElementById("a").value;)
  var b = Number(document.getElementById("b").value;)
  var c = 0;

  if(a<b){
    for(i=0; i<a; i++ ){
    c = c + b;
    }
    window.alert("El resultado es: " + c);
  }
  else{
    for(i=0; i<b; i++ ){
    c = c + a;
    }
    window.alert("El resultado es: " + c);
  }
}

function operacion() {
  var op = document.getElementById("selector").value;
  var a = Number(document.getElementById("a").value);
  var b = Number(document.getElementById("b").value);

  switch (op) {
    case 'sum':
      window.alert(a+b);
      break;
    case 'rest':
      window.alert(a-b);
      break;
    case 'mul':
      window.alert(a*b);
      break;
    case 'div':
      window.alert(a/b);
      break;
    case 'mod':
      window.alert(a%b);
      break;
    default:
      window.alert("Error intenta de nuevo");
  }
}
