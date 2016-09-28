"use strict";
var $ = function(id) { return document.getElementById(id); };

var processEntries = function() {
    var header = "";
    var html = "";
    var required = "<span>Required field</span>";
    var msg = "Please complete all required fields.";

    var email = $("email").value;
    var first_name = $("first_name").value;
    var last_name = $("last_name").value;
    var customer_number = $("customer_number").value;
    var social_security_number = $("social_security_number").value;
    var position = "customer";
    if ($("employee").checked) { position = "employee"; }

    if (email == "") {
        email = required;          
        header = msg;
    }
	if (first_name == "") {
        first_name = required;
        header = msg;
    }
	if (last_name == "") {
        last_name = required;
        header = msg;
    }
    if (customer_number == "") {
        customer_number = required;
        header = msg;
    }
    if (social_security_number == "") {
        social_security_number = required;
        header = msg;
    }
    if (position == "") {
        position = required;
        header = msg;
    }

    $("registration_header").firstChild.nodeValue = header;
    if (header == msg) {     
        html = html + "<tr><td>First Name: </td><td>" + first_name + "</td></tr>";
        html = html + "<tr><td>Last Name: </td><td>" + last_name + "</td></tr>";
        html = html + "<tr><td>Email: </td><td>" + email + "</td></tr>";
        html = html + "<tr><td>Customer Number: </td><td>" + customer_number + "</td></tr>";
        html = html + "<tr><td>Employee SSN Number: </td><td>" + social_security_number + "</td></tr>";
        html = html + "<tr><td>Position: </td><td>" + position + "</td></tr>";
        $("registration_info").innerHTML = html;
    } else {
        $("registration_info").innerHTML = "";
        $("registration_form").submit();
    }
};

var resetForm = function() {
    $("registration_form").reset();
    $("registration_header").firstChild.nodeValue = "";
    $("registration_info").innerHTML = "";
    $("first_name").focus();
};

window.onload = function() {
    $("register").onclick = processEntries;
    $("reset_form").onclick = resetForm;
    $("first_name").focus();
};