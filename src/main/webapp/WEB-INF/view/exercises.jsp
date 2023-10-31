<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Exercise menu</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Karma">
    <style>
        body, h1, h2, h3, h4, h5, h6 {
            font-family: "Karma", sans-serif;
            font-weight: bold; /* Make headings bold */
            margin: 0; /* Remove default body margin */
        }
        .w3-bar-block .w3-bar-item {
            padding: 20px;
        }
        .image-container {
            float: left;
            margin: 20px;
            text-align: center;
        }
        body {
            /* Background image properties */
            background-image: url('https://e0.pxfuel.com/wallpapers/364/444/desktop-wallpaper-relaxing-music-stress-relief.jpg');
            /* URL to your background image */
            background-size: cover; /* Cover the entire viewport */
            background-repeat: no-repeat; /* Prevent image from repeating */
            background-attachment: fixed; /* Fixed background */
            background-color: transparent;
        }
        p {
            font-size: 25px; /* Increase font size */
            font-weight: bold; /* Make text bold */
        }
    </style>
</head>
<body>

<!-- Sidebar (hidden by default) -->
<nav class="w3-sidebar w3-bar-block w3-card w3-top w3-xlarge w3-animate-left"
     style="display:none;z-index:2;width:40%;min-width:300px; background-color: orange;" id="mySidebar">
    <a href="javascript:void(0)" onclick="w3_close()" class="w3-bar-item w3-button">Close Menu</a>
    <a href="#meditation" onclick="w3_close()" class="w3-bar-item w3-button">Meditation</a>
    <a href="#about" onclick="w3_close()" class="w3-bar-item w3-button">About</a>
</nav>

<!-- Top menu -->
<div class="w3-top">
    <div class="w3-white w3-xlarge" style="max-width:1200px;margin:auto; background-color: orange;">
        <div class="w3-button w3-padding-16 w3-left" onclick="w3_open()">☰</div>
          <a href="home">
        
        <div class="w3-right w3-padding-16">Home</div>
        <div class="w3-center w3-padding-16">Exercise</div>
    </div>
</div>

<!-- !PAGE CONTENT! -->
<div class="w3-main w3-content w3-padding" style="max-width:1200px;margin-top:100px">
   <!-- Assuming you have a List of Meditation objects named 'meditations' in your servlet -->
   <c:forEach var="meditation" items="${exercises}">
       <div class="image-container">
        <a href="${meditation.pageLink}"> <!-- Correct URL -->

               <img src="${meditation.imageLink}" width="550px" height="400px" alt="${meditation.exercisesType}">
               <h2>${meditation.id} . ${meditation.exercisesType}</h2>
               <p>${meditation.description}</p>
           </a>
       </div>
   </c:forEach>

    <!-- Remove the unnecessary closing </ul> here -->

</div>

<footer>
    <!-- Add your footer content here -->
</footer>

<script>
    // Script to open and close sidebar
    function w3_open() {
        document.getElementById("mySidebar").style.display = "block";
    }

    function w3_close() {
        document.getElementById("mySidebar").style.display = "none";
    }
</script>

</body>
</html>
