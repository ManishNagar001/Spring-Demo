import React,{useState} from 'react'

export function ImageFree(){

    const[prompt, setPrompt]=useState('');
    const[imageUrl,setImageUrls]=useState([]);
    const[furl,setFurl]=useState([]);

    const generateImage =async()=>{
        try{
            const response=`https://image.pollinations.ai/${prompt}`
          // const urls=await response.json(); 
           setFurl(response);      
        }
        catch(error){
            console.error("Error generating Image: ",error)
                  
        }

    };
    return (
     <div className="tab-content">
         <h2>Generte Images </h2>
         <input type="text" value={prompt} 
           onChange={(e)=> setPrompt(e.target.value)}
           placeholder="Enter prompt for image"/>

<button onClick={generateImage}> Generate Image </button>
       
       <div className="image-grid">
        {/* {imageUrl.map((url,index) =>(
            <img key={index} src={url} alt={`Generated ${index}`} />
        ))}
       
       {[...Array(4-imageUrl.length)].map((_, index)=>(
           <div key={index+imageUrl.length}
           className="empty-image-slot"></div>
       ))} */}

       <img src={furl} />

       </div>
        </div>
    );
}

export default ImageFree;