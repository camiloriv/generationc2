import { useState } from "react";

function Ejemplo2(){
    const [texto,setTexto] = useState("este es el texto");
    function cambiarTexto(){
        setTexto("texto modificado");
    };
    return(

        <>
        <p>{texto}</p>
        <input type="text" className="form-control" value={texto}></input>
        <button onClick={cambiarTexto} className="btn btn-primary">Modifica el texto</button>

        </>
    );
}
export default Ejemplo2;