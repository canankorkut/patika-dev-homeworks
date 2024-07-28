const arguments = process.argv.slice(2);

function circleAreaCalc(radius) {
    let area = Math.PI * Math.pow(radius, 2);
    console.log(`Area of a circle with radius ${radius}: ${area}`);
}

circleAreaCalc(arguments[0]*1);