interface NumList {
    [index: number]: number
}

let numArr: NumList = [1, 2, 3];
numArr[0];
numArr[1];
console.log(numArr);


// Array which return string
interface ProLangArray {
    [index: number]: string
}

// use of the interface  
let progLangArray: ProLangArray = ['C', 'C++', 'Java', 'Python'];
console.log(progLangArray);