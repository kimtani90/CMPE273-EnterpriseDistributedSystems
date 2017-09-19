var ejs = require("ejs");
var mysql = require('./mysql');



function signup(req,res)
{
	// check user already exists
	var insertUser="insert into users (firstname, lastname, username, password, email, phno) values ( '"+req.param("firstname")
					+"' ,'" + req.param("lastname") +"','" + req.param("username") +"','" +
					req.param("pwd")+ "','" + req.param("email")+ "','" + req.param("phno")+"')";
	
	console.log("Query is:"+insertUser);
	
	mysql.insertData(insertUser);
	res.render('index');
	
}

exports.signup=signup;


function newUser(req,res)
{
	
	res.render('signup');
	
}

exports.newUser=newUser;