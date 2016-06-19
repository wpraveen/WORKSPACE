class BioData extends React.Component{

   constructor() {
      super();
     this.state = {liked: false};

     setInterval(function(){

     }.bind(this),2000);
   }

   render(){
       return (
          <div>
            <Name firstName="John" lastName="Dae"/>
            <DateOfBirth dob={new Date("2016-01-08")}/>
         </div>
       );

   }
}


class Name extends React.Component{

    render(){

        return (
            <p>FirstName: {this.props.firstName}</p>
        );
    }
}

class DateOfBirth extends React.Component{

    render(){

        var _dob = this.props.dob;
        return (
            <p>FirstName: {(_dob.getMonth() + 1) + "/" + _dob.getDate() + "/" + _dob.getYear()}</p>
        );
    }
}

ReactDOM.render(
 <BioData />,
 document.getElementById('example')
);
