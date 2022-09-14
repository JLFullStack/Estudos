let
    msg = document.querySelector(".result"),
    numeros = [];

function adicionar() {
    msg.innerHTML = "";

    n_variavel = Number(document.querySelector(".numeros-variavel").value);

    //adiciona número na última posição do vetor
    numeros.push(n_variavel);

    //forma JS mais nova de correr as posições de um vetor
    for (let i in numeros) { //lê-se a posição i do vetor numeros

        msg.innerHTML += `a posição ${i} = ${numeros[i]} <br/>`;


        /*forma tradicional de correr as posições do vetor
        for (let i = 0; i < numeros.length; i++) {
            msg.innerHTML += `a posição ${i} = ${numeros[i]} <br/>`;
        }
        */
    }
}