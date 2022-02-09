import { Link } from "react-router-dom";

const Home = () =>{




    return (
    <div>
        
        <Link className = "begin" to = '/muscles'> Begin workout </Link>
        <p><Link className = "viewHistory" to = "/history">...or view previous workouts</Link></p>
        <p className = "bodybuilding" >You can visit <a href="https://bodybuilding.com"> bodybuilding.com</a> for latest articles on health, diet and fitness</p>
    </div>
    )
  };
  export default Home;