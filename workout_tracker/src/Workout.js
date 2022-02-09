import { useState } from "react";
import Home from "./Home";
import SetsForm from "./SetsForm";

const Workout = ()=>{
    const [setList, setSetList] = useState([])

   
  

    return (
        <>
            <h1>Sets List</h1>
            <SetsForm/>
            
        </>
    )
}

export default Workout;