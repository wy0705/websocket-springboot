function setCookie(cname,cvalue,exdays){
        var d = new Date();
        d.setTime(d.getTime()+(exdays*24*60*60*1000));
        var expires = "expires="+d.toGMTString();
        document.cookie = cname+"="+cvalue+"; "+expires;
    }
function getCookie(cname){
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i=0; i<ca.length; i++) {
        var c = ca[i].trim();
        if (c.indexOf(name)==0) { return c.substring(name.length,c.length); }
    }
    return "";
}
function checkCookie(){
    var user=getCookie("userxxx");
    if (user!=""){
        alert("欢迎 " + user + " 再次访问");
    }
    else {
        user = prompt("请输入你的名字:","");
        if (user!="" && user!=null){
            setCookie("userxxx",user,30);
        }
    }
}

function Mes() {
    $.ajax({
        url: '/UserList',
        type: 'POST',
        data: {
        },
        success: function (res) {




        },
        error: function (res) {

        }
    })
}



function Fun1() {
    console.log("aaaa");
    var ul= document.getElementsByClassName("content")[0];


    var list1 = document.createElement("li");
    list1.className = 'sdz';
    ul.appendChild(list1);

    var abutton = document.createElement("button");
    abutton.type="submit";
    abutton.className = "a_Btn";
    list1.appendChild(abutton);

    var lia = document.createElement("div")
    lia.className = 'a_friend';
    abutton.appendChild(lia);

    var img = document.createElement("img");
    img.className = 'head_portrait';
    img.src = './img/aaa.webp'
    lia.appendChild(img);

    var lic = document.createElement("div");
    lic.className = 'name';
    lic.append("史迪仔");
    lia.appendChild(lic);

    var lid = document.createElement("div");
    lid.className = 'this_time';
    lid.append("4-12-15:10");
    lia.appendChild(lid);

}
window.onload = function (){
    Fun1();
    Fun1();
};



checkCookie();



