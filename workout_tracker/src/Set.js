
const Set = ({set, exerciseName}) => {

    return (
        <tr>
            <td scope="row">{exerciseName}</td>
            <td scope="row">{set.weight}</td>
            <td scope="row">{set.rep}</td>
            <td scope="row">{set.comment}</td>
        </tr>
    )

}


export default Set;










