import { useState, useEffect } from "react";
import { useParams } from 'react-router-dom';
import { getExerciseByMuscleID } from "./MuscleService";
import { Link } from "react-router-dom";    
const Exercises = () =>{
    const { id } = useParams();

    const [exercisesList, setExercisesList] = useState([]);

    useEffect(() => { 
        getExerciseByMuscleID(id)
          .then((exercisesList) => setExercisesList(exercisesList));
    }, [])
    const exercisesElements = exercisesList.map( (exercise) => {
     return <li key={exercise.id}><Link to={'/setsform/' + exercise.id}>{exercise.name}</Link></li>
    })

    return(  
        <ul>
            {exercisesElements}
           
        </ul>
    )
}

export default Exercises;
