import './App.css';
import Muscles from './Muscles';
import React, {useEffect, useState} from 'react';
import PageHeader from './PageHeader';
import Home from './Home';
import Exercises from './Exercises';
import History from './History';
import SetsForm from './SetsForm';
import Workout from './Workout';
import SetsDisplay from './SetsDisplay';
import {BrowserRouter as Router,Routes,Route,Link} from "react-router-dom";
import Motivation from './Motivation';
import Timer from './Timer';



function App() {

  
  return (
    <div className = "body">
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
      <Route path = "/motivation" element = {<Motivation/>}/>
      <Route path = "/timer" element = {<Timer/>}/>
      
      
      
     </Routes>
     </Router>
    </div>
)
}



export default App;
