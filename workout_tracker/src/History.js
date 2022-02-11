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
                <div className="calendar">
        <h1 className="calendarText">Calendar</h1>
        
        <DatePicker
        selected={selectedDate}
        onChange={date=> setSelectedDate(date)}
        onSubmit = {handleSubmit}
        />
        <h3 className="dateFeature"> This feature isnt yet available on this version of the app. Keep an eye on this space for updates!</h3>

        <h3> Speaking of calendars, have you seen <a href="https://www.amazon.co.uk/dp/B099TPFT64/ref=cm_sw_r_tw_dp_36W53MVMEN170PWGRV0G">this calendar</a> on our online store?</h3>
        

        </div>
       
            
            
           
    );
}

export default History;