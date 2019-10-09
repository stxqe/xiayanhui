Date.prototype.Format = function (fmt) { //author: meizz 
	    var o = {
	        "M+": this.getMonth() + 1, //月份 
	        "d+": this.getDate(), //日 
	        "h+": this.getHours(), //小时 
	        "m+": this.getMinutes(), //分 
	        "s+": this.getSeconds(), //秒 
	        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
	        "S": this.getMilliseconds() //毫秒 
	    };
	    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	    for (var k in o)
	    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
	    return fmt;
}

var height = $(window).height()-65;
/*
 * 负荷
 */
function electricTableInit(electricData){


	  $('#dt-table').bootstrapTable('destroy').bootstrapTable({
           data:electricData,
           dataField: 'rows',
           striped: true,                      //是否显示行间隔色
           cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
           sortable: false,                     //是否启用排序
           sortOrder: "asc",                   //排序方式
           queryParams: null,					//传递参数（*）
           showColumns: true,                  //是否显示所有的列
           clickToSelect: true,                //是否启用点击选中行
           height: height,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
           uniqueId: "id",                     //每一行的唯一标识，一般为主键列
           detailView: false,                   //是否显示父子表
           columns: [
           [{
              	field: 'id',
               title: '序号',
               rowspan: 2,
               sortable: true,
               align: 'center',
               valign: 'middle'
           }, {
               field: 'name',
               title: '监测点',
               rowspan: 2,
    		    align: 'center',
               valign: 'middle'
           }, {
               field: 'status',
               title: '状态',
               rowspan: 2,
    		    align: 'center',
               valign: 'middle'
           }, {
               title: '有功负荷(KW)',
               colspan: 4,
               align: 'center'
           }, {
               title: '无功负荷(KW)',
               colspan: 4,
               align: 'center'
           }, {
               field: 'date',
               title: '抄表时间',
               rowspan: 2,
    		    align: 'center',
               valign: 'middle'  
           }],
           [{
                 field: 'P',
                 title: '总',
                 sortable: true,
                 align: 'center'
            }, {
                 field: 'Pu',
                 title: 'Pu',
                 sortable: true,
                 align: 'center'
            },{
                 field: 'Pv',
                 title: 'Pv',
                 sortable: true,
                 align: 'center'
            },{
                 field: 'Pw',
                 title: 'Pw',
                 sortable: true,
                 align: 'center'
            },{
               field: 'Q',
               title: '总',
               sortable: true,
               align: 'center'
          }, {
               field: 'Qu',
               title: 'U相',
               sortable: true,
               align: 'center'
          },{
               field: 'Qv',
               title: 'V相',
               sortable: true,
               align: 'center'
          },{
               field: 'Qw',
               title: 'W相',
               sortable: true,
               align: 'center'
          }
           ]]
       });
}


/*示数表格*/
function indicateTableInit(indicateData) {

        $('#dt-table').bootstrapTable('destroy').bootstrapTable({
        	data:indicateData,
            dataField: 'rows',
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            showColumns: true,                  //是否显示所有的列
            clickToSelect: true,                //是否启用点击选中行
            height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "id",                     //每一行的唯一标识，一般为主键列
            detailView: false,                   //是否显示父子表
            columns: [
            [{
				field: 'id',
                title: '序号',
                sortable: true,
                align: 'center',
                valign: 'middle'
            }, {
                field: 'name',
                title: '监测点',
     		    align: 'center',
                valign: 'middle'  	
            }, {
                field: 'status',
                title: '状态',
     		    align: 'center',
                valign: 'middle'
            }, {
            	field: 'Ep',
                title: '示数(kVh)',
                align: 'center',
                valign: 'middle'  
            }, {
                field: 'date',
                title: '抄表时间',
     		    align: 'center',
                valign: 'middle'  
            }]]
        });
}




/*电压表格*/
function voltageTableInit (voltageData) {

        $('#dt-table').bootstrapTable('destroy').bootstrapTable({
        	data: voltageData,
            dataField: 'rows',
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            showColumns: true,                  //是否显示所有的列
            clickToSelect: true,                //是否启用点击选中行
            height: height,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
            detailView: false,                   //是否显示父子表
            columns: [
            [{
            	field: 'id',
                title: '序号',
                sortable: true,
                align: 'center',
                valign: 'middle'
            }, {
                field: 'name',
                title: '监测点',
     		    align: 'center',
                valign: 'middle'   	
            }, {
                field: 'status',
                title: '状态',
     		    align: 'center',
                valign: 'middle'
            },{
                field: 'Va',
                title: 'A相电压',
                sortable: true,
                align: 'center'
           }, {
                field: 'Vb',
                title: 'B相电压',
                sortable: true,
                align: 'center'
           },{
                field: 'Vc',
                title: 'C相电压',
                sortable: true,
                align: 'center'
           }, {
               field: 'date',
               title: '抄表时间',
    		   align: 'center',
               valign: 'middle'  
           }]]
        });
  }


/*电流表格*/
function currentTableInit(currentData) {
        $('#dt-table').bootstrapTable('destroy').bootstrapTable({
        	data: currentData,
            dataField: 'rows',
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            showColumns: true,                  //是否显示所有的列
            clickToSelect: true,                //是否启用点击选中行
            height: height,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
            detailView: false,                   //是否显示父子表
            columns: [
            [{
             	field: 'id',
                title: '序号',
                sortable: true,
                align: 'center',
                valign: 'middle'
            }, {
                field: 'name',
                title: '监测点',
     		    align: 'center',
                valign: 'middle'
            }, {
                field: 'status',
                title: '状态',
     		    align: 'center',
                valign: 'middle'
            },{
                field: 'Ia',
                title: 'A相电流',
                sortable: true,
                align: 'center'
           }, {
                field: 'Ib',
                title: 'B相电流',
                sortable: true,
                align: 'center'
           },{
                field: 'Ic',
                title: 'C相电流',
                sortable: true,
                align: 'center'
           }, {
               field: 'date',
               title: '抄表时间',
    		   align: 'center',
               valign: 'middle'  
           }]]
        });
};


/*功率因素表格*/
function factorTableInit(factorData) {
        $('#dt-table').bootstrapTable('destroy').bootstrapTable({
        	data: factorData,
            dataField: 'rows',
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            showColumns: true,                  //是否显示所有的列
            clickToSelect: true,                //是否启用点击选中行
            height: height,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
            detailView: false,                   //是否显示父子表
            columns: [
            [{
             	field: 'id',
                title: '序号',
                rowspan: 2,
                sortable: true,
                align: 'center',
                valign: 'middle'
            }, {
                field: 'name',
                title: '监测点',
                rowspan: 2,
     		    align: 'center',
                valign: 'middle'
            }, {
                field: 'status',
                title: '状态',
                rowspan: 2,
     		    align: 'center',
                valign: 'middle'
            }, {
                title: '功率因数',
                colspan: 2,
                align: 'center'
            }, {
                field: 'date',
                title: '抄表时间',
                rowspan: 2,
     		    align: 'center',
                valign: 'middle'  
            }],
            [{
                  field: 'standardCos',
                  title: '标准',
                  sortable: true,
                  align: 'center'
             }, {
                  field: 'cos',
                  title: '功率因数',
                  sortable: true,
                  align: 'center'
             }
            ]]
        });
};
    
/*温度*/
function tempTableInit (tempData) {

        $('#dt-table').bootstrapTable('destroy').bootstrapTable({
        	data: tempData,
            dataField: 'rows',
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            showColumns: true,                  //是否显示所有的列
            clickToSelect: true,                //是否启用点击选中行
            height: height,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
            detailView: false,                   //是否显示父子表
            columns: [
            [{
            	field: 'id',
                title: '序号',
                sortable: true,
                align: 'center',
                valign: 'middle'
            }, {
                field: 'name',
                title: '监测点',
     		    align: 'center',
                valign: 'middle'   	
            }, {
                field: 'status',
                title: '状态',
     		    align: 'center',
                valign: 'middle'
            },{
                field: 'temp',
                title: '温度',
                sortable: true,
                align: 'center'
           },  {
               field: 'date',
               title: '抄表时间',
    		   align: 'center',
               valign: 'middle'  
           }]]
        });
  }
