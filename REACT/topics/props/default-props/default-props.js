class User extends React.Component{

   constructor(props) {
       super(props);
       this.state = {count: props.name};

   }

   render(){
       return (
          <div>
            <span>{this.state.name}</span>
         </div>
       );

   }
}

User.propTypes = { name: React.PropTypes.string };
User.defaultProps = { name: "Praveen" };




ReactDOM.render(
 <User />,
 document.getElementById('example')
);
