import { useState,useEffect } from "react";
import { useParams } from 'react-router-dom';
import SetsDisplay from "./SetsDisplay";
import { getAllSets } from "./MuscleService";
import { getExerciseByID } from "./MuscleService";



const SetsForm = ()=>{

    const { exercise_id } = useParams();


    const [weight, setWeight] = useState(0);
    const [reps, setReps] = useState(0);
    const [comment, setComment] = useState("");
    const [setsList, setSetsList] = useState([]);
    const [exercise, setExercise] = useState("");
    

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
            exercise:exercise,
            //workout:workout,
            rep: reps, 
            weight: weight,
            comment: comment
          }
          console.log("SetDATA: " + setData);
          fetch("http://localhost:8080/addset",{
            method:"POST",
            headers:{"Content-Type":"application/json"},
            body:JSON.stringify(setData)
        }).then(()=>{
            getAllSets(exercise_id)
             .then((setsList) => setSetsList(setsList))
        })
    }
       useEffect(() => { 
        getExerciseByID(exercise_id)
        .then((exercise) => setExercise(exercise));

           getAllSets(exercise_id)
             .then((setsList) => setSetsList(setsList));
       }, [])


    const deleteSet = (id) => {

        fetch(`http://localhost:8080/sets/${id}`, 
        {
            method:'DELETE'
        }).then((result) => {
            const newSetsList = [...setsList];
            setsList.splice(id, 1)
            setSetsList(newSetsList)
           



            // splice out the set with set.id = id
            // call setSetsList with the newSetsList
        })

    }

   
    //    const testSet = setData.map((testitem) =>{
    //     return <li key={testitem.id}>{testitem} </li>    
    // })
     
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
          <div className = "comments">
         <textarea onChange = {handleCommentChange}  type = "string" placeholder="Comments..." ></textarea>
         </div>
         <div className = "submitButton">
         <button className = "saveSet" onClick = {handleClick} type = 'submit' value = 'submit'>Save Set</button>
         </div>
         </form>
         <hr></hr>
         <p></p>
        <SetsDisplay exercise_id = {exercise_id} exercise={exercise} setsList={setsList} deleteSet={deleteSet}/>
    
        </>
    )
    
}

export default SetsForm;
