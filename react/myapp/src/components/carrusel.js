import React, { Component } from 'react';
import Carousel from 'react-bootstrap/Carousel';

class Carrusel extends Component {
    render() {

        return (
            <Carousel>
                <Carousel.Item>
                    <img
                        className="d-block w-100"
                        src="https://www.japonalternativo.com/wp-content/uploads/2021/09/Ruta-Tokio-en-1-dia.jpg"
                        alt="First slide"
                    />
                    <Carousel.Caption>
                        <h3>{this.props.texto1}</h3>
                        <p>$1.000</p>
                    </Carousel.Caption>
                </Carousel.Item>
                <Carousel.Item>
                    <img
                        className="d-block w-100 imagen"
                        src="https://historia.nationalgeographic.com.es/medio/2019/12/11/coliseo-roma_2924b6ae_1280x720.jpg"
                        alt="Second slide"
                    />

                    <Carousel.Caption>
                        <h3>ROMA</h3>
                        <p>$3.000</p>
                    </Carousel.Caption>
                </Carousel.Item>
                <Carousel.Item>
                    <img
                        className="d-block w-100 imagen"
                        src="https://viajes.nationalgeographic.com.es/medio/2019/03/14/hamnoy_37e20075_1280x720.jpg"
                        alt="Third slide"
                    />

                    <Carousel.Caption>
                        <h3>NORUEGA</h3>
                        <p>$5.000</p>
                    </Carousel.Caption>
                </Carousel.Item>
            </Carousel>
        );

    }
}

export default Carrusel;