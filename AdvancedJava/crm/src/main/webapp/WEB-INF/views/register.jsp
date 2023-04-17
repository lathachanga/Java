<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
                integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
                crossorigin="anonymous">

</head>
<body>
   <nav>
      <a href="#">Customer Registration</a>
   </nav>
   <div class="container">
       <div class="row">
            <div class="col-md-5">
                  <div class="card">
                      <div class="card-header"></div>
                       <div class="card-body">
                           <form  action="save" method="post" modelAttribute="custBean">
                               <div class="form-group">
                                      <input type="text" class="form-control" path="name" placeholder="Username"/> 
                               </div>
                               <div class="form-group">
                                      <input type="text" class="form-control" path="email" placeholder="Email"/> 
                               </div>
                               <div class="form-group">
                                        <input type="text" class="form-control" path="password" placeholder="Password"/> 
                               </div>
                               <div class="form-group">
                                     <input type="text" class="form-control" path="mobile" placeholder="Mobile"/> 
                               </div>
                               <div class="form-group">
                                     <input type="submit" class="btn btn-success" value="Registration"/> 
                               </div>
                           </form>
                       </div>
                  </div>
            </div>
     
       </div>
   
   </div>
</body>
</html>