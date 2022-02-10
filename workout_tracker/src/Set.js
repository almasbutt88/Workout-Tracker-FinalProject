
import deletebutton from "./images/delete.png"


const Set = ({set, exerciseName, deleteSet}) => {


    return (
    
       <tr>
            <td scope="row">{exerciseName}</td>
            <td scope="row">{set.weight}</td>
            <td scope="row">{set.rep}</td>
            <td scope="row">{set.comment}</td>
            <td scope="row"><img src={deletebutton} width="50" onClick={() => deleteSet(set.id)}/></td>
        </tr>
       
       
        
    )

}


export default Set;










