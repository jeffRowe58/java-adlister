<%--
  Created by IntelliJ IDEA.
  User: jeffreyrowe
  Date: 7/1/21
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Pizza Order</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    </head>
    <body>

    <h1 class="jumbotron jumbotron-fluid bg-warning d-flex justify-content-center align-items-center">Pizza</h1>
        <div class="container d-flex justify-content-between">
            <div class="card">
                <form action="pizza-order" method="post">
                    <label for="size">Select Pizza Size:</label>
                    <select name="size" id="size">
                        <option value="x-large">XL</option>
                        <option value="large">L</option>
                        <option value="medium">M</option>
                        <option value="small">S</option>
                    </select><br>
                    <label for="crust">Select a Crust:</label>
                    <select name="crust" id="crust">
                        <option value="deep-dish">Deep Dish</option>
                        <option value="regular">Regular</option>
                        <option value="thin">Thin</option>
                    </select><br>
                    <label for="sauce">Choose a Sauce:</label>
                    <select name="sauce" id="sauce">
                        <option value="regular">Regular</option>
                        <option value="bbq">BBQ</option>
                        <option value="alfredo">Alfredo</option>
                    </select><br>
                    <span>Toppings:</span><br>
                    <label for="topping1">Cheese</label>
                    <input id="topping1" type="checkbox" name="toppings" value="cheese">
                    <label for="topping2">Onion</label>
                    <input id="topping2" type="checkbox" name="toppings" value="onion">
                    <label for="topping3">Green Pepper</label>
                    <input id="topping3" type="checkbox" name="toppings" value="green-pepper">
                    <label for="topping4">Pepperoni</label>
                    <input id="topping4" type="checkbox" name="toppings" value="pepperoni">
                    <label for="topping5">Chicken</label>
                    <input id="topping5" type="checkbox" name="toppings" value="chicken"><br>
                    <span>Delivery Address:</span><br>
                    <label for="street">Street:</label>
                    <input type="text" id="street" name="street"><br>
                    <label for="city">City:</label>
                    <input type="text" id="city" name="city"><br>
                    <button id="button" type="submit">Cook It</button>
                </form>
            </div>
            <div id="review">

            </div>
        </div>
    <script>

    </script>
    </body>
</html>
