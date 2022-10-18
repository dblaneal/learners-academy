
<script type="text/javascript">
/**
 * This js file is responsible for 
 *	-sending ajax request and getting all related subject as per selected class.
 * 	-generate drop down and show all subject info in it.
 *	-dynamically generate text box and remove button  when user click on add button 
 *		and display user selected class & subject on it
 *  -removes generated textbox when user click on remove button.
 */ 
 
 $(function () {  
   
    // remove the textfield from the page
    $("body").on("click", ".remove", function () {  
        $(this).closest("div").remove();  
        $('#selectedClassId').val("");
    });  
    
    // adding class and subject for student
	$("#buttonAddSubject").bind("click", function () {  
		var textString = $('#selectedClassId').val().trim();
		var classValue = $( "#classAvailable option:selected" ).val();
	
		if (textString == ""){ // prevent student to enroll only in one class & subject.
			$('#selectedClassId').val($('#classAvailable option:selected').val());
	        var div = $("<div />"); 
	        var valueForTextbox =  $( "#avbl-class option:selected" ).text()+"/ "+$( "#classAvailable option:selected" ).text();
	        div.html(generateTextbox("subjectNameTextbox", valueForTextbox));  
	        $("#subjectsTextBoxContainer").append(div);  
		}else{
			alert("Each student is only allowed to assign in single class");
		}
		
    });  
	
    //assigining classes and subjects for teacher
	$("#buttonAddSubjectForTeacher").bind("click", function () {  
		var div = $("<div />"); 
        var valueForTextbox =  $( "#avbl-class option:selected" ).text()+"/ "+$( "#classAvailable option:selected" ).text();
        div.html(generateTextbox("subjectNameTextbox", valueForTextbox));  
        $("#subjectsTextBoxContainer").append(div);  
    }); 
	
	//adds available subjects drop down	
	$('#classAvailable').change(function(){
         var selectedClass = $('#classAvailable').val();
		$.ajax({
			type : 'GET',
			headers : {
				Accept : "application/json; charset=utf-8",
					"Content-Type" : "application/json; charset=utf-8"
				},
				url : '../ajax?id='+selectedClass,
				success : function(result) {
					var subjects = $.parseJSON(result);
					generateDropdown(subjects);
				}
			});
     }).change();
     
    
});  
// send request for getting info about all assigned classes and subjects of teacher.
// on result generate and display text box dianamically.
 $(document).ready(function(){
		
		var baseUrl = $(location).attr("href") 
		var action = baseUrl.split('/').pop().split('?')[0];
		var id = baseUrl.substring(baseUrl.lastIndexOf('=') + 1);
		
		if (action == 'edit'){
			$.ajax({
			type : 'GET',
			headers : {
				Accept : "application/json; charset=utf-8",
					"Content-Type" : "application/json; charset=utf-8"
				},
				url : '../ajaxTeacherClass?id='+id,
				success : function(result) {
					var subjects = $.parseJSON(result);
					if (!jQuery.isEmptyObject(subjects)){
						for (const val of subjects){
							 var valueForTextbox =  val.subjectName +"/ " + val.className;
							 appendTextbox(valueForTextbox);
       					 }
					}
				}
			});
		}
	});
function generateTextbox(textboxName, value) {  
    return '<input name = "' + textboxName + '" type="text" value = "' + value + '" readonly/> ' +  
            '<input type="button" value="Remove" class="remove" />'  
}  

function appendTextbox(valueForTextbox){
	var div = $("<div />"); 
		 div.html(generateTextbox("subjectNameTextbox", valueForTextbox));  
		 $("#subjectsTextBoxContainer").append(div);  
}

// generating dropdown
function generateDropdown(values){
	var select = document.createElement("select");
	select.name = "avbl-class";
	select.id = "avbl-class";
	
	for (const val of values)
    {
        var option = document.createElement("option");
        option.value = val.subjectId;
        var sName = val.subjectName
        option.text = sName.charAt(0).toUpperCase() + sName.slice(1);
        select.appendChild(option);
    }
    
    var label = document.createElement("label");
    label.innerHTML = "Available Subjects";
    label.htmlFor = "avbl-class";
    
    $('#result').empty().append(label).append("<br>").append(select);
}
 

</script>