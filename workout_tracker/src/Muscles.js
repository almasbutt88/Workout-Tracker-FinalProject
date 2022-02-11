import Exercises from "./Exercises";
import { useState, useEffect } from "react";
import { getExerciseByMuscleID } from "./MuscleService";
import { Link } from "react-router-dom";


const Muscles = () =>{
    
    const [muscles, setMuscles] = useState([]);

    useEffect(() =>{
        fetchMuscles();
    }, []);
    
    const fetchMuscles = async() =>{
        const data = await fetch('http://localhost:8080/muscles')
        const muscles = await data.json();
        setMuscles(muscles);
    };

  const renderedMuscles = muscles.map((muscle) =>{
      return <li className = "musclesList" key={muscle.id}> <Link className="musclesList" to={`/exercises/${muscle.id}`}>{muscle.name}</Link> </li>    
  })
    
    //       const muscleClickHandler =(id)=>{ 
    //  getExerciseByMuscleID(id)
    //       .then((exercisesList) => setExercisesList(exercisesList));
    //       }
        
return(
    <div >
    <h5 className = "chooseMuscle">Choose a muscle</h5>
        <ul className="renderedMuscles"> {renderedMuscles}
    
        </ul>
    {/* <ul style={{ cursor: 'pointer' }}>> <p onClick={() => muscleClickHandler(muscle.id)}>{muscle.name}</p></ul> */}
    </div>
)
}

export default Muscles;