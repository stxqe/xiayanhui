function initDeviceType() {
	$.ajax({
		type : 'get',
		url : '/bsd/deviceType/list',
		async : false,
		success : function(data) {
			var select = $("#deviceTypeId");
			for (var i = 0; i < data.length; i++) {
				var v = data[i];
				select.append("<option value='" + v.id + "'>" + v.name + "</option>")
			}
		}
	});
}
function initVandor() {
	$.ajax({
		type : 'get',
		url : '/bsd/Vandor/list',
		async : false,
		success : function(data) {
			var select = $("#vandorId");
			for (var i = 0; i < data.length; i++) {
				var v = data[i];
				select.append("<option value='" + v.id + "'>" + v.shortName + "</option>")
			}
		}
	});
}

function initDict() {
	$.ajax({
		type : 'get',
		url : '/sys/Dict/list',
		async : false,
		success : function(data) {
			var select = $("#dictId");
			for (var i = 0; i < data.length; i++) {
				var v = data[i];
				select.append("<option value='" + v.id + "'>" + v.label + "</option>")
			}
		}
	});
}