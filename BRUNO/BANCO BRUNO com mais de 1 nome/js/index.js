//VARIAVEL PARA AUTORIZAÇÃO
erroNome = 0
errocpf = 0
errodate = 0
erroemail = 0
errocep = 0
errorua = 0
erronumero = 0
errotel = 0
errotitulo = 0
preencha = 0

tudo = new Array
//VALORES GRAVADOS NOS INPUTS
function salvar(){
    let nome = ("Name: "+ document.getElementById("nome").value +"\n"  )
    if (nome == ("Name: "+"\n") ) {
        preencha++
        erroNome++
        
    }else{
        erroNome = 0
    }
    let cpf = ("cpf: "+ document.getElementById("cpf").value + "\n") 
    if (cpf == ("cpf: "+"\n") ) {
        preencha++
        errocpf++
        
    }else{
        errocpf = 0
    }
    let date = ("Data aniversário: "+ document.getElementById("daten").value + "\n")
    if (date == ("Data aniversário: "+"\n") ) {
        preencha++
        errodate++
        
    }else{
        errodate = 0
    }
    let email = ("Email: "+document.getElementById("email").value + "\n")
    if (email == ("Email: "+"\n") ) {
        preencha++
        erroemail++
        
    }else{
        erroemail = 0
    }
    let cep = ("CEP: "+document.getElementById("cep").value + "\n")
    if (cep == ("CEP: "+"\n") ) {
        preencha++
        errocep++
        
    }else{
        errocep = 0
    }
    let rua = ("Rua: "+document.getElementById("rua").value + "\n")
    if (rua == ("Rua: "+"\n") ) {
        preencha++
        errorua++
        
        
    }else[
        errorua = 0
    ]
    let numero = ("Número de contato: "+document.getElementById("number").value + "\n")
    if (numero == ("Número de contato: "+"\n") ) {
        preencha++
        erronumero++
        
    }else{
        erronumero = 0
    }
    let tel = ("Telefone de contato: "+document.getElementById("telefone").value + "\n")
    if (tel == ("Telefone de contato: "+"\n") ) {
        preencha++
        errotel++
        
    }else{
        errotel = 0
    }


    if (preencha > 0) {
        alert("Preencha todos os campos.")
    }
    
    
    //CÓDIGO QUE JUNTA TUDO PARA PODER SALVAR NO ARQUIVO .TXT
    
    
    //PARTE QUE DISPONIBILIZA DOWNLOAD
    geral =  nome + cpf+date+email+cep+rua+numero+tel+("------------------------\n\n")
    tudo.push(geral)
    
    
    

    
}

function baixar(){
    //NOME DO ARQUIVO
    let titulo = document.getElementById("titulo").value
    if (titulo == "") {
        errotitulo++
        preencha++
    }
    erroGeral = parseInt(erroNome+errocep+errocpf+errodate+erroemail+errorua+erronumero+errotel)
    if (erroGeral == 0) {
        let blob = new Blob([tudo],
            {
                type: "text/plain;charset-utf-8"
            });
            
        saveAs( blob, titulo + ".txt")
        
    }
}



//PARTE QUE FAZ A LEITURA DE UM ARQUIVO ARMAZENADO NO PC DO USUÁRIO E QUE COLOCARÁ TUDO NA DIV
function leitura(){
    var fileSelected = document.getElementById('filee');
    var fileExtension = /text.*/;
   var fileTobeRead = fileSelected.files[0];
   if (fileTobeRead.type.match(fileExtension)){
       var fileReader = new FileReader();
   fileReader.onload = function (e) {
    
       var fileContents = document.getElementById('textf');
       fileContents.innerText = fileReader.result;
   }
   fileReader.readAsText(fileTobeRead); 
   }else{
    alert("Por favor selecione arquivo texto");
   }


}


    
