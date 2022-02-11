import { useState, useEffect } from "react";
import { useParams } from 'react-router-dom';
import { getAllSets } from "./MuscleService";
import { Link } from "react-router-dom";
import Set from "./Set"
import { removeSetByID } from "./MuscleService";


    
const SetsDisplay = ({setsList, deleteSet}) =>{



    const setsElements = setsList.map( (set) => {
        return <Set set={set} exerciseName={set.exercise.name} deleteSet={deleteSet}/>
    })


   
    return(  
        <div>
        <table>
            <tr>
                <th scope="col">Exercise</th>
                <th scope="col">Weight</th>
                <th scope="col">Reps</th>
                <th scope="col">Comment</th>
                <th scope="col">Delete</th>
            </tr>
            {setsElements}
        </table>
        
        
        </div>
    )
}

export default SetsDisplay;