let submitButton = document.getElementById("submitButton");

submitButton.addEventListener(
  "click",
  (postData = async() => {
    let inputEmail = document.getElementById("inputEmail").value;
    let inputPassword = document.getElementById("inputPassword").value;
    let inputAddress = document.getElementById("inputAddress").value;
    let inputMotivo = document.getElementById("inputMotivo").value;
    
    let request = await fetch("/postConsulta", { 
        method: "POST", 
        credentials: "same-origin", 
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            email: inputEmail,
            password: inputPassword,
            address: inputAddress,
            motivo: inputMotivo,
        }), 
        dataType: "json"
    });

    if(request.ok) {
        console.log("Registro realizado");
        console.log(await request.json());
    }
  })
);

let getButton = document.getElementById("getButton");

getButton.addEventListener("click", getData = async () => {
  let get = await fetch("/getConsulta", {
    method: "GET",
    credentials: "same-origin",
    dataType: "json",
  });
  if (get.ok) {
    let data = await get.json();
    console.log(data.email);
    let emailIn = data.email;
    let passwordIn = data.password;
    let addressIn = data.address;
    let motivoIn = data.motivo;

    document.getElementById("emailIn").innerHTML = emailIn;
    document.getElementById("passwordIn").innerHTML = passwordIn;
    document.getElementById("addressIn").innerHTML = addressIn;
    document.getElementById("motivoIn").innerHTML = motivoIn;
  }
}
);