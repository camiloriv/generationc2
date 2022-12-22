import React,{Component} from "react";
class Ejemplo extends Component{
    // onBlur() y onChange() onClick() => eventos sinteticos

    //STATE => estado
    constructor(props){
        super(props);
        this.state = {
            encendido:"on",
            num: 0
        }
    }
    cambiarEstado = () => {
        //realizar el cambio
        this.state.encendido === "on" ? this.setState({encendido:"off"}) : this.setState({encendido:"on"});
    }
    sumarUno = ()=>{
        this.setState({num : this.state.num + 1})
    }

    restart = () => {
        this.setState({num : 0})
    }

    render(){
        return(
            <>
            <p>Estado de luz: {this.state.encendido}</p>
            <p>Numero: {this.state.num}</p>
            <button onClick={this.cambiarEstado} className="btn btn-primary"> Click Aqui</button>
            <button onClick={this.sumarUno} className="btn btn-primary"> SUMALE</button>
            <button onClick={this.restart} className="btn btn-primary"> Comienza denuevo</button>
            </>
        );
    }
}

export default Ejemplo;
