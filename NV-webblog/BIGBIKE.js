let bike = [{
    "name":"HONDA BigWing",
    "Model":"CBR1000RR"
}]

let b1 ={
     "name":"YAMAHA BigBike",
     "Model":"R1M"
}

let b2 ={
     "name":"SUZUKI BigBike",
     "Model":"GSX1000RR"
}

let b3 ={
    "name":"BMW BigBike",
    "Model":"S1000RR"
}

let b4 ={
    "name":"KAWASAKI BigBike",
    "Model":"ZK10r"
}

let b5 ={
    "name":"MV Agusta",
    "Model":"F4RR"
}

let b6 ={
    "name":"Ducati",
    "Model":"Panigale V4s"
}

let b7 ={
    "name":"Aprilia",
    "Model":"RSV4 Factory"
}

let b8 ={
    "name":"HONDA BigWing",
    "Model":"CB1000"
}

let b9 ={
    "name":"YAMAHA BigBike",
    "Model":"MT-09"
}





bike.push(b1)
bike.push(b2)
bike.push(b3)
bike.push(b4)
bike.push(b5)
bike.push(b6)
bike.push(b7)
bike.push(b8)
bike.push(b9)




console.log(" --- Ride BIGBIKE --- ")

for(let i=0;i<bike.length;i++){
    console.log("No."+(i+1)+" Ride "+bike[i].name+" Model : "+bike[i].Model)
}

console.log("          --- END --- ")

let bikeselect = bike.splice(10,2)

console.log(" --- Ride BIGBIKE --- ")

for(let i=0;i<2;i++){
    console.log("No."+(i+1)+" Ride "+bike[i].name+" Model : "+bike[i].Model)
}

for(let r=bike.length-3;r<bike.length;r++){
    console.log("No."+(r+1)+" Ride "+bike[r].name+" Model : "+bike[r].Model)
}

console.log("        --- END --- ")