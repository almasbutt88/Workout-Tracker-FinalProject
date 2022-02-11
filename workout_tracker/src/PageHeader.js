import { Link } from "react-router-dom"
import Timer from "./Timer"
import headericon from "./images/headericon2.png"
import history from "./images/history.png"



const PageHeader = () => {
    return (
    <header>
      

     
        <div id="main-header" className="flex-row">
            <h1 className="gymbuddy"> Gym Buddy <img src={headericon} width="70" /></h1>
           

            <div className="page-logo"><Link to = '/'>Home</Link></div>
            <Link to = '/muscles'> Choose Muscle </Link>
         <Timer/>
        </div>
    </header>
    )
}

export default PageHeader