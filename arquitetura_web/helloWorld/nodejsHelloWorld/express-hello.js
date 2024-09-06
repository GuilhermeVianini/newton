const express = require('express');
const { request } = require('http');
app = express();

app.get("/hello", (request, response) => {
    response.send("Hello World");
});

app.listen(3000);