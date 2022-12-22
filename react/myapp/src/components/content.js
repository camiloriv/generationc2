import React,{Component} from 'react';
import Carrusel from './carrusel';

class Content extends Component{
    render(){

        return(
            <div className='content'>
                <Carrusel texto1={this.props.text1}/>
            </div>
        )
    }
}

export default Content;