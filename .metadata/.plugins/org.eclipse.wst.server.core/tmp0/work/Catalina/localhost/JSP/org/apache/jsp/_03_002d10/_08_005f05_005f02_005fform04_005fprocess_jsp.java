/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.109
 * Generated at: 2022-03-10 09:23:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._03_002d10;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _08_005f05_005f02_005fform04_005fprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("utf-8"); 
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Form Processing</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      com.dto.Member memb = null;
      memb = (com.dto.Member) _jspx_page_context.getAttribute("memb", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (memb == null){
        memb = new com.dto.Member();
        _jspx_page_context.setAttribute("memb", memb, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("memb"), request);
      out.write("\r\n");
      out.write("id : ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dto.Member)_jspx_page_context.findAttribute("memb")).getId())));
      out.write("<br>\r\n");
      out.write("pw : ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dto.Member)_jspx_page_context.findAttribute("memb")).getPasswd())));
      out.write("<br>\r\n");
      out.write("name : ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dto.Member)_jspx_page_context.findAttribute("memb")).getName())));
      out.write("<br>\r\n");
      out.write("phone : ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dto.Member)_jspx_page_context.findAttribute("memb")).getPhone1())));
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dto.Member)_jspx_page_context.findAttribute("memb")).getPhone2())));
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dto.Member)_jspx_page_context.findAttribute("memb")).getPhone3())));
      out.write("<br>\r\n");
      out.write("sex : ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dto.Member)_jspx_page_context.findAttribute("memb")).getSex())));
      out.write("<br>\r\n");
      out.write("hobby : \r\n");
      out.write("\t");

         String[] hobby = memb.getHobby();
         for(int i=0;i<hobby.length;i++){
             if(hobby[i] != null){
                 out.write(hobby[i]);
                 if(i != (hobby.length-1)) out.write(", ");
             }
         }
     
     
      out.write("<br>\r\n");
      out.write("comment : ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.dto.Member)_jspx_page_context.findAttribute("memb")).getComment())));
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
