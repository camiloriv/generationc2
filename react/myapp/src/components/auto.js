import React, { useState, useEffect } from 'react';
import { getAllAutos } from '../services/autoServices';
import MostrarAutos from './mostrarAutos';

const autosInit = [{
    id: 1,
    marca: "",
    color: "",
    usuario: {}
}]
const AutoComponent = () => {
    const [autos, setAutos] = useState(autosInit);
    const obtenerAutos = async () => {
        setAutos(await getAllAutos());
    }
    //useEffecto: ejectura una funcion segun el momento de ciclo de vida
    useEffect(() => { obtenerAutos() }, []);
    
    return (
        <MostrarAutos objAutos = {autos}/>
        );
}
export default AutoComponent;