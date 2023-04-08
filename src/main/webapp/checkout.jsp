<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>checkout</title>
    <link rel="stylesheet" href="./parkingnavbar.css">
    <link rel="stylesheet" href="./checkout.css">
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
        <div class="displaysection">
            <form action="getbyid">
                <input type="text" name="id" placeholder="enter id">
                <input class="rrr" type="submit">
            </form>
            <table>
                <thead>
                    <th>Id</th>
                    <th>VehicleNo</th>
                    <th>VehicleType</th>
                    <th>VehicleModel</th>
                    <th>MobileNo</th>
                    <th>CustomerName</th>
                    <th>CheckInTime</th>
                </thead>
                <tbody id="tdata">
                    <td>${id}</td>
                    <td>${vNo}</td>
                    <td>${vType}</td>
                    <td>${vModel}</td>
                    <td>${mobileno}</td>
                    <td>${customername}</td>
                    <td>${checkintime}</td>

                </tbody>
            </table>
        </div>
        <div class="checkout">
            <h3>checkout time :${checkouttime}</h3>
            <h4 >time :${duration} hrs</h4>
            <p>cost :rs ${amount}</p>
            <a href="checkoutsuccessfully">click here to checkout</a>
        </div>
    </section>
</body>
</html>