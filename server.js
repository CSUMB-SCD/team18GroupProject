//Install express server
const express = require('express');
const path = require('path');

const app = express();

var cors = require('cors')

// Serve only the static files form the dist directory
app.use(express.static('./dist/cst438Group'));

app.get('/*', function(req,res) {
    
res.sendFile(path.join('./dist/cst438Group/index.html'));
});

// Start the app by listening on the default Heroku port
app.listen(process.env.PORT || 8080);