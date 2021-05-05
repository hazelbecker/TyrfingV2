import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';

class Tesu extends React.Component {

    constructor(props) {
        super(props);
        this.state = {message : ">"};
    }

    activateLasers = () => {
        this.setState({
            message : ">==========="
        });
    }

    deactivateLasers = () => {
        this.setState({
            message : ">"
        });
    }

    render() {
        return(
            <div>
                <div>
                    <button onClick={this.activateLasers}>Activate lasers!</button>
                    <button onClick={this.deactivateLasers}>No more lasers...</button>
                </div>
                <div><h2>{this.state.message}</h2></div>
            </div>
        )
    }

}


ReactDOM.render(
    <Tesu />, document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
