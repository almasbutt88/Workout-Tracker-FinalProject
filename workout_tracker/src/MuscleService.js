const musclesURL = 'http://localhost:8080/muscles'
const exercisesURL = 'http://localhost:8080/exercise'
const exercisesByMuscleIDURL = 'http://localhost:8080/exercise/muscleid/'

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


//getExercise

// export const postSighting = (payload) => {
//     return fetch(baseURL, {
//         method: 'POST',
//         body: JSON.stringify(payload),
//         headers: { 'Content-Type': 'application/json' }
//     })
//     .then(res => res.json())
// }

// export const deleteSighting = (id) => {
//     return fetch(baseURL + id, {
//         method: 'DELETE'
//     })