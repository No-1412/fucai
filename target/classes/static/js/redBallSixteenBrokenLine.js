var redBallSixteen = [
    {
        value:eval($("#redBallSixteen").val()),
        color:'#ec4646',
        line_width:2
    }
];

var redBallSixteenChart = new iChart.LineBasic2D({
    render : 'redBallSixteenChat',
    data: redBallSixteen,
    align:'center',
    title : {
        text:'红球16',
        font : '微软雅黑',
        fontsize:10,
        color:'#b4b4b4'
    },
    subtitle : {
        text:'概率区间：'+jsonMaxMinRedBallProbabilityDTO.minRedBallSixteen + "-" + jsonMaxMinRedBallProbabilityDTO.maxRedBallSixteen,
        font : '微软雅黑',
        color:'#b4b4b4'
    },
    width : 300,
    height : 450,
    shadow:true,
    shadow_color : '#202020',
    shadow_blur : 8,
    shadow_offsetx : 0,
    shadow_offsety : 0,
    background_color:'#2e2e2e',
    tip:{
        enable:true,
        shadow:true,
        listeners:{
            //tip:提示框对象、name:数据名称、value:数据值、text:当前文本、i:数据点的索引
            parseText:function(tip,name,value,text,i){
                return "<span style='color:#005268;font-size:20px;'>红球16概率:"+value+"</span>";
            }
        }
    },
    crosshair:{
        enable:true,
        line_color:'#ec4646'
    },
    sub_option : {
        smooth : true,
        label:false,
        hollow:false,
        hollow_inside:false,
        point_size:8
    },
    coordinate:{
        width:200,
        height:350,
        striped_factor : 0.18,
        grid_color:'#4e4e4e',
        axis:{
            color:'#252525',
            width:[0,0,4,4]
        },
        scale:[{
            position:'left',
            start_scale:jsonMaxMinRedBallProbabilityDTO.minRedBallSixteen-0.0005,
            end_scale:jsonMaxMinRedBallProbabilityDTO.maxRedBallSixteen+0.0005,
            scale_space:0.0001,
            scale_size:2,
            scale_enable : false,
            label : {color:'#9d987a',font : '微软雅黑',fontsize:11,fontweight:600},
            scale_color:'#9f9f9f'
        },{
            position:'bottom',
            label : {color:'#9d987a',font : '微软雅黑',fontsize:11,fontweight:600},
            scale_enable : false
        }]
    }
});
//利用自定义组件构造左侧说明文本
redBallSixteenChart.plugin(new iChart.Custom({
    drawFn:function(){
        //计算位置
        var coo = redBallSixteenChart.getCoordinate(),
            x = coo.get('originx'),
            y = coo.get('originy'),
            w = coo.width,
            h = coo.height;
        //在左上侧的位置，渲染一个单位的文字
        redBallSixteenChart.target.textAlign('start')
            .textBaseline('bottom')
            .textFont('600 11px 微软雅黑')
            .fillText('y',x-40,y-12,false,'#9d987a')
            .textBaseline('top')
            .fillText('x',x+w+12,y+h+10,false,'#9d987a');

    }
}));
//开始画图
redBallSixteenChart.draw();