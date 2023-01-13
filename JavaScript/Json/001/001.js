function estudosJson() {
    const funcionarios = [{
            nome: "Lucas Araújo",
            idade: 31,
            sexo: "masculino",
            estado_civil: "casado",
            data_nascimento: "1991-09-02 22:00:00", // Objetos do tipo data não são permitidos em arquivos JSON. Para incluir uma data, é necessário converte-la para uma string.
            profissao: "programador de computador",
            detalhes_empresa: {
                nome_empresa: "Prefeitura de Praia Grande",
                cidade_local: "Praia Grande"
            },
            estudos: ["HTML5", "CSS3", "Java Script"]
        },

        {
            nome: "André Alcântara",
            idade: 40,
            sexo: "masculino",
            estado_civil: "casado",
            data_nascimento: "1984-02-26 15:35:00",
            profissao: "programador de computador",
            detalhes_empresa: {
                nome_empresa: "Prefeitura de Praia Grande",
                cidade_local: "Praia Grande"
            },
            estudos: ["Clean Arctecture, APIs"]
        }
    ];

    //JSON
    // conversão de objeto para tipo Json válido (Serialização) - utilizado para envio de arquivo
    const jsonData = JSON.stringify(funcionarios);

    console.log("Serialização de objeto:");
    console.log(typeof (jsonData));
    console.log(jsonData);

    console.log("");

    // conversão do arquivo Json válido para um objeto (Desserialização) - utilizado para consumo de arquivo
    const objData = JSON.parse(jsonData);

    console.log("Arquivo JSON desserializado: ");
    console.log(typeof (objData));
    console.log(objData);

    console.log("");

    // trabalhando com objetos consumidos do arquivo Json (modelo 01 de manipulação)
    console.log("Modelo 01 de manipulação do arquivo JSON desserializado: ");

    for (let i = 0; i < objData.length; i++) {
        const funcionario = objData[i];
        console.log("Nome: " + funcionario.nome);
        console.log("Sexo: " + funcionario.sexo);
        console.log("Idade: " + funcionario.idade);
        console.log("Estudos: " + funcionario.estudos);

        console.log("");
    }

    console.log("");

    // trabalhando com objetos consumidos do arquivo Json (modelo 02 de manipulação)
    console.log("Modelo 02 de manipulação do arquivo JSON desserializado: ");

    objData.map((funcionario) => {
        console.log("Nome: " + funcionario.nome);
        console.log("Sexo: " + funcionario.sexo);
        console.log("Idade: " + funcionario.idade);
        console.log("Estudos: " + funcionario.estudos);

        // É possível converter um objeto JSON, que contêm uma data em formato string, novamente em um formato data:
        funcionario.data_nascimento = new Date(funcionario.data_nascimento);
        console.log("Data de Nascimento: " + funcionario.data_nascimento);

        console.log("");
    })

    // Está conversão de tipo também é necessária para guardar datas em JSON.
    console.log("Conversão do tipo de arquivos:");  
    var data = new Date("1991-09-02 22:00:00");
    console.log(data);

    var dataString = new String(data);
    console.log(dataString);

    data = new Date(dataString);

    console.log(data);

}
estudosJson();