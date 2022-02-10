import { Link } from "react-router-dom"
import Timer from "./Timer"


const PageHeader = () => {
    return (
    <header>
      

     
        <div id="main-header" className="flex-row">
            <h1 className="gymbuddy"> Gym Buddy</h1>
            <div className="page-logo"><Link to = '/'>Home</Link></div>
            <Link to = '/muscles'> Choose a Muscle </Link>
         <Timer/>
            {/* <img src="./gymBuddyLogo" alt="Gym Buddy"/> */}
        </div>
    </header>
    )
}

export default PageHeader