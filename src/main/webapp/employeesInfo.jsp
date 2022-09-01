<%@ page contentType="text/html; charset=utf-8"%>
<%@ page language="java" pageEncoding="utf-8"%>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html charset=utf-8">
    <script src="../scripts/jquery.min.js" type="text/javascript"></script>
    <link href="../scripts/miniui/themes/default/miniui.css" rel="stylesheet" type="text/css" />
    <script src="../scripts/miniui/miniui.js" type="text/javascript"></script>
</head>
<body>
    <div id="datagrid1" class="mini-datagrid" style="width:700px;height:250px;"
         url="http://localhost:8080/joyyin/employees/getEmployees.do" autoLoad="true" pageSize="4" sizeList="[2,4,8,16]">
        <div property="columns">
            <div type="indexcolumn"></div>
            <div field="loginname" width="120" headerAlign="center" allowSort="true">员工账号</div>
            <div field="name" width="120" headerAlign="center" allowSort="true">姓名</div>
            <div header="工作信息">
                <div property="columns">
                    <div field="dept_name" width="120">所属部门</div>
                    <div field="position_name" width="100">职位</div>
                    <div field="salary" width="100" allowSort="true">薪资</div>
                </div>
            </div>
        </div>
    </div>
    <div>
        <a class="mini-button" onclick="loadData()">GET</a>
    </div>
</body>
<script type="text/javascript">
    mini.parse();
    var grid = mini.get("datagrid1");

    function loadData(){
        $.ajax({
            url:"http://localhost:8080/joyyin/employees/getEmployees.do",
            type:"get",

            success:function(data){
                alert(data);
                grid.reload();
            },
             error: function (jqXHR, textStatus, errorThrown) {
                    alert(jqXHR.responseText);
            }
        });
    }
</script>
</html>