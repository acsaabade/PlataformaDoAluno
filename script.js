function login() {
    let usuario = document.getElementById("usuario").value;
    let senha = document.getElementById("senha").value;
    if (!usuario || !senha) {
      alert("Usuário e senha são obrigatórios.");
    } else if (usuario === "e2etreinamentos" && senha === "e2e@123") {
      window.location.href = "bemvindo.html";
    }else{
      alert("Usuário ou senha inválidos")
    }
  }
