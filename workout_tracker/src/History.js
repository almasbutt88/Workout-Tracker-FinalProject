import React, {useState} from "react";
import DatePicker from "react-datepicker";
import 'react-datepicker/dist/react-datepicker.css'
import SetsDisplay from './SetsDisplay'
import Set from "./Set";


function History() {
 
    const[selectedDate, setSelectedDate] = useState(null)


    const handleSubmit =(e)=>{
        e.preventDefault();
       console.log("date picked!!")
        }

            return (
                <div>
        <h1>Calendar</h1>
        <div className = "calendar">
        <DatePicker
        selected={selectedDate}
        onChange={date=> setSelectedDate(date)}
        onSubmit = {handleSubmit}
        />
        </div>

        </div>
       
            
            
           
    );
}

export default History;