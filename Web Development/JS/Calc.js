const firstTextBox = document.getElementById('first');
const secondTextBox = document.getElementById('second');

function add() {

    let a = Number(firstTextBox.value);
    let b = Number(secondTextBox.value);

    var c = a + b;
    alert("RESULT : " + c)
}
function sub() {

    let a = Number(firstTextBox.value);
    let b = Number(secondTextBox.value);

    var c = a - b;
    alert("RESULT : " + c)
}
function mul() {

    let a = Number(firstTextBox.value);
    let b = Number(secondTextBox.value);

    var c = a * b;
    alert("RESULT : " + c)
}
function div() {
    let a = Number(firstTextBox.value);
    let b = Number(secondTextBox.value);

    var c = a / b;
    alert("RESULT : " + c)
}
function pow() {

    let a = Number(firstTextBox.value);
    let b = Number(secondTextBox.value);

    var c = a ** b;
    alert("RESULT : " + c)
}

function fillFirstNumber() {

    const firstTextBox = document.getElementById('first');

}

function fillSecondNumber() {
    const secondTextBox = document.getElementById('second');
}

function onPressDigitButton(val) {



    let firstInput = firstTextBox.value;
    let secondInput = secondTextBox.value;

    console.log(firstInput + ' : ' + secondInput);

    alert(val);

}