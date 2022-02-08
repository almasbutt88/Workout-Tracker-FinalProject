import { useState } from "react";
import Home from "./Home";
import SetsForm from "./SetsForm";

const Workout = ()=>{
const [displaySet, setDisplaySet] = useState([]);

    return(
<div>

<Home/>

<h1> Workout</h1>

<h3>Workout Date</h3>

<h3> Exercise Name </h3> 

<SetsForm displaySet={displaySet}/>
</div>
    )
}

export default Workout;