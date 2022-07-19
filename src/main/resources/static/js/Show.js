var fir= document.getElementById("lfir");
        var sec= document.getElementById("lsec");
        var thi= document.getElementById("lthi");
       var ffir= document.getElementById("first");

       var fsec= document.getElementById("second");
       var sfir= document.getElementById("third");
       var ssec= document.getElementById("fourth");
       var sthi= document.getElementById("fifth");
       var tfir= document.getElementById("sixth");
       var ffircont=document.getElementById("hotspotinfo");
       var fseccont=document.getElementById("affairinfo");
       var sfircont=document.getElementById("fundinfo");
       var sseccont=document.getElementById("assetinfo");
       var sthicont=document.getElementById("sourceinfo");
       var tfircont=document.getElementById("evaluateinfo");



        ffircont.style.display="block";
        fseccont.style.display="none";
        sfircont.style.display="none";
        sseccont.style.display="none";
        sthicont.style.display="none";
        tfircont.style.display="none";



       fir.onmouseover=function()
       {

        if(sec.className=="leftactive")
        {
            sec.className="";
        }
        if(thi.className=="leftactive")
        {
            thi.className="";
        }
        if( fir.className!="leftactive")
        {
            fir.className="leftactive";
            ssec.className="hidden";
            sthi.className="hidden";
            tfir.className="hidden";
            ffir.className="active";
            fsec.className="inactive";
            sfir.className="hidden";
            ffircont.style.display="block";
            fseccont.style.display="none";
            sfircont.style.display="none";
            sseccont.style.display="none";
            sthicont.style.display="none";
            tfircont.style.display="none";
        }




       }
       sec.onmouseover=function()
       {

        if(fir.className=="leftactive")
        {
            fir.className="";
        }
        if(thi.className=="leftactive")
        {
            thi.className="";
        }
        if( sec.className!="leftactive")
        {
            sec.className="leftactive";
            ffir.className="hidden";
            fsec.className="hidden";
            tfir.className="hidden";
            sfir.className="active";
            ssec.className="inactive";
            sthi.className="inactive";
            ffircont.style.display="none";
            fseccont.style.display="none";
            sfircont.style.display="block";
            sseccont.style.display="none";
            sthicont.style.display="none";
            tfircont.style.display="none";
        }

        }





       thi.onmouseover=function()
       {

        if(fir.className=="leftactive")
        {
            fir.className="";
        }
        if(sec.className=="leftactive")
        {
            sec.className="";
        }
        if(thi.className!="leftactive")
        {
            thi.className="leftactive";
            ffir.className="hidden";
            fsec.className="hidden";
            sfir.className="hidden";
            ssec.className="hidden";
            sthi.className="hidden";
            tfir.className="active";
            ffircont.style.display="none";
            fseccont.style.display="none";
            sfircont.style.display="none";
            sseccont.style.display="none";
            sthicont.style.display="none";
            tfircont.style.display="block";
        }

       }

    ffir.onmouseover=function()
    {
        ffir.className="active";
        fsec.className="inactive";
        fseccont.style.display="none";
        ffircont.style.display="block";
    }
    fsec.onmouseover=function()
    {
        fsec.className="active";
        ffir.className="inactive";
        fseccont.style.display="block";
        ffircont.style.display="none";

    }
    sfir.onmouseover=function()
    {
        sfir.className="active";
        ssec.className="inactive";
        sthi.className="inactive";
        sfircont.style.display="block";
        sseccont.style.display="none";
        sthicont.style.display="none";

    }
    ssec.onmouseover=function()
    {
        ssec.className="active";
        sfir.className="inactive";
        sthi.className="inactive";
        sfircont.style.display="none";
        sseccont.style.display="block";
        sthicont.style.display="none";

    }
    sthi.onmouseover=function()
    {
        ssec.className="inactive";
        sfir.className="inactive";
        sthi.className="active";
        sfircont.style.display="none";
        sseccont.style.display="none";
        sthicont.style.display="block";
    }