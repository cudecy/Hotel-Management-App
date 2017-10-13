/**
 * Created by Longbridge PC on 9/26/2017.
 */

function login(module){
    alert("login is working");
    alert("module is: "+module);
    var getData = {"module": module};
    $.ajax({
        url: "/login",
        type: 'GET',
        async: true,
        data: getData,
        success: function (data) {
            console.log("successful");
            $("#loginForm").html(data);
        },
        error: function () {
            console.log("an error has occured");
        }
    });
}
