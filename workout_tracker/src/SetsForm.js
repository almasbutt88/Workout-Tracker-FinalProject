import { useState } from "react";
import Exercises from "./Exercises";
import displaySet from "./Workout";
import exercisesElements from "./Exercises"


const SetsForm = ({displaySet, exercisesElements})=>{

    const [weight, setWeight] = useState(0);
    const [reps, setReps] = useState(0);
    const [comment, setComment] = useState("");

    const [setData, setSetData] = useState({});

    const increaseWeight = (e) => {
    e.preventDefault();
     setWeight(Number(weight)+1);
    };
  
    const decreaseWeight = (e) => {
        e.preventDefault();
        if(weight>0){
            setWeight(Number(weight) -1);
        }
    }

    const handleWeightChange = (e) =>{
        e.preventDefault();
        setWeight(e.target.value)
    }   
    
    const increaseReps = (e) => {
        e.preventDefault();
        setReps(Number(reps)+1);
        
    };
    
      const decreaseReps = (e) => {
          e.preventDefault();
          if(reps>0){
      setReps(Number(reps)-1);
          }
    };
  const handleRepsChange = (e) =>{
        e.preventDefault();
        setReps(e.target.value)
    } 

    const handleCommentChange = (e) =>{
        e.preventDefault();
        setComment(e.target.value)
    }

      const handleClick =(e)=>{
          e.preventDefault();
          const setData = {
              
            reps: reps, 
            weight: weight,
            comment: comment
          }
          setSetData(setData);
       }
     
    return(
        <>
        
        <form>
          <div className="weight">
          Weight
          </div>
          <div className = "weightForm">
          <button  onClick={decreaseWeight} type="number" className="btn btn-primary">-</button>
          <input onChange = {handleWeightChange}
          type="number"
          min="0"
          step="1"
          type="number"
          id="weightid"
          name="weightname"
          value = {weight}/>
        
          <button onClick={increaseWeight} type="number" className="btn btn-primary">+</button>
          
         </div>
         <div className = "reps"> 
         Reps
         </div>
         <div className = "repsForm">
          <button onClick={decreaseReps} type="number" className="btn btn-primary">-</button>
          <input onChange = {handleRepsChange}
          type="number"
          min="0"
          step="1"
          type="number"
          id="repsid"
          name="repsname"
          value = {reps}/>
          <button onClick={increaseReps} type="number" className="btn btn-primary">+</button>
          </div>
         <textarea onChange = {handleCommentChange} className = "comments" type = "string" placeholder="Comments..." ></textarea>
         <div className = "submitButton">
         <button className = "saveSet" onClick = {handleClick} type = 'submit' value = 'submit'>Save Set</button>
         </div>
         </form>
         <hr></hr>
         <p>Exercise Name</p>
        <p>Weight: {setData.weight}</p>
        <p>Reps: {setData.reps}</p>
        <p>Comments: {setData.comment}</p>
        </>
    )
    
    }

export default SetsForm;
