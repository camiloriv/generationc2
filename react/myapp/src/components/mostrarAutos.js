import React, { Component } from 'react';
import { eliminarAuto } from '../services/autoServices';
class MostrarAutos extends Component {

    render() {
        return (
            <>
                {this.props.objAutos.map(auto =>
                    <div class="card">
                                <div class="card-body">
                                <h5 class="card-title">{auto.marca}</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                <button className="btn btn-sm btn-outline-danger" onClick={() => eliminarAuto(auto.id)}>Eliminar</button>

                            </div>
                    </div>
                )}
            </>
        )
    }

}
export default MostrarAutos;

// 