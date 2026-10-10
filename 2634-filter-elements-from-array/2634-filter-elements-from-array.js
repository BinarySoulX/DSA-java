/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let fil=[];
    arr.forEach( (ele,idx)=>{
        if(fn(ele,idx)){fil.push(ele);}
    });
    return fil;
};