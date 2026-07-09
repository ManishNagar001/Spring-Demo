import React,{useState} from 'react'

export function RecipeGenerator(){
    
    const[ingredients, setIngredients]=useState('');
    
    const[cusine, setCusine]=useState('');
    
    const[dietaryRestrication, setdietaryRestrication]=useState('');
    
    const[recipe, setRecipe]=useState('');

    const[output, setOutput]=useState(false);

    const[loading,setLoading]=useState(false);

    const GenerateRecipe =async ()=>{

          try{
            setOutput(true);
            setLoading(true);
            const response= await fetch(`http://98.83.119.171:8080/recipeGenerator?ingredients=${ingredients}&cuisine=${cusine}&dietaryRestications=${dietaryRestrication}`)
           const data=await response.text();
           console.log(data) ;
           setLoading(false);
           
           setRecipe(data);      
        }
        catch(error){
            console.error("Error generating recipe: ",error)
                  
        }

    };


    return (

        <div>

        <h2>Generate Recipe </h2>
        <input type="text"  value={ingredients}
        onChange={(e)=>setIngredients(e.target.value)}
       placeholder="Enter integridients(comma separted)" />
        
          <input type="text"  value={cusine}
        onChange={(e)=>setCusine(e.target.value)}
       placeholder="Enter cusine" />
        
          <input type="text"  value={dietaryRestrication}
        onChange={(e)=>setdietaryRestrication(e.target.value)}
       placeholder="Enter Dietay Restrication" />
        
        <button onClick={GenerateRecipe}> Generate recipe </button>
         
         { output &&(
         <div className="output">
            {
               loading?(<b>🍴 Mixing flavors with Nagar's GPT magic...</b>): (<pre className="recipe-text">{recipe}</pre>)
            }
            </div>
         )
}

        </div>
    );
}

export default RecipeGenerator;
