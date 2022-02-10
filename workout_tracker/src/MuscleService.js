import { id } from "date-fns/locale"

const musclesURL = 'http://localhost:8080/muscles'
const exercisesURL = 'http://localhost:8080/exercise'
const exercisesByMuscleIDURL = 'http://localhost:8080/exercise/muscleid/'
const addSetURL = 'http://localhost:8080/addset'
const exerciseByIDURL = 'http://localhost:8080/exercise/'
const getSets = 'http://localhost:8080/sets'
const setByIDURL = 'http://localhost:8080/sets'




export const getMuscles = () => {
    return fetch(musclesURL)
        .then(res => res.json())
} 

export const getAllExercises = () =>{
return fetch(exercisesURL)
    .then(res => res.json())
}

export const getExerciseByMuscleID = (id) => {
const searchID = exercisesByMuscleIDURL + id;
    return fetch(searchID)
        .then(res => res.json())
    } 

export const getAllSets= () =>{
    return fetch(getSets)
     .then(res => res.json())
        }

export const getExerciseByID=(id)=>{
    const searchID = exerciseByIDURL + id;
    return fetch(searchID)
        .then(res => res.json())
}