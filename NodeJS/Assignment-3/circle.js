const arguments = process.argv.slice(2);

function circleAreaCalc(radius) {
    let area = Math.PI * Math.pow(radius,2);
    console.log(`Area of a circle with radius ${radius}: ${area}`);
}

function circleCircumferenceCalc(radius) {
    let circumference = 2 * Math.PI * radius;
    console.log(`Circumference of a circle with radius ${radius}: ${circumference}`);
}

module.exports = {
    circleAreaCalc,
    circleCircumferenceCalc
}