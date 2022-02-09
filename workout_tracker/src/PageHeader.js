import { Link } from "react-router-dom"


const PageHeader = () => {
    return (
    <header>
      

     
        <div id="main-header" className="flex-row">
            <h1 className="gymbuddy"> Gym Buddy</h1>
            <div className="page-logo"><Link to = '/'>Home</Link></div>
            <Link to = '/muscles'> Choose a Muscle </Link>
         
            {/* <img src="./gymBuddyLogo" alt="Gym Buddy"/> */}
        </div>
    </header>
    )
}

export default PageHeader