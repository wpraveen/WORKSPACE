class Stage extends React.Component{

   render(){

       debugger
       return (
          <div>
             {this.props.children}
         </div>
       );

   }
}

class Header extends React.Component{

   render(){
       return (
          <div>
               {this.props.children}

         </div>
       );

   }
}


class Body extends React.Component{

   render(){
       return (
          <div>
              {this.props.children}
         </div>
       );

   }
}


ReactDOM.render(
 <Stage>
<Header> <h1> I am header</h1></Header>
<Body><p>I am sample paragraph</p></Body>
</Stage>
     ,
 document.getElementById('example')
);
