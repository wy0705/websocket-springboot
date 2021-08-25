
function Fun1() {
    console.log("aaaa");
    var ul= document.getElementsByClassName("content")[0];


    var li = document.createElement("li");
    li.className = 'sdz';
    ul.appendChild(li);

    var a = document.createElement("button");
    a.type="submit";
    li.appendChild(a);

    var lia = document.createElement("div")
    lia.className = 'a_friend';
    a.appendChild(lia);

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





