let cmr = [{
    "brand":"Nikon",
    "Model":"Nikon Z6",
    "pixel":"24.5 megapixel",
    "ISO":"100-51,200",
    "price":"65,900 baht",
}]

let cmr1 ={
    "brand":"Sony",
    "Model":"Alpha7 III",
    "pixel":"24.2 megapixel",
    "ISO":"100-51,200",
    "price":"79,990 baht",
}

let cmr2 ={
    "brand":"Olympus",
    "Model":"OM-D E-M10 Mark III",
    "pixel":"16 megapixel",
    "ISO":"100-25,600",
    "price":"29,990 baht",
}

let cmr3 ={
    "brand":"Fujifilm",
    "Model":"X-T30",
    "pixel":"2.36 megapixel",
    "ISO":"80-51,200",
    "price":"39,990 baht",
}

let cmr4 ={
    "brand":"Canon",
    "Model":"EOS RP",
    "pixel":"26.2 megapixel",
    "ISO":"100-40,000",
    "price":"42,900 baht",
}

let cmr5 ={
    "brand":"Sony",
    "Model":"Alpha 6000",
    "pixel":"24.3 megapixel",
    "ISO":"100-25,600",
    "price":"21,900 baht",
}

let cmr6 ={
    "brand":"Fujifilm",
    "Model":"X-T3",
    "pixel":"26 megapixel",
    "ISO":"80-51,200",
    "price":"59,900 baht",
}

let cmr7 ={
    "brand":"Panasonic",
    "Model":"Lumix DC-GH5S",
    "pixel":"10.2 megapixel",
    "ISO":"160-51,200",
    "price":"79,900 baht",
}

let cmr8 ={
    "brand":"Nikon",
    "Model":"Z7",
    "pixel":"45.7 megapixel",
    "ISO":"64-25,600",
    "price":"141,900 baht",
}

let cmr9 ={
    "brand":"Panasonic",
    "Model":"Lumix GF10",
    "pixel":"16 megapixel",
    "ISO":"200-25,600",
    "price":"23,990 baht",
}

cmr.push(cmr1)
cmr.push(cmr2)
cmr.push(cmr3)
cmr.push(cmr4)
cmr.push(cmr5)
cmr.push(cmr6)
cmr.push(cmr7)
cmr.push(cmr8)
cmr.push(cmr9)

console.log(" camera ")
console.log(" -------------------------------------------------------------------------------------------------------")

for(let i=0;i<cmr.length;i++){
    console.log("No."+"["+(i+1)+"] "+"[brand : "+cmr[i].brand+
    "] [Model : "+cmr[i].Model+
    "] [pixel : "+cmr[i].pixel+
    "] [ISO : "+cmr[i].ISO+
    "] [price : "+cmr[i].price+
    "]")
}

console.log(" END ")
console.log(" -------------------------------------------------------------------------------------------------------")

let cmrselect = cmr.splice(10)

console.log(" camera ")
console.log(" -------------------------------------------------------------------------------------------------------")

for(let i=0;i<2;i++){
    console.log("No."+"["+(i+1)+"] "+"[brand : "+cmr[i].brand+
    "] [Model : "+cmr[i].Model+
    "] [pixel : "+cmr[i].pixel+
    "] [ISO : "+cmr[i].ISO+
    "] [price : "+cmr[i].price+
    "]")
}

for(let r=cmr.length-3;r<cmr.length;r++){
    console.log("No."+"["+(r+1)+"] "+"[brand : "+cmr[r].brand+
    "] [Model : "+cmr[r].Model+
    "] [pixel : "+cmr[r].pixel+
    "] [ISO : "+cmr[r].ISO+
    "] [price : "+cmr[r].price+
    "]")
}

console.log(" END ")
console.log(" -------------------------------------------------------------------------------------------------------")