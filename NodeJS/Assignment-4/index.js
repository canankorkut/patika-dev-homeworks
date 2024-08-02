const fs = require('fs');
const file = 'employees.json';
const format = 'utf-8';

// Create JSON file
fs.writeFile(file, JSON.stringify({ employees: [{ name: 'Employee 1 Name', salary: 2000 }] }, null, 2), format, (err) => {
    if (err) console.log(err);
});

// Read file
fs.readFile(file, format, (err, data) => {
    if (err) console.log(err);
    console.log(data);
});

// Update file
fs.readFile(file, format, (err, data) => {
    if (err) console.log(err);

    // Parse existing JSON data
    const json = JSON.parse(data);

    // Add new employee data
    json.employees.push({ name: 'Employee 2 Name', salary: 3000 });

    // Write updated JSON data back to file
    fs.writeFile(file, JSON.stringify(json, null, 2), format, (err) => {
        if (err) console.log(err);
    });
});

// Delete file
fs.unlink(file, (err) => {
    if (err) console.log(err);
});