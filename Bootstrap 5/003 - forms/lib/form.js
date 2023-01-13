function validarFormularioDeLogin() {
    const
        grupoEmail = document.querySelector("#grupo-email-form-Login"),
        campoEmail = document.querySelector("#campo-email-form-Login"),
        grupoSenha = document.querySelector("#grupo-senha-form-Login"),
        campoSenha = document.querySelector("#campo-senha-form-Login"),
        msgEmail = document.querySelector("#menssagem-email-invalido-form-Login"),
        msgSenha = document.querySelector("#menssagem-senha-invalida-form-Login");

    // if (window.PointerEvent || window.InputEvent) {
    //     const btn = document.querySelector("#btn-entrar-form-login");

    //     btn.addEventListener("click", () => {
    //         const clickEvent = new MouseEvent ('click', {
    //             PointerEvent: true
    //         })

    //         btn.dispatchEvent(clickEvent);
    //     });
    // }

    consumirArquivoDeUsuario(campoEmail.value, campoSenha.value);

    let situacaoUsuario = consumirArquivoDeUsuario.value;

    if (situacaoUsuario != "usuario cadastrado") {
        event.preventDefault();
        event.stopPropagation();

        validarCampo("email", "invalido");
        validarCampo("senha", "invalido");
        campoEmail.setAttribute('oninput', 'validarFormularioDeLogin()');
        campoSenha.setAttribute('oninput', 'validarFormularioDeLogin()');

        //expressão regular para validação de email 
        const
            emailRegExp = /^(\w+)@[a-z]+(\.[a-z]+){1,2}$/i,
            emailExp = emailRegExp.test(campoEmail.value);

        //validação de email
        if (campoEmail.value == "") {
            msgEmail.innerHTML = "preencha este campo.";
        } else if (emailExp == false) {
            msgEmail.innerHTML = "formato de email inválido.";
        } else if (emailExp == true && situacaoUsuario == "email não cadastrado") {
            msgEmail.innerHTML = "email não cadastrado.";
        } else if (emailExp == true) {
            validarCampo("email", "valido");
        }

        //validação de senha
        if (campoSenha.value == "") {
            msgSenha.innerHTML = "preencha este campo.";
        } else if (campoEmail.value == "" && campoSenha.value != "") {
            msgSenha.innerHTML = "preencha o campo de email.";
        } else if (situacaoUsuario == "senha invalida") {
            msgSenha.innerHTML = "senha invalida";
        }
    }

    function validarCampo(campo, situacao) {
        if (campo == "email") {
            if (situacao == "valido") {
                campoEmail.classList.add("is-valid");
                grupoEmail.classList.add("is-valid");
                campoEmail.classList.remove("is-invalid");
                grupoEmail.classList.remove("is-invalid");
            } else if (situacao == "invalido") {
                campoEmail.classList.add("is-invalid");
                grupoEmail.classList.add("is-invalid");
                campoEmail.classList.remove("is-valid");
                grupoEmail.classList.remove("is-valid");
            }
        }

        if (campo == "senha") {
            if (situacao == "valido") {
                campoSenha.classList.add("is-valid");
                grupoSenha.classList.add("is-valid");
                campoSenha.classList.remove("is-invalid");
                grupoSenha.classList.remove("is-invalid");
            } else if (situacao == "invalido") {
                campoSenha.classList.add("is-invalid");
                grupoSenha.classList.add("is-invalid");
                campoSenha.classList.remove("is-valid");
                grupoSenha.classList.remove("is-valid");
            }
        }
    };
};

function consumirArquivoDeUsuario(campoEmail, campoSenha) {
    const jsonData = new XMLHttpRequest();

    //abre o arquivo JSON
    jsonData.open("GET", "lib/form.json");

    jsonData.onload = function () {

        // Desserialização da string JSON
        const usersData = JSON.parse(this.responseText);

        let situacaoUsuario;

        //varre o objeto usersData para manipulação dos dados
        const sweep = usersData.map((usuario) => {
            if (usuario.email == campoEmail && usuario.senha == campoSenha) {
                situacaoUsuario = "usuario cadastrado";
            } else if (usuario.email == campoEmail && usuario.senha != campoSenha) {
                situacaoUsuario = "senha invalida";
            } else if ((usersData.find(el => el.email == campoEmail)) == undefined) {
                situacaoUsuario = "email não cadastrado";
            }
        });

        consumirArquivoDeUsuario.value = situacaoUsuario;
    };

    jsonData.send();
};