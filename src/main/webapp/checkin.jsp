<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>checkIn</title>
    <link rel="stylesheet" href="./parkingnavbar.css">
    <link rel="stylesheet" href="./checkin.css">
</head>
<body>
    <nav>
        <h1><span class="one" style="color: rgb(21, 133, 137);">Educa</span> 
            <span class="two" style="color: rgb(199, 131, 20);">Parking</span>   Space</h1>
            <ul>
                <li><a href="/">Home</a></li>
                <li><a href="checkin">CheckIn</a></li>
                <li><a href="checkout">CheckOut</a></li>
                <li><a href="display">Display</a></li>
            </ul>
    </nav>
    <section>
        <div id="color">

        </div>
     <div class="maindiv">
        <div class="div1">
           <img src="./Circle-icons-tools.svg.png" alt="">
                    </div>
                    <div class="div2">
                    <form action="addVehicle">
                        <label  class="k" for="">Enter vehicle no:</label>
                        <input name="vehicleNo" required type="text" ><br>
                        <label  for="">Enter vehicle type</label><br>
                        <input name="vehicleType"  required type="text"><br>
                        <label  for="">Enter vehicle model</label><br>
                        <input name="vehicleModel" required type="text" ><br>
                        <label  for="">Enter mobile number</label><br>
                        <input name="mobileNo" required type="text" ><br>
                        <label  for="">Enter customer name</label>
                        <input name="customerName" required type="text" ><br>
                        <button type="submit" >Click here</button>
            
            
                    </form>
                </div>
     </div>
    </section>
</body>
</html>