import { Link } from "react-router-dom"

const PageHeader = () => {
    return (
    <header>
      
        <div id="main-header" className="flex-row">
            <h1> Your Workout-Tracker</h1>
            <div id="page-logo"><Link to = '/'>Home</Link></div>
         
            <nav id="nav-bar">Nav bar</nav>
        </div>
    </header>
    )
}

export default PageHeader