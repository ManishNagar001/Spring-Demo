import React,{useState} from 'react'

export function RecipeGenerator(){
    
    const[ingredients, setIngredients]=useState('');
    
    const[cusine, setCusine]=useState('any');
    
    const[dietaryRestrication, setdietaryRestrication]=useState('');
    
    const[recipe, setRecipe]=useState('');

    const GenerateRecipe =async ()=>{

          try{
            const response= await fetch(`http://98.83.119.171:8080/recipeGenerator?ingredients=${ingredients}&cuisine=${cusine}&dietaryRestications=${dietaryRestrication}`)
           const data=await response.text();
           console.log(data) ;
           setRecipe(data);      
        }
        catch(error){
            console.error("Error generating recipe: ",error)
                  
        }

    };


    return (

        <div>

        <h2>Generte Recipe </h2>
        <input type="text"  value={ingredients}
        onChange={(e)=>setIngredients(e.target.value)}
       placeholder="Enter integridients(comman separted" />
        
          <input type="text"  value={cusine}
        onChange={(e)=>setCusine(e.target.value)}
       placeholder="Enter cusine" />
        
          <input type="text"  value={dietaryRestrication}
        onChange={(e)=>setdietaryRestrication(e.target.value)}
       placeholder="Enter dietaryRestrication" />
        
        <button onClick={GenerateRecipe}> Generate recipe </button>
         <div className="output">
            <pre className="recipe-text">{recipe}</pre>


            </div>

        </div>
    );
}

export default RecipeGenerator;
