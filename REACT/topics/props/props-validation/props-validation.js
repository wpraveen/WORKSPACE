class BioData extends React.Component{

   constructor() {
      super();
     this.state = {liked: false};

     setInterval(function(){

     }.bind(this),2000);
   }

/*
 * {"praveen"} will work fine but we will get error in {12}
 */
   render(){
       return (
          <div>
            <Name firstName={12} lastName="Dae"/>
         </div>
       );

   }
}


class Name extends React.Component{

    render(){
        return (
            <div>
                <p>FirstName: {this.props.firstName}</p>
                <p>LastName: {this.props.lastName}</p>
            </div>
        );
    }
}

Name.propTypes = {
    firstName: React.PropTypes.string.isRequired,
    lastName: React.PropTypes.string,
}


ReactDOM.render(
 <BioData />,
 document.getElementById('example')
);
