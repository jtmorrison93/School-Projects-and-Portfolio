var express = require('express');
var app = express();

var bodyParser = require('body-parser');
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));

var Student = require('./modules/students.js');

app.use(express.static('public'));

app.use('/showAll', function(req,res) {
    Student.find(function(err, students) {
        if(err) {
            res.status(500).send(err);
        } else {
            res.send(students);
        }
    });
})

app.get('/getOne', function(req, res) {     // Retrieve student using sid

    sid = req.query.sid
    Student.findOne( {sid: sid}, function(err, student) {
        if (err) {
            res.status(500).send(err);
        }
        else {
            res.send(student);
        }
    });
})

app.post('/addStudent', function(req, res){
    var newStudent = new Student ({
        sid: req.body.sid,
        last_name: req.body.last_name,
        first_name: req.body.first_name,
        major: req.body.major,
        midterm: 0,        // new student has no scores yet
        final: 0
    });

    newStudent.save( function(err) {
        if (err) {
            res.status(500).send(err);
        }
        else {
            res.send("Student successfully added.");
        }
    });
});


    app.post('/updateStudent', function(req, res) {   
        
        var sid = req.body.sid;
        var updateMajor = req.body.major; 
        var updateMidterm = req.body.midterm;
        var updateFinal = req.body.final;

        Student.findOne( {sid: sid}, function(err, student) {  
            if (err) {
                res.status(500).send(err);
            }
            else if (!student) {
                res.send('No studnet with a sid of ' + sid);
            }
            else {
                student.major = updateMajor;
                student.midterm = updateMidterm;
                student.final = updateFinal;
            
                student.save(function (err) {
                    if(err) {
                        res.status(500).send(err);
                    } else {
                        res.send("Update successful");
                    }
                });
           }
        });        
    
    });

app.listen(3000,  function() {
	console.log('Listening on port 3000, ctrl-c to quit');
    });