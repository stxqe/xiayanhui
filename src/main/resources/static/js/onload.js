var ifr = document.getElementById('main');

function iframLoad(ifr) {
    //解决打开高度太高的页面后再打开高度较小页面滚动条不收缩
    ifr.style.height = 0;
/*    var iDoc = ifr.contentDocument || ifr.document;
    var height = calcPageHeight(iDoc);*/
    var height1 = ifr.contentWindow.document.documentElement.scrollHeight;
    var height2 = document.body.clientHeight;
    /*    if(height1 <= 600){
            height1 += 300;
        }
        else*/
    height1 +=85;
    ifr.style.height = height1 + 'px';


}
function drugMsgLoad() {
/*    $contents = $("#main").contents();*/
    $contents = $(window.parent.document).contents();
    ifr = $contents.find("#main")[0];
        iframLoad(ifr);

}




