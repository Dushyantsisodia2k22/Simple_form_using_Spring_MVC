<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Confirm Page</title>
</head>
<body>

<form action="resultPage"/>

<div align="center">
    <h2>Confirm Your Entered Details</h2>
    <br><br>

    <p> Entered Name : ${userInfo.userName}</p>
    <br><br>

    <p> Entered Last Name : ${userInfo.lastName}</p>
    <br><br>

    <p>Entered Gender : ${userInfo.gender}</p>
    <br><br>

    <p>Entered Age : ${userInfo.age}</p>
    <br><br>

    <input type="submit" value="Confirm"/>

</div>

</body>
</html>