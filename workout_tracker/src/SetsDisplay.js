import { useState, useEffect } from "react";
import { useParams } from 'react-router-dom';
import { getAllSets } from "./MuscleService";
import { Link } from "react-router-dom";
import Set from "./Set"

    
const SetsDisplay = ({ exercise, setsList}) =>{


    const setsElements = setsList.map( (set) => {
        return <Set set={set} exerciseName={exercise.name}/>
    })

    return(  

        <table>
            <tr>
                <th scope="col">Exercise</th>
                <th scope="col">Weight</th>
                <th scope="col">Reps</th>
                <th scope="col">Comment</th>
            </tr>
            {setsElements}
        </table>
    )
}

export default SetsDisplay;