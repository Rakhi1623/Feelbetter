<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
   <title>Walkingmeditation</title>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <style>
        body, h1, h2, h3, h4, h5, h6 {
            font-family: "Karma", sans-serif;
            font-weight: bold; /* Make headings bold */
            margin: 0; /* Remove default body margin */
            colour : black;
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
          background-image: url('https://images.pond5.com/legs-young-slender-ballet-dancer-footage-116609076_iconm.jpeg');
          /* URL to your background image */
          background-size: cover; /* Cover the entire viewport */
          background-repeat: no-repeat; /* Prevent image from repeating */
          background-attachment: fixed; /* Fixed background */

      }

        p {
            font-size: 25px; /* Increase font size */
            font-weight: bold; /* Make text bold */
        }

    </style>
</head>
<body>

<header class="w3-display-container w3-content w3-center" style="max-width:1500px">
    <img class="w3-image" src="https://hips.hearstapps.com/hmg-prod/images/mindful-walking-meditation-1594957122.jpg" alt="Me" width="1500" height="600">
    <div class="w3-display-middle w3-padding-large w3-border w3-wide w3-text-black w3-center"> <!-- Set text color to black -->
        <h1 class="w3-hide-medium w3-hide-small w3-xxxlarge">Walking Meditation</h1>
        <h5 class="w3-hide-large" style="black-space:nowrap">Walking Meditation</h5>
        <h3 class="w3-hide-medium w3-hide-small"></h3>
    </div>

    <!-- Navbar (placed at the bottom of the header image) -->
    <div class="w3-bar w3-light-grey w3-round w3-display-bottommiddle w3-hide-small" style="bottom:-16px">
        <a href="/feelbetter/home/meditation" class="w3-bar-item w3-button">Back</a>
    </div>
</header>
<!-- !PAGE CONTENT! -->
<div class="w3-main w3-content w3-padding" style="max-width:1200px;margin-top:100px">
   <!-- Assuming you have a List of Meditation objects named 'meditations' in your servlet -->
   <h2 style="text-align: center; font-size: 45px; color: red;">How to do Mantra Meditation</h2><br></br>
   <<c:forEach var="mantraMeditation" items="${mantraMeditations}">
        <div class="image-container">
            <h2>${mantraMeditation.heading}</h2>
            <p>${mantraMeditation.steps}</p>
            <img src="${mantraMeditation.links}" width="550px" height="400px" alt="${mantraMeditation.steps}">
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
