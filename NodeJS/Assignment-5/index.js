const http = require('http');

const server = http.createServer((req,res) => {
    const url = req.url;

    if (url === '/') {
        res.writeHead(200, { "Content-Type": "text/html" });
        res.write("<h2>Welcome to Index Page!</h2>");
    } else if (url === '/index') {
        res.writeHead(200, { "Content-Type": "text/html" });
        res.write("<h2>Welcome to Index Page!</h2>");
    } else if (url === '/about') {
        res.writeHead(200, { "Content-Type": "text/html" });
        res.write("<h2>Welcome to About Page!</h2>");
    } else if (url === '/contact') {
        res.writeHead(200, { "Content-Type": "text/html" });
        res.write("<h2>Welcome to Contact Page!</h2>");
    } else {
        res.writeHead(400, { "Content-Type": "text/html" });
        res.write("<h2>404 Page Not Found!</h2>");
    }

    res.end();
})

const port = 5000;

server.listen(port, () => {
    console.log(`Server started at port ${port}.`);
})