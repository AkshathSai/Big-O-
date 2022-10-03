// const nemo = ['nemo'];

// //Simulating 10000 inputs
// const largeArray = new Array(10000).fill('nemo');


// function findNemo(array) {

//   let t0 = performance.now();

//   for(let i = 0; i < array.length; i++) {
//     if(array[i] === 'nemo') {
//       console.log('Found Nemo!');
//     }
//   }

//   let t1 = performance.now();

//   console.log('Call to find nemo took ' + (t1-t0) + 'milliseconds');
  
// }



// //findNemo(nemo);
// findNemo(largeArray); //O(n) --> Linear Time [It simply means that the Big O depends on the number of inputs/number of Fish in this case]

//If we just had nemo array the Big O would be O(1)
//If wa had the largeArray the Big O would be O(10000)

const boxes = [0, 1, 2, 3 , 4, 5, 6, 7, 8, 9];

function logFirstTwoBoxes(boxes) {
  console.log(boxes[0]); //O(1) one operation here
  console.log(boxes[1]); //O(1) one operation here
}

logFirstTwoBoxes(boxes); //O(2) This function in total is running O(2)


//Excercise - 1
// What is the Big O of the below function? (Hint, you may want to go line by line)
function funChallenge(input) {
  let a = 10; //O(1)
  a = 50 + 3; //O(1)

  
  for (let i = 0; i < input.length; i++) { //O(n) since it depends on input
    anotherFunction(); //O(n)
    let stranger = true; //O(n)
    a++; //O(n)
  }
  return a; //O(1) runs only once
}

/** 
Big O of this function = no. of O(1) + no. of O(n)
                       = (1 + 1 + 1) + n + n + n + n 
                       = 3 + 4n
*/

funChallenge() //Big O = O(3 + 4n) but at the end of the day this actually gets simplied to 0(n) Why? You'll know very soon :) ....


//Excercise - 2
// What is the Big O of the below function? (Hint, you may want to go line by line)
function anotherFunChallenge(input) { 
  let a = 5; //O(1)
  let b = 10; //O(1)
  let c = 50; //O(1)
  for (let i = 0; i < input; i++) { //O(n)
    let x = i + 1; //O(n)
    let y = i + 2; //O(n)
    let z = i + 3; //O(n)

  }
  for (let j = 0; j < input; j++) { //O(n)
    let p = j * 2; //O(n)
    let q = j * 2; //O(n)
  }
  let whoAmI = "I don't know"; //O(1)
}

//Note: We can also include i++, j++ of the two for loops as O(n) in this case we include hence 7n else it'll be 5n
//Big O = O (4 + 7n) but at the end of the day this actually gets simplied to 0(n)

//Simplifying Big O  
