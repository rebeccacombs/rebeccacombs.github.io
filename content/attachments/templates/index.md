I want to try my hand at as many problems as I can in this book: 

![[Pasted image 20240520153715.png|200]]

<%*
const headers = ["Name", "Created", "Completed"];
const tableValues = DataviewAPI.pages('#problems')
.sort(p => p.file.ctime,  'desc')
.map(p =>[p.file.link, p.file.ctime, p.completed]);
const myTable = DataviewAPI.markdownTable(headers, tableValues);
-%>
<% myTable %>