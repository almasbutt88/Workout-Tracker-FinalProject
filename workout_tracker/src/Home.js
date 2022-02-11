import { Link } from "react-router-dom";
import Motivation from "./Motivation";
import dumbbell2 from "./images/dumbell.png"
import history from "./images/history.png"

const Home = () =>{




    return (
    <>
        <h4 className="welcome"> What would you like to do today? </h4>
       <div  className = "begindiv">
        <Link className = "begin" to = '/muscles'> Begin workout </Link>
        <Link className = "dumbell"to = '/muscles'><img src={dumbbell2} width="50"/></Link>
        
        </div>
        <div className = "historyBlock">
        <p><Link className = "viewHistory" to = "/history">View previous workouts</Link></p>
        <p><Link className = "viewHistoryIcon" to = "/history"><img src={history} width="30"/></Link></p>
       </div>
       <div className = "low">
        <p> Feeling low? </p>
        <p> Need motivation? </p>
    
        </div>
        <Link className="motivationLink" to="/motivation"> YES!! FEED ME RAW ROCKET FUEL!!! </Link>

        <p className = "bodybuilding" >You can visit <a href="https://bodybuilding.com"> bodybuilding.com</a> for latest articles on health, diet and fitness</p>
    
    
    
    
    </>
    )
  };
  export default Home;