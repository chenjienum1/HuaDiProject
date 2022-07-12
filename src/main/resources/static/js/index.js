//获取所有承载图片的li和所有承载焦点的li
var imgs=document.querySelectorAll('.banner>ul>li')
        var points=document.querySelectorAll('.banner>ol>li')
        var banner=document.querySelector('.banner')
        console.log(imgs.length)

        //准备一个变量，表示当前第几章，默认是0
        var index=0

        //书写一个切换一张的函数
        //约定：
        //参数为true。切换下一张
        //参数为false，切换上一张
        //参数为数字，切换到索引这一张
        function changeOne(type){
            //1、让当前这张消失
            imgs[index].className=''
            points[index].className=''

            //2、根据type传递来的参数，确定切换哪一张
            if(type===true){
                index++
            }else if(type===false){
                index--
            }else{
                index=type
            }

            if(index>=imgs.length){
                index=0
            }
            if(index<0){
                index=imgs.length-1
            }

            //3、让改变后的这一张显示出来
            imgs[index].className='active'
            points[index].className='act'
        }

        //4、设定点击事件
        banner.onclick=function(e){
            if(e.target.className==='left'){
                //点击左箭头
                changeOne(false)
            }

            //点击右箭头
            if(e.target.className ==='right'){
                changeOne(true)
            }

            //点击焦点
            if(e.target.dataset.name ==='point'){
                console.log("je")
                //dataset获得自定义的值
                //拿到记录的索引
                var i=e.target.dataset.i - 0
                changeOne(i)
            }
        }

        //自动转换功能
        setInterval(function(){
            //切换到下一张
            changeOne(true)
        },5000)