import { useState } from "react";

const ExerciseCard = ({exercise}) =>{
    const [weight, setWeight] = useState(1);
    const [reps, setReps] = useState(1);


    const increaseWeight = () => {
      setWeight(weight + 1);
    }
  
    const decreaseWeight = () => {
      let newWeight = weight - 0;
  
      if(newWeight < 0){
        newWeight = 0;
      }
  
      setWeight(newWeight);
    }

    console.log(exercise);

    const increaseReps = () => {
        setReps(reps + 1);
      }
    
      const decreaseReps = () => {
      
    
        if(reps < 0){
          reps = 0;
        }
    
        setWeight(reps);
      }



    
    
    return(
        <>
        <hr></hr>
        <p>{exercise.name}</p>
        
        <form>
         
          <div className="weight">
          Weight
          </div>
          <div className = "weightForm">
          <button  onClick={() => increaseWeight()} type="submit" className="btn btn-primary">-</button>
          <input type="number"/>
          <button onClick={() => decreaseWeight()} type="submit" className="btn btn-primary">+</button>
          
         </div>
         <div className = "reps"> 
         Reps
         </div>
         <div className = "repsForm">
          <button onClick={() => increaseReps()} type="submit" className="btn btn-primary">-</button>
          <input type="number"/>
          <button onClick={() => decreaseReps()} type="submit" className="btn btn-primary">+</button>
          </div>
          
         </form>
         <hr></hr>
         
        </>
    )
    
    }
    
    export default ExerciseCard;    