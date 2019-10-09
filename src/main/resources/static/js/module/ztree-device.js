function getMenuTree() {
	var root = [];
	$.ajax({
		type : 'get',
		url : '/bsd/device/tree',
		contentType : "application/json; charset=utf-8",
		async : false,
		success : function(data) {
			var length = data.length;
			var children = [];
			for (var i = 0; i < length; i++) {
				var d = data[i];
				var node = createNode(d);
				children[i] = node;
			}
			root = children;
		}
	});
	return root;
}


function createNode(d) {
	var id = d['id'];
	var pId = d['parentId'];
	var name = d['name'];
	var child = d['child'];
	var icon = d['icon'];
	var deviceTypeId = d['deviceTypeId'];
	var node = {
		open : false,
		id : id,
		name : name,
		pId : pId,
		deviceTypeId : deviceTypeId,
		icon : '../../../img/icons/' + icon
	};

	if (child != null) {
		var length = child.length;
		if (length > 0) {
			var children = [];
			for (var i = 0; i < length; i++) {
				children[i] = createNode(child[i]);
			}

			node.children = children;
		}

	}
	return node;
}

function getSettting() {
	var setting = {
		async : {
			enable : true,
		},
		data : {
			simpleData : {
				enable : true,
				idKey : "id",
				pIdKey : "pId",
				rootPId : 0
			}
		},
		callback : {
			onClick: zTreeOnClick
		}
	};

	return setting;
}

function showFirstNode(){
	var zTree = $.fn.zTree.getZTreeObj("treeDevice");
    var nodes = zTree.getNodes();
	if (nodes.length>0) {
		for(var i=0;i<nodes.length;i++){
			zTree.expandNode(nodes[i], true, false, false);//展开第一级节点
		}
	}
}

