import { Link } from "react-router-dom";
import Motivation from "./Motivation";
import dumbbell2 from "./images/dumbell.png"
import history from "./images/history.png"

const Home = () =>{




    return (
    <>
        <h4> What would you like to do today? </h4>
       <div  className = "begindiv">
        <Link className = "begin" to = '/muscles'> Begin workout </Link>
        <Link className = "dumbell"to = '/muscles'><img src={dumbbell2} width="50"/></Link>
        
        </div>
        <p><Link className = "viewHistory" to = "/history"><img src={history} width="20"/>View previous workouts</Link></p>
        <p className = "bodybuilding" >You can visit <a href="https://bodybuilding.com"> bodybuilding.com</a> for latest articles on health, diet and fitness</p>
        <p className = "direneed">Or if you are in dire need of motivation, tell me you really need motivation: </p>
        
        <Link className="motivationLink" to="/motivation"> I really need motivation! </Link>
    
    
    
    
    </>
    )
  };
  export default Home;