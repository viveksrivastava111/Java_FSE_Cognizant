import React from 'react';

class Counter extends React.Component {
    constructor(props) {
        super(props);
        this.state = { count: 5 };

        this.handleIncrement = this.handleIncrement.bind(this);
        this.handleDecrement = this.handleDecrement.bind(this);
        this.sayHello = this.sayHello.bind(this);
        this.sayWelcome = this.sayWelcome.bind(this);
        this.handleClick = this.handleClick.bind(this);
    }

    handleIncrement() {
        this.setState({ count: this.state.count + 1 });
        this.sayHello();
    }

    handleDecrement() {
        this.setState({ count: this.state.count - 1 });
    }

    sayHello() {
        alert("Hello! Member1");
    }

    sayWelcome(message) {
        alert(message);
    }

    handleClick(event) {
        alert("I was clicked");
    }

    render() {
        return (
            <div>
                <p>{this.state.count}</p>
                <button onClick={this.handleIncrement}>Increment</button>
                <br />
                <button onClick={this.handleDecrement}>Decrement</button>
                <br />
                <button onClick={() => this.sayWelcome("welcome")}>Say welcome</button>
                <br />
                <button onClick={this.handleClick}>Click on me</button>
            </div>
        );
    }
}

export default Counter;
