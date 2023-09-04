var x = document.querySelector('button');
x.addEventListener('click',function(){
    var con = document.querySelector('#content');
    var c = document.querySelector('#city');
    var r = new XMLHttpRequest(); 
    r.open("GET", "https://dummyjson.com/users");
    r.send();
    r.onreadystatechange = function(){
        if(r.readyState == 4 && r.status==200){
            console.log(r.responseText);
            var jsonDate = JSON.parse(r.responseText);
            console.log();
            for(let user of jsonDate.users){
                con.append (`${user.id} | ${user.firstName} | ${user.email} | ${user.phone}`);
                var option = document.createElement('option');
                option.textContent=`${user.address.address} | ${user.phone}`   
                c.appendChild(option);
            }
          
        }
    }
    console.log('dfdsf');
    console.log('dfdsf');
    console.log('dfdsf');
    console.log('dfdsf');
   
  

});