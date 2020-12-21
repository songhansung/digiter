
var rollingNewsInterval;
var rollingTimesquareInterval;

function startRollingNews(){
    rollingNewsInterval = setInterval(function(){
        if(!$('.rolling_news .rolling_text').is(':animated')){
            $('.rolling_news .rolling_text').first().animate({'margin-top':'-20px'},900,function(){
            $(this).detach().appendTo('.rolling_news').removeAttr('style');
            })
        }
    }, 1000);
}
function startRollingTimesquare(){
    rollingTimesquareInterval = setInterval(function(){
        if(!$('.timesquare_rolling .card').is(':animated')){
            $('.timesquare_rolling .card').first().animate({'margin-left':'-281px'},300,function(){
            $(this).detach().appendTo('.timesquare_rolling').removeAttr('style');
            })
        }
    }, 2000)
}
$(function(){
    // 화면 로딩 완료후 연합뉴스 롤링
    startRollingTimesquare()
    startRollingNews();
    $('.rolling_news .rolling_text').hover(function(){
        //롤링중지
        clearInterval(rollingNewsInterval);
    },function(){
        //롤링재시작
        startRollingNews();
    })

    $('.sc_timesquare').hover(function(){
        clearInterval(rollingTimesquareInterval)
    },function(){
        startRollingTimesquare();
    })
    $('.news_button.right').click(function(e){
        e.preventDefault();
        if(!$('.timesquare_rolling .card').is(':animated')){
            $('.timesquare_rolling .card').first().animate({'margin-left':'-281px'},300,function(){
            $(this).detach().appendTo('.timesquare_rolling').removeAttr('style');
            })
        }
    })
    $('.news_button.left').click(function(e){
        e.preventDefault();
        if(!$('.timesquare_rolling .card').is(':animated')){
            $('.timesquare_rolling .card').last().detach().prependTo('.timesquare_rolling').css('margin-left','-281px');
            $('.timesquare_rolling .card').first().animate({'margin-left':'0px'},300);
        }
    })
})