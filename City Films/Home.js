var btn = document.querySelector('button'),
    clicked = false,
    spany = document.querySelectorAll('button span'),
    list = document.querySelectorAll('.list-item');
btn.addEventListener('click',function(){
  if(!clicked){
    clicked = true;
    spany.forEach(function(item){
      return item.classList.toggle('close');
  });
  list.forEach(function(item){
    return item.classList.toggle('active');
  });
    setTimeout(function(){
      clicked = false;
    },1000);
  }
},false);