function confirmar() {
    let msg = document.querySelector(".mult");
    let numero = parseInt(document.querySelector(".numero-tabuada").value);

    msg.innerHTML = "";

    for (let i = 0; i <= 10; i++) {
        let mult = numero * i;
        msg.innerHTML += `${numero} x ${i} = ${mult} <br/>`;
    }


}