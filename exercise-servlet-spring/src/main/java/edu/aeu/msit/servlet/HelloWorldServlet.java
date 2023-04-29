package edu.aeu.msit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import edu.aeu.msit.model.Student;
import edu.aeu.msit.service.LessonService;
import edu.aeu.msit.service.StudentService;


@Configurable
public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 8133715214580601405L;
	@Autowired
	StudentService studentService;
	@Autowired
	LessonService lessonService;
	
	@Override
	public void init() throws ServletException {
		super.init();
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;");
		response.getWriter().println("<h1>Testing Spring Exercise - Integrate into Servlet</h1>");
		
		List<Student> students = studentService.findAll();
		StringBuilder builder = new StringBuilder();
		builder.append("<table>");
		builder.append("	<tr>");
		builder.append("		<th>StudentId</th>");
		builder.append("		<th>First Name</th>");
		builder.append("		<th>Last Name</th>");
		builder.append("	</tr>");

		students.forEach(student -> {
			builder.append("	<tr>");
			builder.append("		<td>" + student.getStu_id() + "</td>");
			builder.append("		<td>" + student.getStu_first_name() + "</td>");
			builder.append("		<td>" + student.getStu_last_name() + "</td>");
			builder.append("	</tr>");
		});
		builder.append("</table>");
		response.getWriter().println(builder.toString());
	}
}