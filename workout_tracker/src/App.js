
import './App.css';
import Muscles from './Muscles';
import React, {useEffect, useState} from 'react';
import { getAllExercises, getExerciseByMuscleID, getMuscles} from "./MuscleService";
import PageHeader from './PageHeader';
import Home from './Home';
import Exercises from './Exercises';
import History from './History';
import SetsForm from './SetsForm';
import Workout from './Workout';
import SetsDisplay from './SetsDisplay';
import {BrowserRouter as Router,Routes,Route,Link} from "react-router-dom";



function App() {
// const [musclesList, setMusclesList] = useState([])
// const [exercisesList, setExercisesList] = useState([])


//  useEffect(() => {
//   getAllExercises().then((allExercises)=>{
//     setExercisesList(allExercises);
//   })


  // useEffect(() => {
  //   getExerciseByMuscleID(8)
  //     .then((allExercises) => {
  //       setExercisesList(allExercises);
  // })
  // }, []);
  
  return (
    <div>
  <Router>

  <PageHeader/>
     <Routes>
     
      <Route path ="/" element={<Home/>}/>
      <Route path ="/history" element = {<History/>}/>
      <Route path ="/muscles" element = {<Muscles/>}/>
      <Route path = "/exercises/:id" element = {<Exercises/>}/>
      <Route path = "/setsform/:exercise_id" element = {<SetsForm/>}/>
      <Route path = "/workout" element = {<Workout/>}/>
      <Route path = "/setsdisplay" element = {<SetsDisplay/>}/>
      
     </Routes>
     </Router>
    </div>
)
}



export default App;
