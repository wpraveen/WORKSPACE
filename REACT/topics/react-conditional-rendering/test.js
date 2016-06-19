class Two extends React.Component {

    render() {
        return (
            <div>
                I am two
            </div>
        );

    }
}

class One extends React.Component {

    render() {
        return (
            <div>
                I am One
            </div>
        );

    }
}

class Main extends React.Component {

    constructor(props) {
        super(props);

        this.state = {};

    }

    show(flag) {

        console.log("In show: ", flag);
        this.setState({flag});

    }

    renderSection() {

        if(this.state.flag){
            if (this.state.flag === "one") {
                return (<One/>);
            } else {
                return (<Two/>);
            }
        }


    }

    renderButtons() {
        if(!this.state.flag){
            return (
                <div>
                    <button onClick={() => this.show("one")}>Show One</button>
                    <button onClick={() => this.show("two")}>Show Two</button>
                </div>
            )
        }


    }

    render() {
        return (
            <div>
                {this.renderButtons()}
                {this.renderSection()}
            </div>
        );

    }
}

ReactDOM.render(
    <Main/>, document.getElementById('example'));
