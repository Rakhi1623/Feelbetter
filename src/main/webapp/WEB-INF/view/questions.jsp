<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Meditation menu</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/.css">
    <style>
        input {
            background-color: blue;
            color: white;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <form action="questionsubmitt" method="POST">
           <h1>Self Assessment Questions</h1>

           <!-- Question 1 -->
  <h2>${questions[0].questions}</h2>         
    <input type="hidden" name="question1" value="${questions[0].id}" >
              <input type="radio" name="answer1" value="Never" checked> Never
                   <input type="radio" name="answer1" value="Occasionally"> Occasionally
                   <input type="radio" name="answer1" value="Sometimes"> Sometimes
                   <input type="radio" name="answer1" value="Often"> Often
                   <input type="radio" name="answer1" value="Always"> Always

           <!-- Question 2 -->
  <h2>${questions[1].questions}</h2>                     
   <input type="hidden" name="question2" value="${questions[1].id}" >

              <input type="radio" name="answer2" value="Never" checked> Never
                   <input type="radio" name="answer2" value="Occasionally"> Occasionally
                   <input type="radio" name="answer2" value="Sometimes"> Sometimes
                   <input type="radio" name="answer2" value="Often"> Often
                   <input type="radio" name="answer2" value="Always"> Always

 <!-- Question 3 -->
             <h2>${questions[3].questions}</h2>
            <input type="hidden" name="question3" value="${questions[2].id}" >

              <input type="radio" name="answer3" value="Never" checked> Never
                   <input type="radio" name="answer3" value="Occasionally"> Occasionally
                   <input type="radio" name="answer3" value="Sometimes"> Sometimes
                   <input type="radio" name="answer3" value="Often"> Often
                   <input type="radio" name="answer3" value="Always"> Always


                    <!-- Question 4 -->
                              <h2>${questions[3].questions}</h2>
                                <input type="hidden" name="question4" value="${questions[3].id}" >

                                 <input type="radio" name="answer4" value="Never" checked> Never
                                      <input type="radio" name="answer4" value="Occasionally"> Occasionally
                                      <input type="radio" name="answer4" value="Sometimes"> Sometimes
                                      <input type="radio" name="answer4" value="Often"> Often
                                      <input type="radio" name="answer4" value="Always"> Always



                            	           <!-- Question 5-->
                           						   <h2>${questions[4].questions}</h2>
                                                            <input type="hidden" name="question5" value="${questions[4].id}" >

                                                    <input type="radio" name="answer5" value="Never" checked> Never
                                                         <input type="radio" name="answer5" value="Occasionally"> Occasionally
                                                         <input type="radio" name="answer5" value="Sometimes"> Sometimes
                                                         <input type="radio" name="answer5" value="Often"> Often
                                                         <input type="radio" name="answer5" value="Always"> Always

                                                          <!-- Question 6 -->
                           									   <h2>${questions[5].questions}</h2>
                                                                               <input type="hidden" name="question6" value="${questions[5].id}" >

                                                                       <input type="radio" name="answer6" value="Never" checked> Never
                                                                            <input type="radio" name="answer6" value="Occasionally"> Occasionally
                                                                            <input type="radio" name="answer6" value="Sometimes"> Sometimes
                                                                            <input type="radio" name="answer6" value="Often"> Often
                                                                            <input type="radio" name="answer6" value="Always"> Always


                                                                     <!-- Question 7 -->
                             													 <h2>${questions[6].questions}</h2>
                                                                                          <input type="hidden" name="question7" value="${questions[6].id}" >

                                                                                  <input type="radio" name="answer7"  value="Never" checked> Never
                                                                                       <input type="radio" name="answer7" value="Occasionally"> Occasionally
                                                                                       <input type="radio" name="answer7" value="Sometimes"> Sometimes
                                                                                       <input type="radio" name="answer7" value="Often"> Often
                                                                                       <input type="radio" name="answer7" value="Always"> Always

                                                                                        <!-- Question 8 -->
                           															   <h2>${questions[7].questions}</h2>
                                                                                                             <input type="hidden" name="question8" value="${questions[7].id}" >

                                                                                                     <input type="radio" name="answer8" value="Never" checked> Never
                                                                                                          <input type="radio" name="answer8" value="Occasionally"> Occasionally
                                                                                                          <input type="radio" name="answer8" value="Sometimes"> Sometimes
                                                                                                          <input type="radio" name="answer8" value="Often"> Often
                                                                                                          <input type="radio" name="answer8" value="Always"> Always


                                                                                                           <!-- Question 9 -->
                                                                                                                                               <h2>${questions[8].questions}</h2>

                                                                                                                                <input type="hidden" name="question9" value="${questions[8].id}" >

                                                                                                                        <input type="radio" name="answer9" value="Never" checked> Never
                                                                                                                             <input type="radio" name="answer9" value="Occasionally"> Occasionally
                                                                                                                             <input type="radio" name="answer9" value="Sometimes"> Sometimes
                                                                                                                             <input type="radio" name="answer9" value="Often"> Often
                                                                                                                             <input type="radio" name="answer9" value="Always"> Always


                                                                                                                              <!-- Question 10 -->
                                                                                                                                        <                              <h2>${questions[9].questions}</h2>

                                                                                                                                                   <input type="hidden" name="question10" value="${questions[9].id}" >

                                                                                                                                           <input type="radio" name="answer10" value="Never" checked> Never
                                                                                                                                                <input type="radio" name="answer10" value="Occasionally"> Occasionally
                                                                                                                                                <input type="radio" name="answer10" value="Sometimes"> Sometimes
                                                                                                                                                <input type="radio" name="answer10" value="Often"> Often
                                                                                                                                                <input type="radio" name="answer10" value="Always"> Always






 <!--<input type="hidden" name="customer_id" value="${customer.customerId}">-->


           <br>
           <input type="submit" value="Submit">
       </form>
</body>

</html>
