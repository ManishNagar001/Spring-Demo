import React,{useState} from 'react'

export function Chat(){
    const [prompt, setPrompt]=useState('');
    const [chatResponse,setChatResponse]=useState('');
    const[loading, setLoading]=useState(false)

   const askAI=async ()=>{
     try{
           setLoading(true);
            const response= await fetch(`http://localhost:8080/askai?prompt=${prompt}`)
           const data=await response.text();
           console.log(data) ;
           setChatResponse(data);      
        }
        catch(error){
            console.error("Error generating Image: ",error)
                  
        }
        finally{
            setLoading(false);
        }
   }

    return (
        <div>
          <h2>Chat </h2>
          <input  type="text" value={prompt}
          onChange={(e)=> setPrompt(e.target.value)}
           placeholder="Enter a prompt for AI"
           />

           <button onClick={askAI}> Ask AI </button>

           <div className="output">
            {
                loading?(<p> 💸 Paisa bachaya hai, ab thoda time invest karo.</p>):(<p>  {chatResponse}</p>)
            }

            
            </div>

        </div>
    );
}

export default Chat;